package entites;

import java.util.ArrayList;

public class Maison {


  private Piece[] pieces;


  public Maison() {
    this.pieces = new Piece[0];
  }



  // ------------------------------------------- FONCTIONS -------------------------------------------



  /**
   * Ajoute une pièce à la maison.
   * @param piece pièce à ajouter
   */
  public void ajouterPiece(Piece piece) {

    if(piece != null) {

      Piece[] temp = new Piece[pieces.length + 1];

      for (int i = 0; i < pieces.length; i++) {
        temp[i] = pieces[i];
      }

      temp[pieces.length] = piece;
      pieces = temp;


    }else{
      throw new NullPointerException();
    }

  }





  /**
   * Retourne la superficie totale de la maison.
   * @return somme des superficies
   */
  public double getSuperficieTotale() {
    double total = 0;

    for (Piece p : pieces) {
      total += p.getSuperficie();
    }

    return total;
  }





  /**
   * Retourne la superficie d’un étage donné
   * @param etage numéro de l’étage (0 = RDC)
   * @return superficie totale de cet étage
   */
  public double getSuperficieEtage(int etage) {

    if (etage < 0) {
      throw new IllegalArgumentException("L’étage ne peut pas être négatif.");
    }

    double total = 0;

    for (Piece p : pieces) {
      if (p.getEtage() == etage) {
        total += p.getSuperficie();
      }
    }

    return total;
  }


  public String getSuperficieTypePiece(String piece) {


    if(piece == null) {
      throw new NullPointerException();
    }


    ArrayList<Piece> temp = new ArrayList<Piece>();

    for (Piece p : pieces) {
      if(piece.equalsIgnoreCase(p.getClass().getSimpleName()) ) {
        temp.add(p);
      }
    }

    double total = 0;

    for (Piece p : temp) {
      total += p.getSuperficie();
    }

    return String.valueOf(total);
  }


  /**
   * Retourne le nombre de pièces d’un type donné (ex : "Chambre").
   * @param typePiece nom simple du type (ex : "Chambre")
   * @return nombre de pièces de ce type
   */
  public int getNombrePiecesType(String typePiece) {

    if (typePiece == null || typePiece.isEmpty()) {
      throw new IllegalArgumentException("Le type de pièce ne peut pas être nul ou vide.");
    }

    int count = 0;

    for (Piece p : pieces) {

      String nomPiece = p.getClass().getSimpleName();

      if (nomPiece.equalsIgnoreCase(typePiece)) {
        count++;
      }
    }

    return count;
  }



}

