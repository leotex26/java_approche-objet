package operations;


import java.util.Arrays;

public class CalculMoyenne {
  private double[] tab;

 public CalculMoyenne(double[] tab) {
   this.tab = tab;
 }

 public CalculMoyenne() {
   this.tab = new double[0]; // >
 }


  // ------------------------------- FONCTIONS -------------------------------------------

  /**
  *@args Double à ajouter au tableau
  *
   */
  public void ajout(double a) {
    double[] temp = Arrays.copyOf(this.tab, this.tab.length + 1);
    temp[temp.length - 1] = a;
    this.tab = temp;
  }

  /**
   * fonction qui fait la moyenne du tableau tab de l'instance de CalculMoyenne
   * @param
   * @return moyenne
   */
  public double calcul() {

    double average = 0.0;

    for (int i = 0; i < this.tab.length; i++) {
      average += this.tab[i];
    }

    return average/this.tab.length;
  }


  public double[] getTab() {
    return tab;
  }

  @Override
  public String toString() {
    return "CalculMoyenne{" +
      "tab=" + Arrays.toString(tab) +
      '}';
  }
}
