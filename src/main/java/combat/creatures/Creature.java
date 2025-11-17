package combat.creatures;

import combat.Combat;

public class Creature {

  // ------------------------- ATTRIBUTS -------------------------
  private String nom;
  private int sante;
  private int force;
  private String ASCIIDescription;

  // ------------------------- CONSTRUCTEURS -------------------------

  public Creature(String nom, int sante, int force, String ASCIIDescription) {
    this.nom = nom;
    this.sante = sante;
    this.force = force;
    this.ASCIIDescription = ASCIIDescription;

  }


  // ------------------------- GETTERS -------------------------
  public String getNom() {
    return nom;
  }

  public int getSante() {
    return sante;
  }

  public int getForce() {
    return force;
  }

  public String getASCIIDescription() {
    return ASCIIDescription;
  }

  // ------------------------- SETTERS -------------------------
  public void setNom(String nom) {
    this.nom = nom;
  }

  public void setSante(int sante) {
    this.sante = Math.max(0, sante);
  }

  public void setForce(int force) {
    this.force = force;
  }

  public void setASCIIDescription(String ASCIIDescription) {
    this.ASCIIDescription = ASCIIDescription;
  }

  // ------------------------- MÉTHODES -------------------------

  /**
   * Vérifie si la créature est toujours en vie
   */
  public boolean estVivant() {
    return sante > 0;
  }

  /**
   * Affiche la créature avec son ASCII
   */
  public void afficher() {
    System.out.println("Créature : " + nom);
    System.out.println("Santé : " + sante + " | Force : " + force);
    if (!ASCIIDescription.isEmpty()) {
      System.out.println(ASCIIDescription);
    }
  }

  @Override
  public String toString() {
    return "Creature{" +
      "nom='" + nom + '\'' +
      ", sante=" + sante +
      ", force=" + force +
      '}';
  }
}

