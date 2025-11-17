package combat;

import combat.creatures.Creature;

public abstract class Peripetie {
  private final String description;

  public Peripetie(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

  public abstract void executer(Personnage p);
}


