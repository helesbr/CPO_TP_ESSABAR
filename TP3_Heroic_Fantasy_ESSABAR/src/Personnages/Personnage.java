/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;
import Armes.Arme; 
import java.util.ArrayList;

/**
 *
 * @author helia
 */
public abstract class Personnage {
    String nom;
    int niveauDeVie;
    Arme armeActuelle=null;

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
    public ArrayList<Arme> nbArmes = new ArrayList<>();
    
    public boolean ajouterArme(Arme nouvelle){
    if (nbArmes.size()<5){
    nbArmes.add(nouvelle);
    return true;
}
    else {
        System.out.println("Impossible d'ajouter plus de 5 armes");
    return false;
    }
    }
    
    public void Arme_en_Main(Arme armeActuelle){
        this.armeActuelle = armeActuelle;
    }

    public Arme getArmeActuelle() {
        return armeActuelle;
    }
    
    public void equiperArme(String nomArme){
        boolean trouve = false;
        for (Arme a : nbArmes){
            if (a.getNom().contains(nomArme)){
                armeActuelle = a;
               System.out.println("Arme trouvee et affectee");
               trouve=true;
               break;
            }
        }
        
    }

    
    
    @Override
    public String toString() {
        String infoArme;
        if (armeActuelle != null){
            infoArme = armeActuelle.toString();
        }
        else {
            infoArme="aucune";
        }
    return "Personnage : " + nom + " | Niveau de vie : " + niveauDeVie+ " Arme en main "+ infoArme;
    
}
}