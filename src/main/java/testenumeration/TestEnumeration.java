package testenumeration;

public class TestEnumeration {

  public static void main(String[] args) {

    // --- Affiche toutes les saisons ---
    for (Saison s : Saison.values()) {
      System.out.println(s + " : " + s.getLibelle() + " (" + s.getOrdre() + ")");
    }

    // --- Retrouver ETE à partir de son nom ---
    String nom = "ETE";
    Saison s1 = Saison.valueOf(nom);
    System.out.println("\n"+ nom + " : " + s1.getLibelle());

    // --- Retrouver une saison par libellé ---
    String libelle = "Hiver";
    Saison s2 = Saison.fromLibelle(libelle);
    System.out.println("\nlibellé : " + libelle + " → " + s2);
  }
}
