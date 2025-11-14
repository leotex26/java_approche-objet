package operations;

public class TestMoyenne {

  public static void main(String[] args) {


    // Test 1
    double[] valeurs1 = {10, 20, 30, 40};
    CalculMoyenne calcul = new CalculMoyenne();
    for (int i = 0; i < valeurs1.length; i++) {
      calcul.ajout(valeurs1[i]);
    }

    for (int i = 0; i < calcul.getTab().length; i++) {
      System.out.println(calcul.getTab()[i]);
    }

    System.out.println("Moyenne Test 1 : " + calcul.calcul()); // 25.0

    // Test 2
    double[] valeurs2 = {5, 15, 25};
    CalculMoyenne calcul2 = new CalculMoyenne(valeurs2);
    System.out.println("Moyenne Test 2 : " + calcul2.calcul()); // 15.0
  }
}
