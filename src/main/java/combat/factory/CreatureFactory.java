package combat.factory;

import combat.creatures.*;

public class CreatureFactory {

  public static Creature generateRandomCreature() {

    double roll = Math.random();

    if (roll < 0.40) {
      return new Gobelin();     // 40%
    } else if (roll < 0.70) {
      return new Loup();        // 30%
    } else if (roll < 0.90) {
      return new Bandit();      // 20%
    } else {
      return new Troll();       // 10%
    }
  }
}

