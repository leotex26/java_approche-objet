package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ComptagePaysParContinent {
  public static void main(String[] args) {

    ArrayList<Pays> paysList = new ArrayList<>();
    paysList.add(new Pays("France", 65_000_000, "Europe"));
    paysList.add(new Pays("Allemagne", 80_000_000, "Europe"));
    paysList.add(new Pays("Belgique", 10_000_000, "Europe"));
    paysList.add(new Pays("Russie", 150_000_000, "Asie"));
    paysList.add(new Pays("Chine", 1_400_000_000, "Asie"));
    paysList.add(new Pays("Indonésie", 220_000_000, "Océanie"));
    paysList.add(new Pays("Australie", 20_000_000, "Océanie"));

    Map<String, Integer> count = new HashMap<>();

    for (Pays pays : paysList) {
      String continent = pays.getContinent();
      if (count.containsKey(continent)) {
        int compteur = count.get(continent);
        count.put(continent, compteur + 1);
      } else {
        count.put(continent, 1);
      }
    }

    System.out.println("Nombre de pays par continent :");
    for (Map.Entry<String, Integer> entry : count.entrySet()) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }


  }
}
