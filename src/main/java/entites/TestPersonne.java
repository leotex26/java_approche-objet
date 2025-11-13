package entites;

public class TestPersonne {
  public static void main(String[] args) {

    AdressePostale adresse1 = new AdressePostale();
    adresse1.numeroRue = 5;
    adresse1.libelleRue = "Rue Victor Hugo";
    adresse1.codePostal = 44000;
    adresse1.ville = "Nantes";

    Personne personne1 = new Personne();
    personne1.nom = "Dupont";
    personne1.prenom = "Marie";
    personne1.adressePostale = adresse1;

    AdressePostale adresse2 = new AdressePostale();
    adresse2.numeroRue = 10;
    adresse2.libelleRue = "Rue Nationale";
    adresse2.codePostal = 59000;
    adresse2.ville = "Lille";

    Personne personne2 = new Personne();
    personne2.nom = "Martin";
    personne2.prenom = "Paul";
    personne2.adressePostale = adresse2;

    System.out.println(personne1.prenom + " " + personne1.nom + " habite à " + personne1.adressePostale.ville);
    System.out.println(personne2.prenom + " " + personne2.nom + " habite à " + personne2.adressePostale.ville);
  }
}
