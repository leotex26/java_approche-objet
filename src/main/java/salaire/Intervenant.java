package salaire;

public abstract class Intervenant {
  private String nom;
  private String prenom;

  public Intervenant(String nom, String prenom) {
    this.nom = nom;
    this.prenom = prenom;
  }

  public String getNom() {
    return nom;
  }

  public String getPrenom() {
    return prenom;
  }

  // Méthode abstraite pour récupérer le salaire
  public abstract double getSalaire();

  // Méthode abstraite pour récupérer le statut
  public abstract String getStatut();

  // Méthode pour afficher les données de l'intervenant
  public void afficherDonnees() {
    System.out.println("Nom : " + nom);
    System.out.println("Prénom : " + prenom);
    System.out.println("Salaire : " + getSalaire() + " €");
    System.out.println("Statut : " + getStatut());
    System.out.println("------------------------");
  }
}
