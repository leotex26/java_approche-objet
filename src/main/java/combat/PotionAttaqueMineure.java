package combat;

public class PotionAttaqueMineure extends Potion {

  private final int bonus = 3;
  private final int dureeCombats = 1; // valable pour le prochain combat uniquement
  protected final int prix;

  public PotionAttaqueMineure() {
    super("Potion d'attaque mineure", "+3 en attaque pendant 1 combat.");
    this.prix = 2;
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

