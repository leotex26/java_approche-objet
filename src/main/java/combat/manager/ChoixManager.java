package combat.manager;

import combat.*;


import java.util.Scanner;

public class ChoixManager {

  private static final Scanner sc = new Scanner(System.in);

  public static void faireChoix(Personnage p) {
    int event = (int)(Math.random() * 3);

    switch(event) {
      case 0 -> eventVieilHomme(p);
      case 1 -> eventCoffre(p);
      case 2 -> eventAnimal(p);
    }
  }

  private static void eventVieilHomme(Personnage p) {
    System.out.println(" Vous croisez un vieil homme blessé.");
    System.out.println("1 - L'aider");
    System.out.println("2 - L'ignorer");
    System.out.println("3 - Le voler");

    int choix = sc.nextInt();
    sc.nextLine();

    switch(choix) {
      case 1 -> {
        p.ajouterPotion(new PotionSoin());
        System.out.println("Vous aidez le vieil homme et recevez une potion de soin !");
      }
      case 2 -> System.out.println("Vous passez votre chemin.");
      case 3 -> {
        p.gainOr(10);
        System.out.println("Vous volez le vieil homme... +10 Or");
      }
    }
  }


  private static void eventCoffre(Personnage p) {
    System.out.println("Vous trouvez un coffre mystérieux.");
    System.out.println("1 - L'ouvrir");
    System.out.println("2 - Le laisser");
    System.out.println("3 - Forcer le coffre");

    int choix = sc.nextInt();
    sc.nextLine();

    switch(choix) {
      case 1 -> {
        if(Math.random() < 0.3) {
          p.perdrePointsSante(10);
          System.out.println("Le coffre était piégé ! Vous perdez 10 PV.");
        } else {
          System.out.println("Vous trouvez une épée rare !");// ARME ET ARMURE SI LE TEMPS
          p.setForce(p.getForce() + 2) ;
          System.out.println("Vous avez désormais une attaque de "+ p.getForce() + " !");
        }
      }
      case 2 -> System.out.println("Vous décidez de laisser le coffre tranquille.");
      case 3 -> {
        if(Math.random() < 0.5) {
          p.gainOr(20);
          System.out.println("Vous réussissez à forcer le coffre et obtenez 20 Or !");
        } else {
          p.perdrePointsSante(5);
          System.out.println("Échec du crochetage ! Vous perdez 5 PV.");
        }
      }
    }
  }

  private static void eventAnimal(Personnage p) {
    System.out.println(" Vous trouvez un animal blessé sur votre chemin.");
    System.out.println("1 - Le soigner");
    System.out.println("2 - L’ignorer");
    System.out.println("3 - Le chasser");

    int choix = sc.nextInt();
    sc.nextLine();

    switch(choix) {
      case 1 -> {

        System.out.println("Vous soignez l'animal !");
      }
      case 2 -> System.out.println("Vous passez votre chemin.");
      case 3 -> {
        p.gainOr(5);

        System.out.println("Vous chassez l'animal. +5 Or.");
      }
    }
  }




  private static void eventMarchand(Personnage p) {
    System.out.println("\n Vous arrivez devant un marchand.");
    System.out.println("1 - Acheter une potion");
    System.out.println("2 - Vendre une potion");
    System.out.println("3 - Partir");

    int choix = sc.nextInt();
    sc.nextLine(); // consommer le retour à la ligne

    switch (choix) {
      case 1 -> {
        // Acheter une potion
        System.out.println("\nLe marchand propose :");
        System.out.println("1 - Potion de soin (+5 PV) : 10 Or");
        System.out.println("2 - Potion d'attaque mineure (+3 Force) : 15 Or");
        System.out.println("3 - Potion d'attaque majeure (+5 Force) : 25 Or");
        System.out.println("4 - Annuler");

        int achat = sc.nextInt();
        sc.nextLine();

        switch (achat) {
          case 1 -> acheterPotion(p, new PotionSoin(), 10);
          case 2 -> acheterPotion(p, new PotionAttaqueMineure(), 15);
          case 3 -> acheterPotion(p, new PotionAttaqueMajeure(), 25);
          default -> System.out.println("Vous décidez de ne rien acheter.");
        }
      }
      case 2 -> {
        // Vendre une potion
        if (p.getInventaire().isEmpty()) {
          System.out.println("Vous n'avez rien à vendre !");
          return;
        }
        System.out.println("\nVotre inventaire :");
        for (int i = 0; i < p.getInventaire().size(); i++) {
          System.out.println((i + 1) + " - " + p.getInventaire().get(i).getNom() + " (valeur 50% du prix d'achat)");
        }
        System.out.println((p.getInventaire().size() + 1) + " - Annuler");

        int vente = sc.nextInt();
        sc.nextLine();

        if (vente >= 1 && vente <= p.getInventaire().size()) {
          Potion potionAVendre = p.getInventaire().get(vente - 1);
          int prixVente = potionAVendre.getPrix() / 2; // 50% du prix
          p.gainOr(prixVente);
          p.retirerPotion(vente - 1); // méthode à ajouter dans Personnage
          System.out.println("Vous avez vendu " + potionAVendre.getNom() + " pour " + prixVente + " Or.");
        } else {
          System.out.println("Vous décidez de ne rien vendre.");
        }
      }
      case 3 -> System.out.println("Vous quittez le marchand.");
      default -> System.out.println("Choix invalide, vous partez.");
    }
  }

  // Méthode d'achat
  private static void acheterPotion(Personnage p, Potion potion, int prix) {
    if (p.getOr() >= prix) {
      p.gainOr(-prix);
      p.ajouterPotion(potion);
      System.out.println("Vous achetez " + potion.getNom() + " pour " + prix + " Or.");
    } else {
      System.out.println("Vous n'avez pas assez d'or pour acheter cette potion.");
    }
  }







}
