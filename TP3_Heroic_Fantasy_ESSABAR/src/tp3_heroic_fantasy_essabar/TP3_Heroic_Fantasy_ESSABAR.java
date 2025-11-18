/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_essabar;

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
        Baton baton1 = new Baton("Chene", 4, 5);
        Baton baton2 = new Baton("Charme", 5, 6);
        System.out.println(epee1);
        ArrayList<Arme> Tab1 = new ArrayList<Arme>();

        Tab1.add(epee1);
        Tab1.add(epee2);
        Tab1.add(baton1);
        Tab1.add(baton2);

        for (int i = 0; i < Tab1.size(); i++) {
            Arme armeCourante = Tab1.get(i);
            System.out.println("Arme " + i + " : " + armeCourante);

            Magicien magicien1 = new Magicien("Gandalf", 65, true);
            Magicien magicien2 = new Magicien("Garcimore", 44, false);
            Guerrier guerrier1 = new Guerrier("Conan", 78, false);
            Guerrier guerrier2 = new Guerrier("Lannister", 45, true);

            ArrayList<Personnage> Tab2 = new ArrayList<Personnage>();
            Tab2.add(guerrier1);
            Tab2.add(guerrier2);
            Tab2.add(magicien1);
            Tab2.add(magicien2);

            for (int a = 0; a < Tab2.size(); a++) {
                Personnage personangeCourant = Tab2.get(a);
                System.out.println("Personnage " + a + " : " + personangeCourant);

            }
        }
    }
}
