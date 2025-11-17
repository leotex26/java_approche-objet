package combat;

import combat.creatures.Creature;
import combat.manager.CombatManager;

public class Combat extends Peripetie {

  private final Creature ennemi;

  public Combat(Creature ennemi) {
    super("Un combat commence !"); // message générique
    this.ennemi = ennemi;
    System.out.println("Un combat commence contre " + ennemi.getNom() + " !");
  }

  @Override
  public void executer(Personnage p) {
    CombatManager.lancerCombat(p, ennemi);
  }
}


