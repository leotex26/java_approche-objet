package automates;

import automates.model.*;
import automates.service.*;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class JeuDeLaVie {

  public static void main(String[] args) throws InterruptedException {

    // premier menu + definition de la grille
    Grid g = Message.configGrid();

    Game game = new Game(g);

    // l'utilisateur peut choisir des fichiers existants ou personnaliser sa grille
    // grille-fichier :
  if(g.isEmpty()) {
    int number = -1;

    while(number == -1){
      Scanner sc = new Scanner(System.in);
      System.out.println("Combien de cases vivantes voulez-vous ( 2 à "+ (g.getRows()*g.getCols()-2) +") ?");

      int result = sc.nextInt();

      if (result >= 2 && result < g.getRows()*g.getCols()-2) {
        number = result;
      }else{
        System.out.println("\ndésolé je n'ai pas compris, veuillez ressaisir\n\n");
      }
    }
    game.initCells(number);

  }else{

  }

    while (true) {
      System.out.println(game.getGrid());
      game.cycle();

      Thread.sleep(300);
    }



  }





}
