package annotations;

import annotations.ToString;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Pays {

  @ToString(uppercase = true,separator = " -> ")
  private String nom;

  @Rule
  @ToString(uppercase = false,separator = " nombre d'habitant")
  private int nbHabitants;

  private String continent;

  public Pays(String nom, int nbHabitants, String continent) {
    this.nom = nom;
    this.nbHabitants = nbHabitants;
    this.continent = continent;
  }

  @Override
  public String toString() {
    return utils.StringUtils.generateToString(this);
  }


}