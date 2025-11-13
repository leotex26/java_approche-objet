package Banque;

public class Debit extends Operation{

  public Debit(String date_operation, double montant) {
    super(date_operation, montant);
  }


  @Override
  public String getType() {
    return "Debit";
  }

}
