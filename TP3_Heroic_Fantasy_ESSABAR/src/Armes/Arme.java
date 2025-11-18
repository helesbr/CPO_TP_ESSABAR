/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author helia
 */
public abstract class Arme {

    String nom;
    int niveauAttaque;

    public Arme(String nom, int niveauAttaque) {
        this.nom = nom;
        this.niveauAttaque = niveauAttaque;
    }

    @Override
    public String toString() {
        return "Nom : " + nom + " | Niveau d'attaque : " + niveauAttaque;
    }
}
