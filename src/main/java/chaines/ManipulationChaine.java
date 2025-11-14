package chaines;

import entites.Salarie;

public class ManipulationChaine {
  public static void main(String[] args) {
    String chaine = "Durand;Marcel;2 523.5";
    char premierCaractere = chaine.charAt(0);
    System.out.println("Premier caractère: " + premierCaractere +" taille : " + chaine.length() + " index de ; : " + chaine.indexOf(';'));

    String nom = chaine.substring(0, chaine.indexOf(';'));
    System.out.println("Nom extrait : " + nom);

    // 5
    System.out.println("Nom en MAJ : " + nom.toUpperCase());

    // 6
    System.out.println("Nom en min : " + nom.toLowerCase());



    // 7
    String[] persoInfos = chaine.split(";");
    System.out.println("Tableau obtenu avec split :");
    for (String info : persoInfos) {
      System.out.println(" - " + info);
    }

    //
    String prenom = persoInfos[1];
    String salaireString = persoInfos[2].replace(" ", "");

    double salaire = Double.parseDouble(salaireString);

    // 9
    Salarie s = new Salarie(nom, prenom, salaire);

    System.out.println("\n--- Informations du salarié ---");
    System.out.println("Nom : " + s.getNom());
    System.out.println("Prénom : " + s.getPrenom());
    System.out.println("Salaire : " + s.getSalaire());


  }

}
