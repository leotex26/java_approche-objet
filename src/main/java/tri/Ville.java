package tri;

public class Ville implements Comparable<Ville> {

  // ------------------------- ATTRIBUTS -------------------------
  private String nom;
  private String codeDepartement;
  private String nomRegion;
  private int populationTotale;

  // ------------------------- CONSTRUCTEUR -------------------------

  public Ville(){

  }

  public Ville(String nom, String codeDepartement, String nomRegion, int populationTotale) {
    this.nom = nom;
    this.codeDepartement = codeDepartement;
    this.nomRegion = nomRegion;
    this.populationTotale = populationTotale;
  }

  // ------------------------- GETTERS -------------------------
  public String getNom() {
    return nom;
  }

  public String getCodeDepartement() {
    return codeDepartement;
  }

  public String getNomRegion() {
    return nomRegion;
  }

  public int getPopulationTotale() {
    return populationTotale;
  }

  // ------------------------- SETTERS -------------------------
  public void setNom(String nom) {
    this.nom = nom;
  }

  public void setCodeDepartement(String codeDepartement) {
    this.codeDepartement = codeDepartement;
  }

  public void setNomRegion(String nomRegion) {
    this.nomRegion = nomRegion;
  }

  public void setPopulationTotale(int populationTotale) {
    this.populationTotale = populationTotale;
  }

  // ------------------------- TO STRING -------------------------
  @Override
  public String toString() {
    return "Ville{" +
      "nom='" + nom + '\'' +
      ", codeDepartement='" + codeDepartement + '\'' +
      ", nomRegion='" + nomRegion + '\'' +
      ", populationTotale=" + populationTotale +
      '}';
  }

  // ------------------------- FONCTIONS -------------------------

  /*@Override
  public int compareTo(Ville o) {
    return o.nom.compareTo(this.nom);
  }*/

  @Override
  public int compareTo(Ville o) {
    return Integer.compare( this.populationTotale, o.populationTotale);
  }

}

