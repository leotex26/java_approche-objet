package chaines;

public class TestStringBuilder {
  public static void main(String[] args) {
    StringBuilder s = new StringBuilder();


    System.out.println("PART1");

    long debut = System.currentTimeMillis();

    for (int i = 1; i <= 100000; i++) {
      s.append(i);
    }

    long fin = System.currentTimeMillis();

    System.out.println("Temps écoulé en millisecondes :" + (fin - debut));

    System.out.println("PART2");

    long part2Debut = System.currentTimeMillis();
    String part2Concat = "";

    for (int i = 1; i <= 100000; i++) {
      part2Concat += i+" \n";
    }

    long part2fin = System.currentTimeMillis();

    System.out.println("Temps écoulé en millisecondes :" + (part2fin - part2Debut));

  }
}
