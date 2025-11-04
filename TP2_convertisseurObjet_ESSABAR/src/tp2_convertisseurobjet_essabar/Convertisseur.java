/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_essabar;

/**
 *
 * @author helia
 */
public class Convertisseur {

    int nbConversions = 0;

    public double CelciusVersKelvin(double valeur) {
        nbConversions++;
        return valeur + 273;
    }

    public double KelvinVersCelcius(double valeur) {
        nbConversions++;
        return valeur - 273;
    }

    public double FarenheitVersCelcius(double valeur) {
        nbConversions++;
        return (valeur - 32) * (5.0 / 9.0);
    }

    public double CelciusVersFarenheit(double valeur) {
        nbConversions++;
        return (valeur * (9.0 / 5.0)) + 32;
    }

    public double KelvinversFarenheit(double valeur) {
        nbConversions--;
        return CelciusVersFarenheit(KelvinVersCelcius(valeur));
        
    }

    public double FarenheitVersKelvin(double valeur) {
        nbConversions--;
        return CelciusVersKelvin(FarenheitVersCelcius(valeur));
    }

    @Override
    public String toString() {
        return "nb de conversions" + nbConversions;
    }

    public void afficherNombreConversions() {
        System.out.println("nombres de converssions effectuees : " + nbConversions);
    }

}
