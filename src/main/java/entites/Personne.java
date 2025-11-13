package entites;

public class Personne {
  private String nom;
  private String prenom;
  private AdressePostale adressePostale;


  public Personne(String nom, String prenom) {
    this.nom = nom;
    this.prenom = prenom;
  }

  public Personne(String nom, String prenom, AdressePostale adressePostale) {
    this.nom = nom;
    this.prenom = prenom;
    this.adressePostale = adressePostale;
  }


  //--------------------- FONCTIONS ----------------------------------------------------------------------

  /*
  * Afficher nom complet
   */
  public void afficherNomComplet() {
    System.out.println(prenom + " " + nom.toUpperCase());
  }

  //--------------------- GETTERS ET SETTERS ----------------------------------------------------------------------

  public void setNom(String nom) {
    this.nom = nom;
  }


  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }


  public void setAdresse(AdressePostale adressePostale) {
    this.adressePostale = adressePostale;
  }


  public String getNom() {
    return nom;
  }


  public String getPrenom() {
    return prenom;
  }


  public AdressePostale getAdresse() {
    return adressePostale;
  }


}
