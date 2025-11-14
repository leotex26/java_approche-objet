package testenumeration;

public enum Continent {

  AFRIQUE("afrique"),
  AMERIQUE("Amérique"),
  ASIE("Asie"),
  EUROPE("Europe"),
  OCEANIE("Oceanie");

  private String libelle;


  private Continent(String libelle) {
    this.libelle = libelle;
  }

  public String getLibelle() {
    return libelle;
  }


}
