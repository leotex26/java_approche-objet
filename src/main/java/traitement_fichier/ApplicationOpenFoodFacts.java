package traitement_fichier;

import traitement_fichier.model.Marque;
import traitement_fichier.model.Message;
import traitement_fichier.model.Produit;
import traitement_fichier.service.ImportProduit;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;



public class ApplicationOpenFoodFacts {

  public static void main(String[] args) {
    new ApplicationOpenFoodFacts().start();
  }

  public void start() {

    Scanner scanner = new Scanner(System.in);

    // Charger les produits
    ImportProduit service = new ImportProduit();
    List<Produit> produits = new ArrayList<>();

    try {
      produits = service.all();
    } catch (IOException e) {
      System.out.println("Erreur lors du chargement du fichier.");
      return;
    }

    while (true) {
      System.out.println("\n===== MENU =====");
      System.out.println("1. Rechercher les meilleurs produits pour une marque");
      System.out.println("0. Quitter");
      System.out.print("Choix : ");

      int choix = Integer.parseInt(scanner.nextLine());

      switch (choix) {
        case 1 -> {
          afficherMarque(produits);
          rechercherMeilleursProduitsParMarque(scanner, produits);
        }
        case 0 -> {
          System.out.println("Au revoir !");
          return;
        }
        default -> System.out.println("Choix invalide.");
      }
    }
  }


  private void afficherMarque(List<Produit> produits) {

    // Récupérer les marques distinctes
    HashSet<Marque> marquesSet = new HashSet<>();
    produits.forEach(produit -> marquesSet.add(produit.getMarque()));

    // Transformer en liste triable
    List<Marque> marquesTriees = new ArrayList<>(marquesSet);
    Collections.sort(marquesTriees, Comparator.comparing(Marque::getLibelle));

    // Construire l'affichage
    StringBuilder sb = new StringBuilder();
    for (Marque marque : marquesTriees) {
      sb.append(marque.getLibelle()).append(", ");
    }

    System.out.println("\n--- Marques disponibles ---");
    System.out.println(sb.toString());
  }



  private void rechercherMeilleursProduitsParMarque(Scanner scanner, List<Produit> produits) {

    System.out.print("Entrez le nom de la marque : ");
    String marqueChoisie = scanner.nextLine().trim().toLowerCase();

    List<Produit> filtre = produits.stream()
      .filter(p -> p.getMarque() != null &&
        p.getMarque().getLibelle().toLowerCase().contains(marqueChoisie))
      .sorted(Comparator.comparing(p -> p.getScoreNutritionnel()))
      .toList();

    if (filtre.isEmpty()) {
      System.out.println("Aucun produit trouvé pour cette marque.");
      return;
    }

    System.out.println("\n--- Meilleurs produits pour la marque \"" + marqueChoisie + "\" ---");

    filtre.forEach(p -> {
      System.out.println("Produit : " + p.getNom());
      System.out.println("Score : " + p.getScoreNutritionnel());
      System.out.println("Catégorie : " + p.getCategorie().getLibelle());
      System.out.println("---------------------------");
    });
  }
}
