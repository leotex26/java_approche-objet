package Pays;

public class TestEqualsPays {
  public static void main(String[] args) {

    Pays perou1 = new Pays("Pérou", 33000000);
    Pays perou2 = new Pays("Pérou", 33000000);
    Pays perou3 = new Pays("Pérou", 33000000); // Different

    System.out.println("perou1.equals(perou2) : " + perou1.equals(perou2));
    System.out.println("perou1 == perou2 : " + (perou1 == perou2));


    System.out.println("perou1.equals(perou3) : " + perou1.equals(perou3));

    Pays allemagne = new Pays("Allemagne", 83000000);
    System.out.println("perou1.equals(allemagne) : " + perou1.equals(allemagne));

    Pays perou4 = perou1;
    System.out.println("perou1 == perou4 : " + (perou1 == perou4));
  }
}

