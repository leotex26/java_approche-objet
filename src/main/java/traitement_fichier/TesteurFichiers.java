package traitement_fichier;

import traitement_fichier.model.Produit;
import traitement_fichier.service.ImportProduit;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TesteurFichiers {
  public static void main(String[] args) {

    Path path = Paths.get("C:/Users/33665/IdeaProjects/approche-objet/src/main/java/traitement_fichier/fichiers/open-food-facts.csv");
    System.out.println("est-ce que le fichier est lisible : ");
    System.out.println(Files.isReadable(path)); // false



    // FICHIER GLOBAL ===================================================================================
    ImportProduit service = new ImportProduit();
    List<Produit> produits = new ArrayList<>();

    try {
      produits = service.all();
    } catch (IOException e) {
      System.out.println("Erreur lors du chargement du fichier."); // > ça leve pourtant une exception
      return;
    }
  }



}
