package automates.service;

import automates.model.Cell;
import automates.model.Grid;

import java.util.concurrent.ThreadLocalRandom;

public class Game {
  private Grid g;

  public Game(Grid g) {
    this.g = g;
  }

  /** Un cycle du jeu : production d'une nouvelle grille */
  public void cycle() {

    Grid newGrid = new Grid(g.getRows(), g.getCols());

    for (int r = 0; r < g.getRows(); r++) {
      for (int c = 0; c < g.getCols(); c++) {

        Cell current = g.getCell(r, c);
        int n = g.countNeighbors(r, c);

        boolean nextState;

        if (current.isAlive()) {
          // Surpopulation ou isolement
          nextState = (n == 2 || n == 3);
        } else {
          // Génération
          nextState = (n == 3);
        }

        newGrid.setCell(r, c, nextState);
      }
    }

    this.g = newGrid;
  }

  /** Initialise EXACTEMENT X cellules vivantes */
  public void initCells(int cellsToSet) {
    int total = g.getRows() * g.getCols();
    if (cellsToSet > total) cellsToSet = total;

    while (cellsToSet > 0) {
      int r = (int)(Math.random() * g.getRows());
      int c = (int)(Math.random() * g.getCols());

      if (!g.getCell(r, c).isAlive()) {
        g.getCell(r, c).setAlive(true);
        cellsToSet--;
      }
    }
  }

  public Grid getGrid() {
    return g;
  }
}