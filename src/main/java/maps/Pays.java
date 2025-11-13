package maps;

public class Pays {

  private String nom;
  private long population;
  private String continent;

  public Pays(String nom, long population, String continent) {
    this.nom = nom;
    this.population = population;
    this.continent = continent;
  }

  public String getNom() {
    return nom;
  }

  public long getPopulation() {
    return population;
  }

  public String getContinent() {
    return continent;
  }

  @Override
  public String toString() {
    return nom + " (" + population + " hab., " + continent + ")";
  }
}
