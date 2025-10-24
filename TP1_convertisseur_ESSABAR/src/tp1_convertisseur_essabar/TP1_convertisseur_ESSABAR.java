/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_essabar;

import java.util.Scanner;

/**
 *
 * @author helia
 */
public class TP1_convertisseur_ESSABAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Bonjour saisissez une valeur : ");
        double valeur = sc.nextDouble();
        System.out.println("Saisissez la conversion que vous souhaiter effectuer : \n 1) De Celcius vers Kelvin \n 2) De Kelvin vers Celcius \n 3) Farenheit vers Celcius \n 4) Celcius vers Farenheit \n 5) Kelvin vers Farenheit \n 6) Farenheit vers Kelvin ");
        double conversion = sc.nextDouble();

        if (conversion == 1) {
            double tKelvin = CelciusVersKelvin(valeur);
            System.out.println(valeur +" degre Celcius est egal a "+ tKelvin+ " degres Kelvin ");
        } else if (conversion == 2) {
            double tCelcius = KelvinVersCelcius(valeur);
            System.out.println(valeur +" degre Kelvin est egal a "+tCelcius+ " degres Kelvin");
        } else if (conversion == 3) {
            double tCelcius = FarenheitVersCelcius(valeur);
            System.out.println(valeur+ " degre Farenheit est egal a "+ tCelcius+ " degres Celcius");
        } else if (conversion == 4) {
            double tFarenheit = CelciusVersFarenheit(valeur);
            System.out.println(valeur+ " degre Celcius est egal a "+ tFarenheit+ " degre Farenheit");
        } else if (conversion == 5) {
            double tFarenheit = CelciusVersFarenheit(KelvinVersCelcius(valeur));
            System.out.println(valeur+ " degre Kelvin est egal a "+ tFarenheit +" degres Farenheit");
        } else if (conversion == 6) {
            double tKelvin = CelciusVersKelvin(FarenheitVersCelcius(valeur));
            System.out.println(valeur+ " degre Farenheit est egal a "+ tKelvin + " degres Kelvin");
        }

        // TODO code application logic here
    }

    public static double CelciusVersKelvin(double valeur) {
        double b = valeur + 273;
        return b;
    }

    public static double KelvinVersCelcius(double valeur) {
        double c = valeur - 273;
        return c;
    }

    public static double CelciusVersFarenheit(double valeur) {
        double d = (valeur * (9.0 / 5.0)) + 32;
        return d;
    }

    public static double FarenheitVersCelcius(double valeur) {
        double e = (valeur - 32) * (5.0 / 9.0);
        return e;
    }

}
