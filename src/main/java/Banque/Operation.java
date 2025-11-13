package Banque;

public abstract class Operation {

  private String date_operation;
  private double montant;

  public Operation(String date_operation, double montant) {
    this.date_operation = date_operation;
    this.montant = montant;
  }

  // -------------------------------------------- GETTERS ET SETTERS ----------------------------------------------

  public String getDate_operation() {
    return date_operation;
  }

  public void setDate_operation(String date_operation) {
    this.date_operation = date_operation;
  }

  public double getMontant() {
    return montant;
  }

  public void setMontant(double montant) {
    this.montant = montant;
  }

//------------------------------------------- FONCTIONS -----------------------------------------


  @Override
  public String toString() {
    return "Operation{" +
      "date_operation='" + date_operation + '\'' +
      ", montant=" + montant +
      '}';
  }

  public abstract String getType();

}
