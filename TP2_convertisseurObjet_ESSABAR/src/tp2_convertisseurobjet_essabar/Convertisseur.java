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
    
public double CelciusVersKelvin(double valeur){
    double nbConversions = valeur + 273;
        return nbConversions;
}
public double KelvinVersCelcius(double valeur) {
        double nbConversions = valeur - 273;
        return nbConversions;
}
 public double FarenheitVersCelcius(double valeur) {
        double nbConversions = (valeur - 32) * (5.0 / 9.0);
        return nbConversions;
 }
 public double CelciusVersFarenheit(double valeur) {
        double nbConversions = (valeur * (9.0 / 5.0)) + 32;
        return nbConversions;
    }
 public double FarenheitVersKelvin (double valeur){
     double nbConversions = CelciusVersKelvin(FarenheitVersCelcius(valeur));
 return nbConversions;
 }
 public double KelvinversFarenheit (double valeur){
  double nbConversions = CelciusVersFarenheit(KelvinVersCelcius(valeur));    
 return nbConversions;
 }
}