/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_essabar;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author helia
 */
public class TP1_guessMyNumber_ESSABAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisissez le niveau de difficulte (facile, normal, difficile)");
        String mode = sc.next();
        Random generateurAleat = new Random();
        int n = 0;
        int max = 100;
        if (mode.equals("facile")) {
            max = 100;
            n = generateurAleat.nextInt(100);
        } else if (mode.equals("normal")) {
            max = 300;      
        n = generateurAleat.nextInt(300);}
        else if (mode.equals("difficile"))
        {
            max = 500;
            n = generateurAleat.nextInt(500);
        }
        int valeur = -1;
        int i = 0;
        while (valeur != n) {
            System.out.println("Saisissez un nombre entre 0 et " + max);
            valeur = sc.nextInt();
            i++;
            if (valeur > n) {
                System.out.println("trop grand");
            } else if (valeur < n) {
                System.out.println("trop petit");
            } else if (valeur == n) {
                System.out.println("gagne " + i + " tentatives");
            }

        }

    }
}
