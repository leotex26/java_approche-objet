package tri;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class TriTest {
  public static void main(String[] args) {
    String path = "./asset/recensement.csv";
    ArrayList<Ville> villes = new ArrayList<>();

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      String ligne;


      br.readLine();

      while ((ligne = br.readLine()) != null) {
        String[] temp = ligne.split(";");

        Ville ville = new Ville();
        ville.setCodeDepartement(temp[0]);
        ville.setNomRegion(temp[1]);
        ville.setNom(temp[6]);
        ville.setPopulationTotale(Integer.parseInt(temp[9].replace(" ", "")));


        villes.add(ville);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    Collections.sort(villes);

    villes.removeIf(v -> v.getPopulationTotale() < 25000);

    //System.out.println(villes);



    // EXO 4

    Collections.sort(villes, new ComparatorHabitant());
    System.out.println("===== Tri par population =====");
    for (Ville v : villes) {
      System.out.println(v);
    }


    Collections.sort(villes, new ComparatorNom());
    System.out.println("\n===== Tri par nom =====");
    for (Ville v : villes) {
      System.out.println(v);
    }


  }
}
