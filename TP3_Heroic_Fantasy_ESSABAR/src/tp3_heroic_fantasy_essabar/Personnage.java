/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_essabar;

/**
 *
 * @author helia
 */
public abstract class Personnage {
    String nom;
    int niveauDeVie;

    public Personnage(String nom, int niveauDeVie) {
        this.nom = nom;
        this.niveauDeVie = niveauDeVie;
    }

    public String getNom() {
        return nom;
    }

    public int getNiveauDeVie() {
        return niveauDeVie;
    }
    
    @Override
    public String toString() {
        return "Personnage : " + nom + " | Niveau de vie : " + niveauDeVie;
    
    }
    
}
