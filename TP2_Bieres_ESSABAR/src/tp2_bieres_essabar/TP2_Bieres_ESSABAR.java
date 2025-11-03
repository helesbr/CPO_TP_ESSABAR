/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_essabar;

/**
 *
 * @author helia
 */
public class TP2_Bieres_ESSABAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere();
        uneBiere.nom = "cuvée des trolls";
        uneBiere.degreAlcool = 7.0;
        uneBiere.brasserie = "Dubuisson";

        uneBiere.lireEtiquette();
    }

}
