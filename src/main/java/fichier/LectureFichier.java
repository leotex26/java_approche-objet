package fichier;

import java.io.*;
import java.util.ArrayList;

public class LectureFichier {
  public static void main(String[] args) throws IOException {
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

    System.out.println(villes);


    villes.removeIf(v -> v.getPopulationTotale() < 25000);


    String pathExport = "./asset/villes.csv";


    try (FileWriter writer = new FileWriter(pathExport)) {
      writer.append("nom|codeDepartement|nomRegion|populationTotale\n");

        for (Ville ville : villes) {
          writer.append(ville.getNom() + "|" +
            ville.getCodeDepartement() + "|" +
            ville.getNomRegion() + "|" +
            ville.getPopulationTotale());
          writer.append("\n");
        }


    }catch (IOException e) {
      e.printStackTrace();
    }



  }
}
