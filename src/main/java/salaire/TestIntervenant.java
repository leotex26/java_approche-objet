package salaire;

public class TestIntervenant {
  public static void main(String[] args) {

    Salarie salarie = new Salarie("Zero", "Toto", 2500);
    salarie.afficherDonnees();


    Pigiste pigiste = new Pigiste("Moqueur", "Loiseau", 12, 120);
    pigiste.afficherDonnees();
  }
}
