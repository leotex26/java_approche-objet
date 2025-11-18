package automates.service;

import automates.FileConfigLoader;
import automates.model.Grid;
import java.util.Scanner;


public class Message {

  public static Grid configGrid() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Choisissez une configuration :");
    System.out.println("1 - Bloc (8x8)");
    System.out.println("2 - Giant (15x15)");
    System.out.println("3 - Triangle (fichier)");
    System.out.println("4 - Round (fichier)");
    System.out.println("5 - Oscillateur");
    System.out.println("6 - Croix");
    System.out.println("7 - Galaxie de Kox");
    System.out.print("> ");

    int number = sc.nextInt();

    return switch (number) {
      case 1 -> new Grid(8, 8);
      case 2 -> new Grid(15, 15);
      case 3 -> FileConfigLoader.load("src/main/java/automates/files/triangle");
      case 4 -> FileConfigLoader.load("src/main/java/automates/files/round.txt");
      case 5 -> FileConfigLoader.load("src/main/java/automates/files/oscillator.txt");
      case 6 -> FileConfigLoader.load("src/main/java/automates/files/cross.txt");
      case 7 -> FileConfigLoader.load("src/main/java/automates/files/kox_galaxy.txt");
      default -> new Grid(8, 8);
    };
  }
}
