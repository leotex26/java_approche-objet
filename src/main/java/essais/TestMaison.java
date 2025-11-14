package essais;

import entites.*;

public class TestMaison {
  public static void main(String[] args) {

    Maison maison = new Maison();

    try {
      // Ajout des pieces de l maison
      maison.ajouterPiece(new Chambre(10, 1));
      maison.ajouterPiece(new Chambre(12, 1));
      maison.ajouterPiece(new Cuisine(15, 0));
      maison.ajouterPiece(new SalleDeBain(6, 0));
      maison.ajouterPiece(new Salon(25, 0));
      maison.ajouterPiece(new SalleDeBain(7, 1));
      maison.ajouterPiece(new Chambre(9, 2));


      maison.ajouterPiece(null); // exception normalement

    } catch (NullPointerException e) {
      System.out.println("Erreur détectée : " + e.getMessage());
    }

    // Affichage des résultats
    System.out.println("----------------------------------");
    System.out.println("Superficie totale de la maison : " + maison.getSuperficieTotale() + " m²");

    System.out.println("Superficie du rez-de-chaussée : " + maison.getSuperficieEtage(0) + " m²");
    System.out.println("Superficie du 1er étage : " + maison.getSuperficieEtage(1) + " m²");
    System.out.println("Superficie du 2e étage : " + maison.getSuperficieEtage(2) + " m²");

    System.out.println("Superficie des chambres : " + maison.getSuperficieTypePiece("Chambre") + " m²");
    System.out.println("Superficie des salles de bain : " + maison.getSuperficieTypePiece("SalleDeBain") + " m²");


    System.out.println("Nombre de Chambre "+ maison.getNombrePiecesType("Chambre"));
  }
}
