package combat;

import combat.factory.PeripetieFactory;

import java.util.Scanner;

public class MessageJeu {

  public MessageJeu() {
  }

  public static void messageBienvenu(){

  }

  /***
   * Impose un choix au joueur au début du jeu soit créer son personnage, soit quitter
   * l'aventure ou la mort !
   */
  public static void menuChoixDepart(){

    Scanner sc = new Scanner(System.in);

    System.out.println("\n***MENU CHOIX DEPART***");
    System.out.println("\n 1 - Démarrer une nouvelle aventure");
    System.out.println("\n 2 - Quitter\n >");

    int choice = sc.nextInt();

    switch(choice){case 1 : creationPersonnage(); break; case 2: quitter() ; break; default : menuChoixDepartFailed(); break; }

  }

  /***
   * boucle sur le menu si le joueur n'a pas écrit 1 ou 2, avec un petit rappel de l'erreur au début
   */
  public static void menuChoixDepartFailed(){
    System.out.println("\n choisissez 1 ou 2");
    menuChoixDepart();
  }



  public static void creationPersonnage() {

    Scanner sc = new Scanner(System.in);

    System.out.println("\n*** CREATION PERSONNAGE ***");
    System.out.print("\nEntrez le nom de votre aventurier : ");
    String nom = sc.nextLine().trim();

    int choixRace = -1;

    while (choixRace == -1) {
      System.out.println("\nSélectionnez la race de votre aventurier :");
      System.out.println("1 - Nain");
      System.out.println("2 - Elfe");
      System.out.println("3 - Humain");
      System.out.print("> ");

      String saisie = sc.nextLine().trim();

      // --- Gestion des nombres ---
      if (saisie.matches("[1-3]")) {
        choixRace = Integer.parseInt(saisie);
        break;
      }

      // --- Gestion du texte ---
      switch (saisie.toLowerCase()) {
        case "nain":   choixRace = 1; break;
        case "elfe":   choixRace = 2; break;
        case "humain": choixRace = 3; break;
        default:
          System.out.println("Veuillez entrer 1, 2, 3 ou Nain / Elfe / Humain.");
      }
    }

    String race = switch (choixRace) {
      case 1 -> "Nain";
      case 2 -> "Elfe";
      case 3 -> "Humain";
      default -> "Humain";
    };

    Personnage personnage = new Personnage(nom, race);

    System.out.println("\nVotre personnage a été créé :");
    System.out.println(personnage);

    System.out.print("\nAppuyez sur entrée pour commencer votre aventure... ");
    sc.nextLine();

    aventure(personnage);
  }




  // LE PLUS IMPORTANT
  // AVENTURE
  private static void aventure(Personnage personnage) {

    while (!Main.quit) {
      // seules conditions de sorties possibles
      personnage.verifSante();
      if (Main.quit) break;
      continuerOuNon(personnage);

      personnage.debuff(); // verifie le nombre de tour restant pour le buff et eventuellement debuff

      Peripetie p = PeripetieFactory.genererPeripetie(); // la factory en fonction d'un random va nous generer soit un Choix, soit un Combat,
      // dans le cas d'un combat on appelle CreatureFactory pour nous sortir aléatoirement une creature qui devient attribut de notre peripetie.
      System.out.println(p.getDescription());

      p.executer(personnage); // on execute le tout
    }
  }



  public static void quitter(){
    System.out.println("C'est donc déjà la fin du voyage pour vous aventurier, dommage, jamais les bardes ne conteront vos exploits");
    Main.quit=true;
  }

  public static void continuerOuNon(Personnage personnage) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Appuyez sur Entrée pour continuer ou tapez 'quit' pour arrêter l’aventure.");

    String choix = sc.nextLine().trim().toLowerCase();

    if (choix.equals("quit")) {
      quitter();
    } else {
      System.out.println("Vous poursuivez votre quête !");
    }

    // boire une potion avant le prochain combat
    if (!personnage.getInventaire().isEmpty()){
      BoirePotionOuNon(personnage);
    }





  }

  public static void BoirePotionOuNon(Personnage personnage) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Boire une potion ? : ");
    int i = 1;
    for (Potion p : personnage.getInventaire()) {
      System.out.println(i + " - " + p.getDescription());
      i++;
    }
    System.out.println("0 - Ne pas boire de potion");

    int choix = -1;
    try {
      choix = Integer.parseInt(sc.nextLine());
    } catch (NumberFormatException e) {
      System.out.println("Choix invalide, vous ne buvez rien.");
    }

    if (choix > 0 && choix <= personnage.getInventaire().size()) {
      personnage.consommerPotion(choix - 1);
    } else {
      System.out.println("Vous ne buvez aucune potion.");
    }

  }




  }









