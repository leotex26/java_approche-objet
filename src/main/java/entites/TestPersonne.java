package entites;

import entites.Personne;

public class TestPersonne {
  public static void main(String[] args) {


    Personne p1 = new Personne("Dupont", "Jean");


    AdressePostale adresse1 = new AdressePostale(25, "Rue des Lilas", 35000, "Rennes");


    p1.setAdresse(adresse1);


    p1.afficherNomComplet();

    System.out.println("Adresse : " + p1.getAdresse().numeroRue + " "
      + p1.getAdresse().libelleRue + ", "
      + p1.getAdresse().codePostal + " "
      + p1.getAdresse().ville);
  }
}
