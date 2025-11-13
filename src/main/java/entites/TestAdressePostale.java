package entites;

public class TestAdressePostale {
  public static void main(String[] args) {

    AdressePostale adresse1 = new AdressePostale(12, "Rue de la Paix", 75000, "Paris");
    AdressePostale adresse2 = new AdressePostale(8, "Avenue des Champs-Élysées", 75008, "Paris");

    System.out.println(adresse1.ville + " - " + adresse1.libelleRue);
    System.out.println(adresse2.ville + " - " + adresse2.libelleRue);
  }
}
