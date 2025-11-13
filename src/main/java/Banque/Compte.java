package Banque;

public class Compte {
  private String numeroCompte;
  private double solde;

  public Compte(String numeroCompte, double solde) {
    this.numeroCompte = numeroCompte;
    this.solde = solde;
  }


  //--------------------- GETTERS ET SETTERS ----------------------------------------------------------------------

  public String getNumeroCompte() {
    return numeroCompte;
  }

  public void setNumeroCompte(String numeroCompte) {
    this.numeroCompte = numeroCompte;
  }

  // ⚙️ Getter et Setter pour solde
  public double getSolde() {
    return solde;
  }

  public void setSolde(double solde) {
    this.solde = solde;
  }
}
