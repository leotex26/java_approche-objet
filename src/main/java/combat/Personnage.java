package combat;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Représente un personnage joueur pour le système de combat.
 */
public class Personnage {

  // ------------------------- ATTRIBUTS -------------------------
  private final String nom;
  private final String race;
  private int pointsSante;
  private int force;
  private int score;
  private int or = 0;
  private int[] buff = new int[2]; // [0] - nombre de tour et [1] - +3 ou +5

  private final List<Potion> inventaire;


  // ------------------------- CONSTRUCTEUR -------------------------
  public Personnage(String nom, String race) {
    this.nom = (nom == null || nom.isBlank()) ? "Héros" : nom;
    this.race = race;
    this.force = ThreadLocalRandom.current().nextInt(12, 19);
    this.pointsSante = ThreadLocalRandom.current().nextInt(20, 51);
    this.score = 0;
    this.inventaire = new ArrayList<>();
    // Inventaire de départ
    this.inventaire.add(new PotionSoin());
    this.inventaire.add(new PotionAttaqueMineure());
    this.inventaire.add(new PotionAttaqueMajeure());
  }

  // ------------------------- GETTERS -------------------------
  public String getNom() {
    return nom;
  }

  public String getRace() {
    return race;
  }

  public int getPointsSante() {
    return pointsSante;
  }

  public int getSante() {
    return pointsSante;
  }

  public void setSante(int points) {
    this.pointsSante = Math.max(0, points);
  }

  public int getForce() {
    return force;
  }

  public int getScore() {
    return score;
  }

  public List<Potion> getInventaire() {
    return Collections.unmodifiableList(inventaire);
  }

  public int getOr() {
    return or;
  }

  // ------------------------- MÉTHODES DE COMBAT -------------------------

  /**
   * Subit des dégâts.
   */
  public void perdrePointsSante(int points) {
    if (points <= 0) return;
    pointsSante -= points;
    if (pointsSante < 0) pointsSante = 0;
  }

  /**
   * Gagne des points de vie.
   */
  public void gagnerPointsSante(int points) {
    if (points <= 0) return;
    pointsSante += points;
  }

  /**
   * Applique un bonus d'attaque temporaire.
   */
  public void appliquerBonusAttaque(int bonus, int duree) {
    buff[0] = duree;
    buff[1] = bonus;
  }

  public void debuff() {
    buff[0] = buff[0]--;
    if (buff[0] <= 0){
      buff[0] = 0;
      this.setForce(this.getForce() - buff[1]) ;
      buff[1] = 0;
    }
  }

  public void setForce(int force) {
    this.force = force;
  }

  /**
   * Ajoute des points au score.
   */
  public void ajouterScore(int points) {
    if (points > 0) score += points;
  }

  /**
   * Vérifie si le personnage est vivant.
   */
  public boolean estVivant() {
    return pointsSante > 0;
  }

  public void verifSante() {
    if (pointsSante <= 0) {
      System.out.println("\nVotre personnage est décédé.");
      System.out.println("Score final : " + score + " points");
      // Arrêter la partie
      Main.quit = true;
    }
  }

  /**
   * Affiche les infos du personnage.
   */
  public void afficher() {
    System.out.println("Nom : " + nom + " | Race : " + race + " | PV : " + pointsSante + " | Force : " + getForce());
    System.out.println("Score : " + score);
  }

  public void gainOr(int montant) {
    if (montant > 0) {
      this.or += montant;
      System.out.println(nom + " gagne " + montant + " pièces d'or !");
    }
  }

  public void ajouterPotion(Potion p) {
    if(p != null) {
      inventaire.add(p);
      System.out.println(nom + " reçoit une potion : " + p.getClass().getSimpleName());
    }
  }

  public void retirerPotion(int index) {
    if(index >= 0 && index < inventaire.size()) {
      inventaire.remove(index);
    }
  }


  public void consommerPotion(int i) {
    if (i < 0 || i >= inventaire.size()) {
      System.out.println("Index de potion invalide !");
      return;
    }

    Potion p = inventaire.get(i);

    // Applique l'effet de la potion
    switch (p.getNom()) {
      case "Potion d'attaque majeure" -> {
        appliquerBonusAttaque(5, 2);
        System.out.println(nom + " utilise une Potion d'attaque majeure ! +5 force pendant 2 combats.");
      }
      case "Potion d'attaque mineure" -> {
        appliquerBonusAttaque(3, 1);
        System.out.println(nom + " utilise une Potion d'attaque mineure ! +3 force pendant 1 combat.");
      }
      case "Potion de soin" -> {
        int soin = 5;
        pointsSante += soin;
        System.out.println(nom + " utilise une Potion de soin ! +" + soin + " PV.");
      }
      default -> System.out.println("Potion inconnue !");
    }


    inventaire.remove(i);
  }




  @Override
  public String toString() {
    return "Personnage{" +
      "nom='" + nom + '\'' +
      ", race='" + race + '\'' +
      ", pointsSante=" + pointsSante +
      ", force=" + getForce() +
      ", score=" + score +
      ", inventaire=" + inventaire +
      '}';
  }



}
