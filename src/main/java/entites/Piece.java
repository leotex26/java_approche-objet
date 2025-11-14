package entites;

public abstract class Piece {


  protected double superficie;
  protected int etage;

  /**
   *
   */
  public Piece(double superficie, int etage) {
    if (superficie <= 0) {
      throw new IllegalArgumentException("ça peut pas etre inferieur à 0");
    }
    if (etage < 0) {
      throw new IllegalArgumentException("ça peut pas etre inferieur à 0");
    }

    this.superficie = superficie;
    this.etage = etage;
  }

  // Getters
  public double getSuperficie() {
    return superficie;
  }

  public int getEtage() {
    return etage;
  }
}
