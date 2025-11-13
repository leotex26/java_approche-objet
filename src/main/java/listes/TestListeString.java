package listes;

import java.util.ArrayList;

public class TestListeString {
  public static void main(String[] args) {
    ArrayList<String> villes = new ArrayList<>();


    villes.add("Nice");
    villes.add("Carcassonne");
    villes.add("Narbonne");
    villes.add("Lyon");
    villes.add("Foix");
    villes.add("Pau");
    villes.add("Marseille");
    villes.add("Tarbes");

    String villeLongue = villes.get(0);

    for (int i = 1; i < villes.size(); i++) {
      if(villes.get(i).length() > villeLongue.length()) {
        villeLongue = villes.get(i);
      }
    }

    System.out.println("ville avec le plus de lettres : " + villeLongue);

    for (int i = 0; i < villes.size(); i++) {
      villes.set(i,villes.get(i).toUpperCase());
    }

    System.out.println("villes : " + villes);

    villes.removeIf(ville -> ville.startsWith("N"));

    System.out.println("Liste après suppression des villes commençant par n : " + villes);


  }
}
