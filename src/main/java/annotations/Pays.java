package annotations;

import annotations.ToString;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Pays {

  @ToString(uppercase = true,separator = " -> ")
  private String nom;

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
    StringBuilder sb = new StringBuilder("Pays{ ");


    for (Field field : this.getClass().getDeclaredFields()) {

      //System.out.println(field.getName());

      if (field.isAnnotationPresent(ToString.class)) {
        field.setAccessible(true);
        //System.out.println("passe dans le if - annotation"); // PROBLEME - PASSE PAS

        ToString annotation = field.getAnnotation(ToString.class);



        try {

          Object value = field.get(this);

          if (annotation.uppercase() && value instanceof String) {
            value = ((String) value).toUpperCase();
          }

          sb.append(value)
            .append(annotation.separator());

        } catch (IllegalAccessException e) {
          e.printStackTrace();
        }
      }
    }

    sb.append("}");
    return sb.toString();
  }
}