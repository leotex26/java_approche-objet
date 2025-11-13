package Banque;

public class CompteTaux extends Compte {

  private double taux_rem;

  public CompteTaux(String numeroCompte, double solde, double taux_rem) {
    super(numeroCompte, solde);
    this.taux_rem = taux_rem;
  }

  // ------------------------------ GETTERS ET SETTERS ----------------------------------------

  public double getTaux_rem() {
    return taux_rem;
  }
  public void setTaux_rem(double taux_rem) {
    this.taux_rem = taux_rem;
  }

  // ------------------------------- FONCTIONS -----------------------------------------------

  @Override
  public String toString() {
    return "CompteTaux [numéro=" + getNumeroCompte() +
      ", solde=" + getSolde() + " €, taux_rem=" + taux_rem + "]";
  }

}
