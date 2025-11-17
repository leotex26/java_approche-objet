package salaire;

public class Pigiste extends Intervenant {
  private int nbJoursTravailles;
  private double montantJournalier;

  public Pigiste(String nom, String prenom, int nbJoursTravailles, double montantJournalier) {
    super(nom, prenom);
    this.nbJoursTravailles = nbJoursTravailles;
    this.montantJournalier = montantJournalier;
  }

  @Override
  public double getSalaire() {
    return nbJoursTravailles * montantJournalier;
  }

  @Override
  public String getStatut() {
    return "Pigiste";
  }
}
