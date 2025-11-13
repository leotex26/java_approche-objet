package listes;

public class Ville {
  private String nom;
  private int nombre_habitant;

  public Ville(String nom, int nombre_habitant) {
    this.nom = nom;
    this.nombre_habitant = nombre_habitant;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public int getNombre_habitant() {
    return nombre_habitant;

  }

  public void setNombre_habitant(int nombre_habitant) {
    this.nombre_habitant = nombre_habitant;
  }

  @Override
  public String toString() {
    return "Ville{" +
      "nom='" + nom + '\'' +
      ", nombre_habitant=" + nombre_habitant +
      '}';
  }
}
