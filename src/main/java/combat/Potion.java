package combat;

/**
 * Classe abstraite représentant une potion.
 */
public abstract class Potion {
  protected final String nom;
  protected final String description;

  public Potion(String nom, String description) {
    this.nom = nom;
    this.description = description;
  }

  public String getNom() {
    return nom;
  }

  public String getDescription() {
    return description;
  }

  /**
   * Applique l'effet de la potion au personnage.
   *
   * @param perso          personnage qui consomme la potion
   * @param betweenCombats true si la consommation se fait entre deux combats (obligatoire ici)
   * @throws IllegalStateException si consommation interdite maintenant
   */
  public abstract void consommer(Personnage perso, boolean betweenCombats);

  @Override
  public String toString() {
    return nom + " - " + description;
  }


  public int getPrix() {
    return 0;
  }
}
