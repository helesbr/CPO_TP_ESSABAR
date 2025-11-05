/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_essabar;

/**
 *
 * @author helia
 */
public class Personne {

    String nom;
    String prenom;
    int nbVoitures;
    Voiture[] liste_voitures;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.liste_voitures = new Voiture[3];
        this.nbVoitures = 0;

    }

    @Override
    public String toString() {
        return "Nom : " + nom + "Prenom : " + prenom;
    }
    
    public boolean ajouer_voiture(Voiture voiture_a_ajouter){
        if (voiture_a_ajouter.Proprietaire != null){
            return false;       
    }
        if (nbVoitures >= liste_voitures.length){
            return false;
        }
        else {
           liste_voitures[nbVoitures]= voiture_a_ajouter;
           nbVoitures++;
           voiture_a_ajouter.Proprietaire = this ; 
           return true;
        }
    }
}
