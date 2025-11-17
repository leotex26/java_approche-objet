package combat.creatures;

import java.util.concurrent.ThreadLocalRandom;

public class Loup extends Creature {
  private String nom = "Loup";
  private int sante;
  private int force;

  static String ASCIIDescription = "                             .#*.   \n" +
    "                           .-+-@.   \n" +
    "                         .*=..%%*=  \n" +
    "                        =#..-@@#.   \n" +
    "                     :%+#%**%%@-    \n" +
    "                      :%%%=%-=@#.   \n" +
    "                    .-@=:.:#*#@@+   \n" +
    "                    -#:*%-%=%@@@+   \n" +
    "                .--+%+%##%#%%%*%+   \n" +
    "          :-+#*%#=.+#::=#@@%=+%@*   \n" +
    "       .#@=+-###*%:%*:*+-:%+#%@@.   \n" +
    "     ..%@@+=**:*.#+%%:%@@%%=%@@=.   \n" +
    "    .=%*@#%#@=#=+:#%-:@%@@@@@@=.    \n" +
    "    :%:*#--@@@@@@@%%.==%#.%@%#.     \n" +
    "   -%.:%#*#++@@@@%@@%*@@+@@%..      \n" +
    " .*+*.+@#::#@@@%+..=@@@%@@=         \n" +
    " =*-*%%%=#%@@@%.   =@@:+@%.         \n" +
    ".%@%@%@*%-*@%-.    *@%.+@#.         \n" +
    " .%#..%%.+@+.     .*@: #%-          \n" +
    "  .. .%% :@+      .%@. *@:          \n" +
    "     .#@+.=@#-     #@=.:@#-.        \n" +
    "  .-=+*##%%%@%@@@@@@@@@@%%##*+=-.   ";

  public Loup() {
    super("Loup",ThreadLocalRandom.current().nextInt(5, 11),
      ThreadLocalRandom.current().nextInt(3, 9),
      ASCIIDescription);
  }

  @Override
  public String toString() {
    return "Loup{" +
      "nom='" + nom + '\'' +
      ", sante=" + sante +
      ", force=" + force +
      '}';
  }

}
