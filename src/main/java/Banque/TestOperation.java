package Banque;

public class TestOperation {
  public static void main(String[] args) {
    Operation[] operations = new Operation[4];
    operations[0] = new Credit("2025-11-13", 500.0);
    operations[1] = new Debit("2025-11-14", 200.0);
    operations[2] = new Credit("2025-11-15", 150.0);
    operations[3] = new Debit("2025-11-16", 50.0);

    for (Operation operation : operations) {
      System.out.println(operation.getType() + " : " + operation.toString());
    }

    double soldeGlobal = 0.0;

    for (Operation op : operations) {
      if (op instanceof Credit) {
        soldeGlobal += op.getMontant();
      } else if (op instanceof Debit) {
        soldeGlobal -= op.getMontant();
      }
    }

    System.out.println("\nMontant global de toutes les opérations : " + soldeGlobal + " €");



  }
}
