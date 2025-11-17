package combat;

import combat.manager.ChoixManager;

public class Choix extends Peripetie {

  ChoixManager choixManager;

  public Choix() {
    super("Vous rencontrez une situation imprévue...");
  }

  @Override
  public void executer(Personnage p) {
    choixManager.faireChoix(p);
  }
}


