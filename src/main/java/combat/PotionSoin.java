package combat;

import java.util.concurrent.ThreadLocalRandom;

public class PotionSoin extends Potion {
  protected final int prix;

  public PotionSoin() {
    super("Potion de soin", "Rend entre 5 et 10 points de vie.");
    this.prix = 4;
  }

  @Override
  public void consommer(Personnage perso, boolean betweenCombats) {
    if (!betweenCombats) {
      throw new IllegalStateException("Les potions ne peuvent être consommées qu'entre deux combats.");
    }
    int soin = ThreadLocalRandom.current().nextInt(5, 11); // 5..10
    perso.gagnerPointsSante(soin);
    System.out.println(perso.getNom() + " consomme " + nom + " et récupère " + soin + " PV.");
  }

  public int getPrix() {
    return prix;
  }
}
