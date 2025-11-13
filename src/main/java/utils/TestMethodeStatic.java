package utils;

public class TestMethodeStatic {
  public static void main(String[] args) {

    String chaine = "12";

    int c = Integer.parseInt(chaine);
    System.out.println(c);

    int a = 11;
    int b = 2;

    int max = Math.max(a, b);
    System.out.println("le max entre a et b est : " + max);
    int max2 = Integer.max(a, b);
    System.out.println("le max entre a et b est : " + max2);

  }
}
