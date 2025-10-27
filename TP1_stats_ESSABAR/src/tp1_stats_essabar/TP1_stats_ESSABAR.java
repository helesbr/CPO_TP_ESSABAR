/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_essabar;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author helia
 */
public class TP1_stats_ESSABAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();
        double[] Tab = new double[6];
        System.out.println("Saisissez un nombre entier");
        double m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int n = generateurAleat.nextInt(5);
            Tab[n] += 1;
        }
        for (int i = 0; i < Tab.length; i++) {
            System.out.print(" Face "+ (i+1)+ " : " +(Tab[i])/m*100);
        }
    }

}
