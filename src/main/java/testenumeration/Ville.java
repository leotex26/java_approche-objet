package testenumeration;

public class Ville {

  private String nom;
  private int nbHabitants;
  private Continent continent;

  public Ville(String nom, int nbHabitants, Continent continent) {
    this.nom = nom;
    this.nbHabitants = nbHabitants;
    this.continent = continent;
  }

  public String getNom() {
    return nom;
  }

  public int getNbHabitants() {
    return nbHabitants;
  }

  public Continent getContinent() {
    return continent;
  }

  public void setContinent(Continent continent) {
    this.continent = continent;
  }

  @Override
  public String toString() {
    return nom + " (" + nbHabitants + " hab.) - Continent : " + continent.getLibelle();
  }
}

