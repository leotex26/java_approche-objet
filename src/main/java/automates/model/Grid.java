package automates.model;

public class Grid {

  private final int rows;
  private final int cols;
  private Cell[][] grid;

  public Grid(int rows, int cols) {
    this.rows = rows;
    this.cols = cols;

    grid = new Cell[rows][cols];
    initEmpty();
  }

  public boolean isEmpty() {

    boolean empty = true;

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (grid[i][j].isAlive()) {
          return false;
        }
      }
    }

    return empty;
  }


  private void initEmpty() {
    for (int r = 0; r < rows; r++) {
      for (int c = 0; c < cols; c++) {
        grid[r][c] = new Cell(false);
      }
    }
  }

  public int getRows() {
    return rows;
  }

  public int getCols() {
    return cols;
  }

  /** Retourne la cellule à une position donnée */
  public Cell getCell(int r, int c) {
    return grid[r][c];
  }

  /** Change l’état d’une cellule */
  public void setCell(int r, int c, boolean alive) {
    grid[r][c].setAlive(alive);
  }

  /** Compte le nombre de voisins vivants autour d’une cellule */
  public int countNeighbors(int r, int c) {
    int count = 0;

    for (int dr = -1; dr <= 1; dr++) {
      for (int dc = -1; dc <= 1; dc++) {

        if (dr == 0 && dc == 0) continue;

        int nr = r + dr;
        int nc = c + dc;

        if (nr >= 0 && nr < rows && nc >= 0 && nc < cols) {
          if (grid[nr][nc].isAlive()) {
            count++;
          }
        }
      }
    }
    return count;
  }

  /** Affichage console */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();

    for (int r = 0; r < rows; r++) {
      for (int c = 0; c < cols; c++) {
        sb.append(grid[r][c].toString());
      }
      sb.append("\n");
    }
    return sb.toString();
  }
}

