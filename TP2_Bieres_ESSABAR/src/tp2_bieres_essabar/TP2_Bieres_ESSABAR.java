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
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls", 7.0, "Dubuisson");
        uneBiere.nom = "cuvee des trolls";
        uneBiere.degreAlcool = 7.0;
        uneBiere.brasserie = "Dubuisson";
        uneBiere.ouverte = false;
        uneBiere.lireEtiquette();
    
    BouteilleBiere Leffe = new BouteilleBiere("Leffe", 6.6,"Abbaye de Leffe") ;
    Leffe.lireEtiquette();
    if(Leffe.Decapsuler()==true){
        System.out.println("La biere a ete ouverte");
    }
    
    BouteilleBiere Heineken = new BouteilleBiere("Heineken", 8.3, "Pays-Bas");
    Heineken.lireEtiquette();
    
    BouteilleBiere Guinness = new BouteilleBiere("Guinness", 5.2, "Irlande");
    Guinness.lireEtiquette();
    if(Guinness.Decapsuler()==true){
        System.out.println("La biere a ete ouverte");
    }
    System.out.println(uneBiere);
    System.out.println(Guinness);
    }                                                                                       
    
}
        
        


