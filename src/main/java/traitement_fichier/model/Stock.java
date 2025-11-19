package traitement_fichier.model;

import java.util.ArrayList;

public class Stock {
  private ArrayList<Produit> produits;

  public Stock(ArrayList<Produit> produits) {
    this.produits = produits;
  }


  public ArrayList<Produit> getProduits() {
    return produits;
  }

  //public void setProduits(ArrayList<Produit> produits) {
  //  this.produits = produits;
  //}

  public void addProduit(Produit produit) {
    produits.add(produit);
  }

  public void removeProduit(Produit produit) {
    produits.remove(produit);
  }





}
