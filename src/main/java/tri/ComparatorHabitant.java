package tri;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville> {

  @Override
  public int compare(Ville v1, Ville v2) {

    return Integer.compare(v1.getPopulationTotale(), v2.getPopulationTotale());

  }
}

