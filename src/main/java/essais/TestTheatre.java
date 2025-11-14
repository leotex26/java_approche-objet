package essais;

import entites.Theatre;

public class TestTheatre {
  public static void main(String[] args) {

    Theatre theatre = new Theatre(50);

    try {

      theatre.inscrire(20, 15.0);
      //System.out.println(theatre.getTotalClients());


      theatre.inscrire(25, 15.0);
      //System.out.println(theatre.getTotalClients());


      theatre.inscrire(10, 15.0);
      //System.out.println(theatre.getTotalClients());

    } catch (IllegalArgumentException e) {
      System.out.println("Erreur : " + e.getMessage());
    }

    // Affichage du total de clients inscrits
    System.out.println("Total de clients inscrits : " + theatre.getTotalClients());

    // Affichage de la recette totale
    System.out.println("Recette totale du théâtre : " + theatre.getRecetteTotale() + " €");
  }
}

