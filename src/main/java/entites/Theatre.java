package entites;

public class Theatre {

  // ------------------------- ATTRIBUTS -------------------------
  private String nom;
  private int capaciteMax;
  private int totalClients;
  private double recetteTotale;

  // ------------------------- CONSTRUCTEURS -------------------------
  public Theatre(String nom, int capaciteMax, int totalClients, double recetteTotale) {
    this.nom = nom;
    this.capaciteMax = capaciteMax;
    this.totalClients = totalClients;
    this.recetteTotale = recetteTotale;
  }

  public Theatre() {
    this.recetteTotale = 0.0;
  }

  // ------------------------- GETTERS -------------------------
  public String getNom() {
    return nom;
  }

  public int getCapaciteMax() {
    return capaciteMax;
  }

  public int getTotalClients() {
    return totalClients;
  }

  public double getRecetteTotale() {
    return recetteTotale;
  }

  // ------------------------- SETTERS -------------------------
  public void setNom(String nom) {
    this.nom = nom;
  }

  public void setCapaciteMax(int capaciteMax) {
    this.capaciteMax = capaciteMax;
  }

  public void setTotalClients(int totalClients) {
    this.totalClients = totalClients;
  }

  public void setRecetteTotale(double recetteTotale) {
    this.recetteTotale = recetteTotale;
  }

  // ------------------------------ FONCTIONS --------------------------

  /**
  * Si la capacité max du théâtre n’est pas atteinte, elle ajoute le nombre de
   * clients passé en paramètre au total de clients du théâtre et recalcule la
   * recette totale de l’établissement
   */
  public void inscrire(int nombreClient, double prixDeLaPlace){

  }







  // ------------------------- TO STRING -------------------------
  @Override
  public String toString() {
    return "Theatre{" +
      "nom='" + nom + '\'' +
      ", capaciteMax=" + capaciteMax +
      ", totalClients=" + totalClients +
      ", recetteTotale=" + recetteTotale +
      '}';
  }
}
