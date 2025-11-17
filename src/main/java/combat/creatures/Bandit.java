package combat.creatures;

import java.util.concurrent.ThreadLocalRandom;

public class Bandit extends Creature {
  private String nom = "Bandit";
  private int sante;
  private int force;
  static String ASCIIDescription = "                    ...-#@%..       \n" +
    "                  ..*@%@%.          \n" +
    "               .=%##@*.             \n" +
    "      .:=. .:#%++@+.                \n" +
    "    .:*.-%@#.#@=.                   \n" +
    "  .*@@%**+@+-..                     \n" +
    "..-#*@*+@..%.                       \n" +
    "#=*.=@@@   ..                       \n" +
    "     :@@@.                          \n" +
    "     .@@@*.        ...:.            \n" +
    "     .@@@@+.    ..%@@@@@@.          \n" +
    "      =@@@+:    .@@%#@@@@.          \n" +
    "      .@@@+-.   :@@@%@@%@@..        \n" +
    "       .%@@@%.  :@@@=@@@#%%.        \n" +
    "        .@@@#*:*@@%@@#@@%#          \n" +
    "        .%-:#@*@-=@@@:@:::          \n" +
    "         .-@@@@@@%#:@**+..          \n" +
    "          .*@@@@@@#%*#=.@@#+..      \n" +
    "          .#@@@@@@%.+-::-%#+@:.     \n" +
    "           .@@@@@@@@@-:.....@@:.    \n" +
    "           .:@@@@@@@@@@@%: .%=-.    \n" +
    "            ..#@@@@@@%#%*+%+@@@*.   \n" +
    "              .@@@@@@@*@@..@@@@@-...\n" +
    "          .-+***#%@@%#*-:...........";

  public Bandit() {
    super("Bandit", ThreadLocalRandom.current().nextInt(12, 18),
      ThreadLocalRandom.current().nextInt(6, 15),
      ASCIIDescription);
  }

  @Override
  public String toString() {
    return "Bandit{" +
      "nom='" + nom + '\'' +
      ", sante=" + sante +
      ", force=" + force +
      '}';
  }
}
