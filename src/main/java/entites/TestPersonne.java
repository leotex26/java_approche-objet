package entites;

public class TestPersonne {
  public static void main(String[] args) {

    AdressePostale adresse1 = new AdressePostale(5,"Rue Victor Hugo",44000,"Nantes");

    Personne personne1 = new Personne("Dupont","Marie");
    personne1.adressePostale = adresse1;

    AdressePostale adresse2 = new AdressePostale(10,"Rue Nationale",59000,"Lille");

    Personne personne2 = new Personne("Martin","Paul", adresse2);

    System.out.println(personne1.prenom + " " + personne1.nom + " habite à " + personne1.adressePostale.ville);
    System.out.println(personne2.prenom + " " + personne2.nom + " habite à " + personne2.adressePostale.ville);
  }
}
