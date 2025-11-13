package Banque;

public class Credit extends Operation{

  public Credit(String date_operation, double montant) {
    super(date_operation, montant);
  }

  @Override
  public String getType() {
    return "Credit";
  }

}
