package traitement_fichier.model;

public class Categorie {

  private String libelle;

  public Categorie(String libelle) {
    this.libelle = libelle;
  }

  public String getLibelle() {
    return libelle;
  }

  public void setLibelle(String libelle) {
    this.libelle = libelle;
  }

  @Override
  public String toString() {
    return "Ingredient{" +
      "libelle='" + libelle + '\'' +
      '}';
  }
}
