package combat;

public class PotionAttaqueMajeure extends Potion {

  private final int bonus = 5;
  private final int dureeCombats = 2; // valable pendant 2 combats
  protected final int prix;

  public PotionAttaqueMajeure() {
    super("Potion d'attaque majeure", "+5 en attaque pendant 2 combats.");
    this.prix = 6;
  }

  @Override
  public void consommer(Personnage perso, boolean betweenCombats) {
    if (!betweenCombats) {
      throw new IllegalStateException("Les potions ne peuvent être consommées qu'entre deux combats.");
    }
    perso.appliquerBonusAttaque(bonus, dureeCombats);
    System.out.println(perso.getNom() + " consomme " + nom + " et gagne +" + bonus + " attaque pour " + dureeCombats + " combat(s).");
  }

  public int getPrix() {
    return prix;
  }

}
