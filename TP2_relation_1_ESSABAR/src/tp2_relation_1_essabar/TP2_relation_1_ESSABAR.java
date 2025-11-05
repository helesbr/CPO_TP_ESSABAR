/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_essabar;

/**
 *
 * @author helia
 */
public class TP2_relation_1_ESSABAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voiture uneClio = new Voiture("Clio", "Renault", 5);
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 4);
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        System.out.println("liste des voitures disponibles :\n" + uneClio
                + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra);

        bob.liste_voitures[0] = uneClio;
        bob.liste_voitures[1] = uneAutreClio;
        bob.nbVoitures = 2;
        uneClio.Proprietaire = bob;
        uneAutreClio.Proprietaire = bob;
        System.out.println("La premiere voiture de Bob est " + bob.liste_voitures[0] ) ;
        System.out.println("La deuxieme voiture de Bob est " + bob.liste_voitures[1] ) ;
        reno.liste_voitures[0] = une2008;
        une2008.Proprietaire = reno;
        System.out.println("La premiere voiture de reno est "+ reno.liste_voitures[0]);
        reno.liste_voitures[1] = uneMicra;
        uneMicra.Proprietaire = reno;
        reno.nbVoitures = 2;
        System.out.println("La deuxieme voiture de reno est "+ reno.liste_voitures[1]) ;
        
        
    }

}
