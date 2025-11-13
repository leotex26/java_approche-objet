package listes;

import java.util.ArrayList;

public class TestVilles {
  public static void main(String[] args) {
    ArrayList<Ville> villes = new ArrayList<Ville>();



    villes.add(new Ville("Nice", 343000));
    villes.add(new Ville("Carcassonne", 47800));
    villes.add(new Ville("Narbonne", 53400));
    villes.add(new Ville("Lyon", 484000));
    villes.add(new Ville("Foix", 9700));
    villes.add(new Ville("Pau", 77200));
    villes.add(new Ville("Marseille", 850700));
    villes.add(new Ville("Tarbes", 40600));


    System.out.println("Liste des villes :");
    for (Ville ville : villes) {
      System.out.println(ville);
    }



    Ville villeMax = villes.get(0);
    Ville villeMin = villes.get(0);

    for (Ville ville : villes) {
      if (ville.getNombre_habitant() > villeMax.getNombre_habitant()) {
        villeMax = ville;
      } else if (ville.getNombre_habitant() < villeMin.getNombre_habitant()) {
        villeMin = ville;
      }
    }

    System.out.println("ville la plus peuplée : "+villeMax);

    villes.remove(villeMin);

    for (Ville ville : villes) {
      if(ville.getNombre_habitant() > 100000) {
        ville.setNom(ville.getNom().toUpperCase());
      }
    }

    System.out.println("Liste des villes :"+ villes);



  }
}
