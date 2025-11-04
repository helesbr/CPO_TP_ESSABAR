/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_essabar;

import java.util.Scanner;

/**
 *
 * @author helia
 */
public class TP2_convertisseurObjet_ESSABAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Bonjour saisissez une valeur : ");
        double valeur = sc.nextDouble();
        System.out.println("Saisissez la conversion que vous souhaiter effectuer : \n 1) De Celcius vers Kelvin \n 2) De Kelvin vers Celcius \n 3) Farenheit vers Celcius \n 4) Celcius vers Farenheit \n 5) Kelvin vers Farenheit \n 6) Farenheit vers Kelvin ");
        double conversion = sc.nextDouble();
        Convertisseur conv = new Convertisseur ();
        
        if (conversion == 1) {
            System.out.println(valeur +" degre Celcius est egal a "+ conv.CelciusVersKelvin(valeur)+ " degres Kelvin ");
        }
        else if (conversion == 2) {
            System.out.println(valeur +" degre Kelvin est egal a "+ conv.KelvinVersCelcius(valeur)+ " degres Kelvin");
        }
        else if (conversion == 3) {
            System.out.println(valeur+ " degre Farenheit est egal a "+ conv.FarenheitVersCelcius(valeur)+ " degres Celcius");
        }
        else if (conversion == 4) {
            System.out.println(valeur+ " degre Celcius est egal a "+conv.CelciusVersFarenheit(valeur)+ " degre Farenheit");
        }
        else if (conversion == 5) {
            System.out.println(valeur+ " degre Kelvin est egal a "+ conv.KelvinversFarenheit(valeur) +" degres Farenheit");
        }
        else if (conversion == 6) {
            System.out.println(valeur+ " degre Farenheit est egal a "+ conv.FarenheitVersKelvin(valeur) + " degres Kelvin");
        }
        conv.afficherNombreConversions();
    }
    
}

