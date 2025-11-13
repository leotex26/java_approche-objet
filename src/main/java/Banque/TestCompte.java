package Banque;

public class TestCompte {
  public static void main(String[] args) {


    Compte compte1 = new Compte("23456", 1500.50);


    compte1.setNumeroCompte("5199999");
    compte1.setSolde(2000.75);

    System.out.println("Numéro du compte : " + compte1.getNumeroCompte());
    System.out.println("Solde du compte : " + compte1.getSolde());

    System.out.println(compte1);


    // TP 7
    System.out.println("TP7");

    CompteTaux compteEpargne = new CompteTaux("54321", 5000.0, 2.5);

    Compte[] comptes = new Compte[2];
    comptes[0] = compte1;
    comptes[1] = compteEpargne;

    for (Compte compte : comptes) {
      System.out.println(compte);
    }


  }
}