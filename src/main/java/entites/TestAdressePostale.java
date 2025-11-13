package entites;

public class TestAdressePostale {
  public static void main(String[] args) {

    AdressePostale adresse1 = new AdressePostale();
    adresse1.numeroRue = 12;
    adresse1.libelleRue = "Rue de la Paix";
    adresse1.codePostal = 75000;
    adresse1.ville = "Paris";

    AdressePostale adresse2 = new AdressePostale();
    adresse2.numeroRue = 8;
    adresse2.libelleRue = "Avenue des Champs-Élysées";
    adresse2.codePostal = 75008;
    adresse2.ville = "Paris";

    System.out.println(adresse1.ville + " - " + adresse1.libelleRue);
    System.out.println(adresse2.ville + " - " + adresse2.libelleRue);
  }
}
