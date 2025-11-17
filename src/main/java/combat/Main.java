package combat;

public class Main {

  static public boolean quit= false;

  public static void main(String[] args) {


    while(!quit){


      // déroulement normal
      // MessageJeu.menuChoixDepart() > MessageJeu.creationPersonnage() > aventure(Personnage p)

      MessageJeu.messageBienvenu();
      MessageJeu.menuChoixDepart();

    }



  }
}
