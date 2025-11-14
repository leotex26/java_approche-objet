package dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {
  public static void main(String[] args) {
    Date dateDuJour = new Date();

    SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
    System.out.println("Date du jour : " +sdf1.format(dateDuJour));

    Date date2016 = new Date(116, 4, 19, 23, 59, 30);
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    System.out.println("Date spe :" +sdf2.format(date2016));

    Date dateSystem = new Date();
    System.out.println("Date système : " + sdf2.format(dateSystem));
  }
}
