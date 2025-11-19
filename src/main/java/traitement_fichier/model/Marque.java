package traitement_fichier.model;

import java.text.Normalizer;

public class Marque implements Comparable<Marque> {

  private String libelle;

  public Marque(String libelle) {
    this.libelle = normalize(libelle);
  }

  public String getLibelle() {
    return libelle;
  }


  private String normalize(String s) {
    if (s == null) return "";

    // enlever accents (É -> E, ï -> i, Œ -> OE)
    String norm = Normalizer.normalize(s, Normalizer.Form.NFD)
      .replaceAll("\\p{M}", "");

    // enlever caractères spéciaux invisibles
    norm = norm.replaceAll("[^\\p{Alnum} \\-']", "");

    // trim + espaces multiples
    norm = norm.trim().replaceAll("\\s+", " ");

    return norm.toLowerCase(); // important pour HashSet
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Marque)) return false;
    Marque m = (Marque) o;
    return libelle.equals(m.libelle);
  }

  @Override
  public int hashCode() {
    return libelle.hashCode();
  }

  @Override
  public int compareTo(Marque other) {
    return this.libelle.compareTo(other.libelle);
  }

  @Override
  public String toString() {
    return libelle;
  }
}

