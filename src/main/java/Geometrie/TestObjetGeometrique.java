package Geometrie;

public class TestObjetGeometrique {

  public static void main(String[] args) {

    ObjetGeometrique[] objets = new ObjetGeometrique[2];

    ObjetGeometrique ob1 = new Cercle(5);
    ObjetGeometrique ob2 = new Rectangle(6,3);

    objets[0] = ob1;
    objets[1] = ob2;

    for (ObjetGeometrique obj : objets) {
      System.out.println("Surface :"+obj.surface()+" Perimetre :"+obj.perimetre());
    }

  }
}
