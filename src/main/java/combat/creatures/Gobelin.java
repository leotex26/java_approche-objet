package combat.creatures;

import java.util.concurrent.ThreadLocalRandom;

public class Gobelin extends Creature {
  private String nom  = "Gobelin";;
  private int sante;
  private int force;
  static String ASCIIDescription ="                                               \n" +
    "                                               \n" +
    "                                               \n" +
    "               -.  :-------:  .-.              \n" +
    "        .--.    ---------------    .--.        \n" +
    "          :=+=: :-------------: :=+=:          \n" +
    "           :=++==*%#===-===#%*==++=:           \n" +
    "            .=+=---*++=-=+=*---=+=:            \n" +
    "               .---------------.               \n" +
    "                 ----++-++----.                \n" +
    "                 :-..-==-- .--                 \n" +
    "              .-==+=-------=+==-.              \n" +
    "             -=====++=---=++=====-.            \n" +
    "           :===:.-====+++=====.:===:           \n" +
    "          ===:   =============.  :===          \n" +
    "         :=-     -============     -=:         \n" +
    "        .==.     .===========:     .==.        \n" +
    "        -+=      =+++++++++++=      =+-        \n" +
    "        =+.     -*************-     .++        \n" +
    "      .+++==   .**+.   ..  .+**    -=+++:      \n" +
    "      ==+.      +*-         -*+      .+==      \n" +
    "        =       :*+         +*:       =        \n" +
    "             -=====:       .=====-             \n" +
    "                                               \n" +
    "                                               \n" +
    "                                               \n" +
    "                                               ";

  public Gobelin() {
    super("Gobelin", ThreadLocalRandom.current().nextInt(10, 16),
      ThreadLocalRandom.current().nextInt(5, 11),
      ASCIIDescription);
  }

  @Override
  public String toString() {
    return "Gobelin{" +
      "nom='" + nom + '\'' +
      ", sante=" + sante +
      ", force=" + force +
      '}';
  }
}
