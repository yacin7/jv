/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.prosit4;

/**
 *
 * @author cercina
 */
public class Prosit4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Magasin mag = new Magasin(1, "carrefour", "centre-ville");
        Magasin mag2 = new Magasin(2, "Monoprix", "menzah 6");
        
        Caissier c1 = new Caissier(1, "xx", "aqw", 22, 10);
        Caissier c2 = new Caissier(2, "yy", "aqw", 20, 10);
        Vendeur v1 = new Vendeur(1, "salah", "tunis", 14, 20);
        Responsable r1 = new Responsable(1, "chef", "tunis", 12, 40.0);
        
        Caissier c3 = new Caissier(1, "zz", "aqw", 22, 10);
        Vendeur v2 = new Vendeur(2, "salah", "tunis", 14, 20);
        Vendeur v3 = new Vendeur(3, "flen", "tunis", 14, 20);
        Vendeur v4 = new Vendeur(4, "falten", "tunis", 14, 20);
        Responsable r2 = new Responsable(11, "azerty", "tunis", 161, 40.0);
       
       mag.employe.add(c1);
       mag.employe.add(c2);
       mag.employe.add(v1);
       mag.employe.add(r1);
       
       mag2.employe.add(c3);
       mag2.employe.add(v2);
       mag2.employe.add(v3);
       mag2.employe.add(v4);
       mag2.employe.add(r2);
      
       Produit p =new Produit(1022, "lait", "delice", 1200);
       Produit p1 =new Produit(1022, "yaourt", "delice", 400);
       Produit p2 =new Produit(1022, "choco", "aa", 500);
       Produit p3 =new Produit(1022, "xx", "zz", 1000);
       mag.produits.add(p);
       mag.produits.add(p1);
       mag.produits.add(p2);
       mag2.produits.add(p3);
        mag.afficher();
        c1.salaire();
        r2.salaire();
    }
    
}
