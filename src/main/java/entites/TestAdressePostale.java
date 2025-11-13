package entites;

public class TestAdressePostale {
  public static void main(String[] args) {

    AdressePostale adresse1 = new AdressePostale(12, "Rue de la soif", 35000, "Rennes");
    AdressePostale adresse2 = new AdressePostale(8, "Avenue Charles de Gaulle", 35000, "Rennes");

    System.out.println(adresse1.ville + " - " + adresse1.libelleRue);
    System.out.println(adresse2.ville + " - " + adresse2.libelleRue);
  }
}
