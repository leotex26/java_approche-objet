package listes;

import java.util.ArrayList;
import java.util.Collections;

// BUG : j'ai pas pu tester
public class TestListeInt {
  public static void main(String[] args) {
    ArrayList<Integer> nombres = new ArrayList<Integer>();

    nombres.add(-1);
    nombres.add(5);
    nombres.add(7);
    nombres.add(3);
    nombres.add(-2);
    nombres.add(4);
    nombres.add(8);
    nombres.add(5);

    System.out.println("nombres: "+nombres);

    System.out.println("taille de l'arrayList : "+nombres.size());

    int max = nombres.get(0);
    for (int i = 0; i < nombres.size(); i++) {
      if (nombres.get(i) > max) {
        max = nombres.get(i);
      }
    }
    System.out.println("max : "+max);


    int min = Collections.min(nombres);
    System.out.println("min : "+min);
    nombres.remove(Integer.valueOf(min));
    System.out.println("arrayList sans min : "+nombres);

    for (int i = 0; i < nombres.size(); i++) {
      if (nombres.get(i) < 0) {
        nombres.set(i, Math.abs(nombres.get(i)));
      }
    }

    System.out.println("liste finale: "+nombres);

  }
}
