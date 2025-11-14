package operations;

public class Operations {

  /**
   * Effectue une opération sur deux nombres selon un operateur.
   * @arg a et b, deux nombres
   * @return le résultat du calcul
   */
  public static double calcul(double a, double b, char operateur) {
    return switch (operateur) {
      case '+' -> a + b;
      case '-' -> a - b;
      case '*' -> a * b;
      case '/' -> {
        if (b == 0) {
          throw new IllegalArgumentException("Division par zéro impossible");
        }
        yield a / b;
      }
      default -> throw new IllegalArgumentException("Opérateur inconnu : " + operateur);
    };
  }
}

