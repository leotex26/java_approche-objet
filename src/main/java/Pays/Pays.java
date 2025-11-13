package Pays;

import java.util.Objects;

public class Pays {
  private String nom;
  private int population;


  public Pays(String nom, int population) {
    this.nom = nom;
    this.population = population;
  }


  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public int getPopulation() {
    return population;
  }

  public void setPopulation(int population) {
    this.population = population;
  }


  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Pays autrePays = (Pays) obj;
    return population == autrePays.population && Objects.equals(nom, autrePays.nom);
  }


  @Override
  public int hashCode() {
    return Objects.hash(nom, population);
  }

  @Override
  public String toString() {
    return nom + " (" + population + " habitants)";
  }
}
