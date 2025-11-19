package traitement_fichier.service;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import traitement_fichier.ScoreNutritionnel;
import traitement_fichier.model.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class ImportProduit {

  public ArrayList<Produit> all() throws IOException {

    Path path = Path.of("src/main/java/traitement_fichier/fichiers/open-food-facts.csv");

    // Parser CSV avec séparateur '|'
    CSVParser parser = CSVParser.parse(
      path,
      java.nio.charset.StandardCharsets.UTF_8,
      CSVFormat.DEFAULT.withDelimiter('|').withIgnoreSurroundingSpaces()
    );

    ArrayList<Produit> produits = new ArrayList<>();

    // Saute la première ligne (en-têtes)
    boolean first = true;

    for (CSVRecord record : parser) {

      if (first) {
        first = false;
        continue;
      }

      // Vérifie si la ligne est complète
      if (record.size() < 30) {
        System.out.println("Ligne ignorée (colonnes manquantes) : " + record);
        continue;
      }

      Produit p = new Produit();

      // ====== INFORMATIONS DE BASE ======
      p.setCategorie(new Categorie(record.get(0)));
      p.setMarque(new Marque(record.get(1)));
      p.setNom(record.get(2));

      // Score A/B/C/D/E
      p.setScoreNutritionnel(
        ScoreNutritionnel.valueOf(record.get(3).toUpperCase())
      );

      // ====== INGREDIENTS ======
      String ingredients = record.get(4);
      if (!ingredients.isBlank()) {
        for (String ing : ingredients.split(",")) {
          p.addIngredient(new Ingredient(ing.trim()));
        }
      }

      // ====== NUTRIMENTS ======
      setDoubleIfPresent(record.get(5), p::setEnergie);
      setDoubleIfPresent(record.get(6), p::setGraisses);
      setDoubleIfPresent(record.get(7), p::setSucre);
      setDoubleIfPresent(record.get(8), p::setFibres);
      setDoubleIfPresent(record.get(9), p::setProteines);
      setDoubleIfPresent(record.get(10), p::setSel);

      // ====== VITAMINES ======
      setDoubleIfPresent(record.get(11), p::setVitamineA);
      setDoubleIfPresent(record.get(12), p::setVitamineD);
      setDoubleIfPresent(record.get(13), p::setVitamineE);
      setDoubleIfPresent(record.get(14), p::setVitamineK);
      setDoubleIfPresent(record.get(15), p::setVitamineC);
      setDoubleIfPresent(record.get(16), p::setVitamineB1);
      setDoubleIfPresent(record.get(17), p::setVitamineB2);
      setDoubleIfPresent(record.get(18), p::setVitaminePP);
      setDoubleIfPresent(record.get(19), p::setVitamineB6);
      setDoubleIfPresent(record.get(20), p::setVitamineB9);
      setDoubleIfPresent(record.get(21), p::setVitamine12);

      // ====== MINÉRAUX ======
      setDoubleIfPresent(record.get(22), p::setCalcium);
      setDoubleIfPresent(record.get(23), p::setMagnesium);
      setDoubleIfPresent(record.get(24), p::setIron); // iron
      setDoubleIfPresent(record.get(25), p::setFer);  // fer FR
      setDoubleIfPresent(record.get(26), p::setBetaCarotene);

      // ====== HUILE DE PALME ======
      p.setPresenceHuilePalme(
        record.get(27).equals("1") ||
          record.get(27).equalsIgnoreCase("true")
      );

      // ====== ALLERGÈNES ======
      String allergenes = record.get(28);
      if (!allergenes.isBlank()) {
        for (String all : allergenes.split(",")) {
          p.addAllergene(new Allergene(all.trim()));
        }
      }

      // ====== ADDITIFS ======
      String additifs = record.get(29);
      if (!additifs.isBlank()) {
        for (String add : additifs.split(",")) {
          p.addAdditif(new Additif(add.trim()));
        }
      }

      produits.add(p);
    }

    return produits;
  }

  // Petite méthode utilitaire
  private void setDoubleIfPresent(String str, java.util.function.Consumer<Double> setter) {
    if (str == null || str.isEmpty()) return;
    try {
      // On tente de parser la valeur
      double val = Double.parseDouble(str);
      setter.accept(val);
    } catch (NumberFormatException e) {
      // Ligne ignorée, valeur non numérique
      System.out.println("Valeur non numérique ignorée: " + str);
    }
  }

  private Double parseDoubleSafe(String str) {
    try {
      return parseDoubleSafe(str);
    } catch (NumberFormatException e) {
      return null;
    }
  }


}
