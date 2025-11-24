/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_essabar;

import Personnages.Personnage;
import Personnages.Magicien;
import Personnages.Guerrier;
import Armes.Baton;
import Armes.Epee;
import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author helia
 */
public class TP3_Heroic_Fantasy_ESSABAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee epee1 = new Epee("Excalibur", 7, 5);
        Epee epee2 = new Epee("Durandal", 4, 7);
        Epee epee3 = new Epee("Sabre",10, 6);
        Epee epee4 = new Epee("Katana", 15, 5);
        Baton baton1 = new Baton("Chene", 4, 5);
        Baton baton2 = new Baton("Charme", 5, 6);
        Baton baton3 = new Baton("Erable", 7, 3);
        Baton baton4 = new Baton("Platane", 10, 8);
        
        System.out.println(epee1);

        ArrayList<Arme> Tab1 = new ArrayList<Arme>();

        Tab1.add(epee1);
        Tab1.add(epee2);
        Tab1.add(epee3);
        Tab1.add(epee4);
        Tab1.add(baton1);
        Tab1.add(baton2);
        Tab1.add(baton3);
        Tab1.add(baton4);
        

        for (int i = 0; i < Tab1.size(); i++) {
            Arme armeCourante = Tab1.get(i);
            System.out.println("Arme " + i + " : " + armeCourante);
        }
        Magicien magicien1 = new Magicien("Gandalf", 65, true);
        Magicien magicien2 = new Magicien("Garcimore", 44, false);
        Magicien magicien3 = new Magicien("Atlas", 80, false );
        Magicien magicien4 = new Magicien("wizard", 60, false);
        Guerrier guerrier1 = new Guerrier("Conan", 78, false);
        Guerrier guerrier2 = new Guerrier("Lannister", 45, true);
        Guerrier guerrier3 = new Guerrier("Yuji", 100, true);
        Guerrier guerrier4 = new Guerrier("Ragnar", 200, true);
        Guerrier guerrier5 = new Guerrier("Floki",60, true);

        ArrayList<Personnage> Tab2 = new ArrayList<Personnage>();

        Tab2.add(guerrier1);
        Tab2.add(guerrier2);
        Tab2.add(guerrier3);
        Tab2.add(guerrier4);
        Tab2.add(guerrier5);
        
        Tab2.add(magicien1);       
        Tab2.add(magicien2);
        Tab2.add(magicien3);
        Tab2.add(magicien4);

        guerrier3.ajouterArme(baton1);
        guerrier3.ajouterArme(epee1);
        guerrier3.ajouterArme(epee2);
        guerrier3.Arme_en_Main(epee1);
        guerrier4.ajouterArme(epee4);
        guerrier5.ajouterArme(epee4);
        guerrier4.Arme_en_Main(epee4);
        guerrier5.Arme_en_Main(epee4);
        
        magicien2.ajouterArme(baton1);
        magicien2.ajouterArme(baton2);
        magicien3.ajouterArme(baton3);
        magicien3.Arme_en_Main(baton3);

        magicien2.ajouterArme(epee1);
        System.out.println("Voici le nombre d'armes preferees du magicien2 : " + magicien2.nbArmes.size());

        guerrier4.seFatiguer();
        guerrier4.attaquer(magicien4);

        for (int a = 0; a < Tab2.size(); a++) {
            Personnage personangeCourant = Tab2.get(a);
            System.out.println("Personnage " + a + " : " + personangeCourant);

        }
        if (guerrier4.estVivant()) {
            System.out.println("Le guerrier est toujours vivant");
        } else {
            System.out.println("Le guerrier est mort");
        }
        
        guerrier5.attaquer(magicien3);
        magicien3.attaquer(guerrier5);
        
    }
}
