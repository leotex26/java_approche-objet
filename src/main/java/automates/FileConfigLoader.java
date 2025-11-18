package automates;

import automates.model.Cell;
import automates.model.Grid;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileConfigLoader {

  public static Grid load(String filePath) {

    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

      // Lecture taille
      String[] size = br.readLine().trim().split(" ");
      int rows = Integer.parseInt(size[0]);
      int cols = Integer.parseInt(size[1]);

      Grid grid = new Grid(rows, cols);

      for (int r = 0; r < rows; r++) {
        String line = br.readLine();
        if (line == null) break;

        String[] tokens = line.trim().split(" ");
        for (int c = 0; c < cols; c++) {
          if (tokens[c].equals("X")) {
            grid.getCell(r, c).setAlive(true);
          }
        }
      }

      return grid;

    } catch (IOException e) {
      System.out.println("Erreur de lecture du fichier : " + filePath);
      return null;
    }
  }
}
