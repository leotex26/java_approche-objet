package combat.manager;
import combat.*;
import combat.creatures.Creature;
import java.util.concurrent.ThreadLocalRandom;


public class CombatManager {

  public static void lancerCombat(Personnage p, Creature ennemi){
    System.out.println(ennemi.getASCIIDescription());
    System.out.println(" Combat : " + p.getNom() + " vs " + ennemi.getNom());
    System.out.println("PV " + p.getNom() + " : " + p.getPointsSante() + " | PV " + ennemi.getNom() + " : " + ennemi.getSante()+"\n");


    while (p.getPointsSante() > 0 && ennemi.getSante() > 0) {
      // Calcul des attaques avec random 1..10
      int attaqueJoueur = p.getForce() + 1 + (int)(Math.random() * 10);
      int attaqueEnnemi = ennemi.getForce() + 1 + (int)(Math.random() * 10);

      if (attaqueJoueur > attaqueEnnemi) {
        int degats = attaqueJoueur - attaqueEnnemi;
        ennemi.setSante(ennemi.getSante() - degats);
        System.out.println(p.getNom() + " remporte le tour et inflige " + degats + " dégâts à " + ennemi.getNom());
      } else if (attaqueEnnemi > attaqueJoueur) {
        int degats = attaqueEnnemi - attaqueJoueur;
        p.setSante(p.getPointsSante() - degats);
        System.out.println(ennemi.getNom() + " remporte le tour et inflige " + degats + " dégâts à " + p.getNom());
      } else {
        System.out.println("Égalité ce tour-ci, aucun dégât infligé.");
      }

      System.out.println("PV restants : " + p.getNom() + " = " + p.getPointsSante() + ", " + ennemi.getNom() + " = " + ennemi.getSante());
      System.out.println("DEBUG : Force joueur = " + p.getForce() + ", Force ennemi = " + ennemi.getForce());

      System.out.println("\n------------------------------------------------\n");

      // PAUSE
      // pourquoi je dois lever l'exception ?
      try {

        Thread.sleep(4000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }




    }

    // Fin du combat
    if (p.getPointsSante() > 0) {
      System.out.println(p.getNom() + " a gagné le combat !");

      int thune = ThreadLocalRandom.current().nextInt(2, 4);
      System.out.println("Vous gagnez "+thune+" pièces d'or");

      // LOOT
      if(Math.random() < 0.5){
        System.out.println("Votre ennemi vous a laissé une récompense :");

        if (Math.random() > 0.9){
          Potion potion = new PotionAttaqueMajeure();
          p.ajouterPotion(potion);
          System.out.println("Une potion d'attaque majeure");
        }else if (Math.random() > 0.75 && Math.random() < 0.9){
          Potion potion = new PotionSoin();
          p.ajouterPotion(potion);
          System.out.println("Une potion de soin");
        }else if (Math.random() > 0.45 && Math.random() < 0.75){
          Potion potion = new PotionAttaqueMineure();
          p.ajouterPotion(potion);
          System.out.println("Une potion d'attaque mineure");
        }else if (Math.random() > 0.25 && Math.random() < 0.75){
          p.ajouterScore(5);
          System.out.println("+5 score");
        }



      }

      // Attribution du score selon le type de créature
      int scoreGagne = switch (ennemi.getClass().getSimpleName()) {
        case "Loup" -> 1;
        case "Gobelin" -> 2;
        case "Troll" -> 5;
        default -> 1;
      };
      p.ajouterScore(scoreGagne);
      System.out.println("Score gagné : " + scoreGagne + " | Score total : " + p.getScore());
    } else {
      System.out.println(p.getNom() + " a été vaincu...");
      System.out.println("Score final : " + p.getScore());
      Main.quit = true; // fin de partie
    }

  }
}
