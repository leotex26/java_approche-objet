package dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
  public static void main(String[] args) {
    Calendar cal = Calendar.getInstance();
    cal.set(2016, Calendar.MAY, 19, 23, 59, 30); // <<<
    Date date2016 = cal.getTime();

    Date date = new Date();

    SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
    System.out.println("Date 19/05/2016 : " + sdf1.format(date2016));

    Calendar calToday = Calendar.getInstance();
    Date dateNow = calToday.getTime();

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    System.out.println("Date Today : " + sdf.format(dateNow));

    // --- Affichage en différentes langues ---
    SimpleDateFormat sdfLocale =
      new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.FRANCE);
    SimpleDateFormat sdfRU =
      new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", new Locale("ru"));
    SimpleDateFormat sdfCN =
      new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.CHINA);
    SimpleDateFormat sdfDE =
      new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.GERMANY);

    System.out.println("\n--- Affichage multilingue ---");
    System.out.println("Français : " + sdfLocale.format(dateNow));
    System.out.println("Russe : " + sdfRU.format(dateNow));
    System.out.println("Chinois : " + sdfCN.format(dateNow));
    System.out.println("Allemand : " + sdfDE.format(dateNow));

  }
}
