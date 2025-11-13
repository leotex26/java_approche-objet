package maps;

import fichier.Ville;

import java.util.HashMap;
import java.util.Map;

public class CreationMap {
  public static void main(String[] args) {

    // EXO 1 ---

    Map<String, Double> mapSalaires = new HashMap<>();

    mapSalaires.put("cyber-toto", 1750.0);
    mapSalaires.put("Gertrude", 1825.0);
    mapSalaires.put("Yu", 2250.0);
    mapSalaires.put("Ingrid", 2015.0);
    mapSalaires.put("Jean-Eudes", 2418.0);
    mapSalaires.put("Michael", 2500.0);

    System.out.println(mapSalaires.size());

    // EXO 2 ---

    HashMap<Integer, String> mapVilles = new HashMap<>();
    mapVilles.put(13, "Marseille");
    mapVilles.put(34, "Montpellier");
    mapVilles.put(44, "Nantes");
    mapVilles.put(75, "Paris");
    mapVilles.put(31, "Toulouse");

    mapVilles.put(59, "Lille");
    mapVilles.put(69, "Lyon");
    mapVilles.put(33, "Bordeaux");

    // j'ai fait les deux en un
    mapVilles.forEach(
      (k, v) -> {
        System.out.println(k + ": " + v);
      }
    );

    System.out.println(mapVilles.size());






  }
}
