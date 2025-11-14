package utils;

import annotations.ToString;
import java.lang.reflect.Field;

public class StringUtils {

  /**
   * Génère une chaîne de caractères basée sur les attributs annotés @ToString
   * @param obj L'objet dont on veut générer le toString
   * @return La chaîne générée
   */
  public static String generateToString(Object obj) {
    StringBuilder sb = new StringBuilder(obj.getClass().getSimpleName() + "{ ");

    for (Field field : obj.getClass().getDeclaredFields()) {
      if (field.isAnnotationPresent(ToString.class)) {
        field.setAccessible(true);
        ToString annotation = field.getAnnotation(ToString.class);

        try {
          Object value = field.get(obj);

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
