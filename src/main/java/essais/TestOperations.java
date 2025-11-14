package essais;

import operations.Operations;

public class TestOperations {

  public static void main(String[] args) {
    double a = 10;
    double b = 5;

    // Exercice Operations
    System.out.println("addition : " + Operations.calcul(a, b, '+'));
    System.out.println("soustraction : " + Operations.calcul(a, b, '-'));
    System.out.println("multiplication : " + Operations.calcul(a, b, '*'));
    System.out.println("division : " + Operations.calcul(a, b, '/'));


  }
}
