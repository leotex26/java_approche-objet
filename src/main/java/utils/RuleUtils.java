package utils;


import annotations.Rule;
import annotations.ToString;

import java.lang.reflect.Field;

public class RuleUtils {

  /**
   * Vérifie une condition
   * @param obj
   * @return un booleean
   */
  public static boolean validation(Object obj) {

    for (Field field : obj.getClass().getDeclaredFields()) {
      if (field.isAnnotationPresent(Rule.class)) {
        Rule rule = field.getAnnotation(Rule.class);
        try {
          field.setAccessible(true); //
          int value = (int) field.get(obj);
          if (value < rule.min()) {
            return false;
          }
        } catch (IllegalAccessException e) {
          e.printStackTrace();
          return false;
        }
      }
    }
    return true;
  }


}
