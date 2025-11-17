package combat.factory;

import combat.Choix;
import combat.Combat;
import combat.Peripetie;
import combat.creatures.Creature;

import java.util.concurrent.ThreadLocalRandom;

public class PeripetieFactory {

  public static Peripetie genererPeripetie() {
    int r = ThreadLocalRandom.current().nextInt(2);

    switch(r) {
      case 0:
        return new Choix();
      case 1:
        return new Combat(CreatureFactory.generateRandomCreature());
      default:
        throw new IllegalStateException("Type de péripétie inconnu");
    }
  }
}


