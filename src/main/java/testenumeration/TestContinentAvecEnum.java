package testenumeration;

import java.util.ArrayList;
import java.util.List;

public class TestContinentAvecEnum {
  public static void main(String[] args) {
    List<Ville> villes = new ArrayList<>();

    villes.add(new Ville("New York", 8_000_000, Continent.AMERIQUE));
    villes.add(new Ville("Paris", 2_100_000, Continent.EUROPE));
    villes.add(new Ville("Pékin", 21_000_000, Continent.ASIE));
    villes.add(new Ville("Moscou", 11_900_000, Continent.EUROPE));
    villes.add(new Ville("Berlin", 3_600_000, Continent.EUROPE));
    villes.add(new Ville("Sydney", 5_300_000, Continent.OCEANIE));
    villes.add(new Ville("Sao Paulo", 12_300_000, Continent.AMERIQUE));
    villes.add(new Ville("Dakar", 1_000_000, Continent.AFRIQUE));

    for (Ville ville : villes) {
      System.out.println(ville);
    }
  }
}
