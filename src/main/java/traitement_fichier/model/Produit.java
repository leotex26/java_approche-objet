package traitement_fichier.model;

import traitement_fichier.ScoreNutritionnel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Produit {


    private Categorie categorie;
    private Marque marque;
    private String nom;
    private ScoreNutritionnel scoreNutritionnel;


    private double energie;
    private double sucre;
    private double sel;
    private double graisses;
    private double fibres;
    private double proteines;
    private double vitamineA;
    private double vitamineD;
    private double vitamineE;
    private double vitamineK;
    private double vitamineC;
    private double vitamineB1;
    private double vitamineB2;
    private double vitaminePP;
    private double vitamineB6;
    private double vitamineB9;
    private double vitamine12;
    private double calcium;
    private double magnesium;
    private double fer;
    private double betaCarotene;
    private boolean presenceHuilePalme;
    private double iron; // il y a deux attributs un peu identiques, fer et iron, je le met quand meme sinon le fichier est décallé




    private List<Ingredient> ingredients = new ArrayList<>();
    private List<Additif> additifs = new ArrayList<>();
    private List<Allergene> allergenes = new ArrayList<>();





    // ------------------------------------------------------------------ CONSTRUCTEUR -----------------------------------------------------------------------------

  public Produit() {
  }

    public Produit(Categorie categorie, Marque marque, ScoreNutritionnel scoreNutritionnel) {
      this.categorie = categorie;
      this.marque = marque;
      this.scoreNutritionnel = scoreNutritionnel;
    }



    // ------------------------------------------------------------------ GETTERS/SETTERS -----------------------------------------------------------------------------
    public Categorie getCategorie() { return categorie; }
    public Marque getMarque() { return marque; }
    public ScoreNutritionnel getScoreNutritionnel() { return scoreNutritionnel; }
    public String getNom() { return nom; }

    public void setEnergie(double energie) { this.energie = energie; }
    public void setSucre(double sucre) { this.sucre = sucre; }
    public void setSel(double sel) { this.sel = sel; }
    public void setGraisses(double graisses) { this.graisses = graisses; }
    public void setFibres(double fibres) { this.fibres = fibres; }
    public void setProteines(double proteines) { this.proteines = proteines; }
    public void setNom(String nom) { this.nom = nom; }



  public void setCategorie(Categorie categorie) {
    this.categorie = categorie;
  }

  public void setMarque(Marque marque) {
    this.marque = marque;
  }

  public void setScoreNutritionnel(ScoreNutritionnel scoreNutritionnel) {
    this.scoreNutritionnel = scoreNutritionnel;
  }

  public void setIngredients(List<Ingredient> ingredients) {
    this.ingredients = ingredients;
  }

  public void setAdditifs(List<Additif> additifs) {
    this.additifs = additifs;
  }

  public void setAllergenes(List<Allergene> allergenes) {
    this.allergenes = allergenes;
  }

  public double getVitamineA() {
    return vitamineA;
  }

  public void setVitamineA(double vitamineA) {
    this.vitamineA = vitamineA;
  }

  public double getVitamineD() {
    return vitamineD;
  }

  public void setVitamineD(double vitamineD) {
    this.vitamineD = vitamineD;
  }

  public double getVitamineE() {
    return vitamineE;
  }

  public void setVitamineE(double vitamineE) {
    this.vitamineE = vitamineE;
  }

  public double getVitamineK() {
    return vitamineK;
  }

  public void setVitamineK(double vitamineK) {
    this.vitamineK = vitamineK;
  }

  public double getVitamineC() {
    return vitamineC;
  }

  public void setVitamineC(double vitamineC) {
    this.vitamineC = vitamineC;
  }

  public double getVitamineB1() {
    return vitamineB1;
  }

  public void setVitamineB1(double vitamineB1) {
    this.vitamineB1 = vitamineB1;
  }

  public double getVitamineB2() {
    return vitamineB2;
  }

  public void setVitamineB2(double vitamineB2) {
    this.vitamineB2 = vitamineB2;
  }

  public double getVitaminePP() {
    return vitaminePP;
  }

  public void setVitaminePP(double vitaminePP) {
    this.vitaminePP = vitaminePP;
  }

  public double getVitamineB6() {
    return vitamineB6;
  }

  public void setVitamineB6(double vitamineB6) {
    this.vitamineB6 = vitamineB6;
  }

  public double getVitamineB9() {
    return vitamineB9;
  }

  public void setVitamineB9(double vitamineB9) {
    this.vitamineB9 = vitamineB9;
  }

  public double getVitamine12() {
    return vitamine12;
  }

  public void setVitamine12(double vitamine12) {
    this.vitamine12 = vitamine12;
  }

  public double getCalcium() {
    return calcium;
  }

  public void setCalcium(double calcium) {
    this.calcium = calcium;
  }

  public double getMagnesium() {
    return magnesium;
  }

  public void setMagnesium(double magnesium) {
    this.magnesium = magnesium;
  }

  public double getFer() {
    return fer;
  }

  public void setFer(double fer) {
    this.fer = fer;
  }

  public double getBetaCarotene() {
    return betaCarotene;
  }

  public void setBetaCarotene(double betaCarotene) {
    this.betaCarotene = betaCarotene;
  }

  public boolean isPresenceHuilePalme() {
    return presenceHuilePalme;
  }

  public void setPresenceHuilePalme(boolean presenceHuilePalme) {
    this.presenceHuilePalme = presenceHuilePalme;
  }

  public double getIron() {
    return iron;
  }

  public void setIron(double iron) {
    this.iron = iron;
  }

  public double getEnergie() { return energie; }
    public double getSucre() { return sucre; }
    public double getSel() { return sel; }
    public double getGraisses() { return graisses; }
    public double getFibres() { return fibres; }
    public double getProteines() { return proteines; }

    public List<Ingredient> getIngredients() { return ingredients; }
    public List<Additif> getAdditifs() { return additifs; }
    public List<Allergene> getAllergenes() { return allergenes; }


    // --- Méthodes d'ajout ---
    public void addIngredient(Ingredient i) {
      ingredients.add(i);
    }

    public void addAdditif(Additif a) {
      additifs.add(a);
    }

    public void addAllergene(Allergene a) {
      allergenes.add(a);
    }






    // ------------------------------------------------------------------ OVERRIDES -----------------------------------------------------------------------------
    @Override
    public String toString() {
      return "Produit {" +
        "categorie=" + categorie +
        ", marque=" + marque +
        ", scoreNutritionnel='" + scoreNutritionnel + '\'' +
        ", energie=" + energie +
        ", sucre=" + sucre +
        ", sel=" + sel +
        ", graisses=" + graisses +
        ", fibres=" + fibres +
        ", proteines=" + proteines +
        ", ingredients=" + ingredients +
        ", additifs=" + additifs +
        ", allergenes=" + allergenes +
        '}';
    }


  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Produit produit = (Produit) o;
    return Double.compare(energie, produit.energie) == 0 && Double.compare(sucre, produit.sucre) == 0 && Double.compare(sel, produit.sel) == 0 && Double.compare(graisses, produit.graisses) == 0 && Double.compare(fibres, produit.fibres) == 0 && Double.compare(proteines, produit.proteines) == 0 && Objects.equals(categorie, produit.categorie) && Objects.equals(marque, produit.marque) && scoreNutritionnel == produit.scoreNutritionnel && Objects.equals(ingredients, produit.ingredients) && Objects.equals(additifs, produit.additifs) && Objects.equals(allergenes, produit.allergenes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categorie, marque, scoreNutritionnel, energie, sucre, sel, graisses, fibres, proteines, ingredients, additifs, allergenes);
  }



}
