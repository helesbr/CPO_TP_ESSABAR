/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_calculette;

import java.util.Scanner;

/**
 *
 * @author helia
 * exercice 3 : TP0
 */
public class TP0_calculette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float resultat = 0;
        Scanner sc = new Scanner(System.in);
        float operateur;

        // Boucle for : redemande tant que le nombre n'est pas entre 1 et 5
        for (;;) {
            System.out.println("""
                   Please enter the operator: 
                   1) add
                   2) substract
                   3) multiply
                   4) divide
                   5) modulo
                   """);

            operateur = sc.nextInt();

            if (operateur >= 1 && operateur <= 5) {
                break; // 
            }

            System.out.println(" Choose a number between 1 and 5!");
        }

        System.out.println("Please enter the first number");
        float operande1 = sc.nextFloat();

        System.out.println("Please enter the second number");
        float operande2 = sc.nextFloat();
        
        if ((operateur == 4 && operande2 ==0 )) { 
            System.out.println(" You can't divide by 0");
            return;
        }

        if (operateur == 1) {
            resultat = operande1 + operande2;
        } else if (operateur == 2) {
            resultat = operande1 - operande2;
        } else if (operateur == 3) {
            resultat = operande1 * operande2;
        } else if (operateur == 4) {
            resultat = operande1 / operande2;
        } else if (operateur == 5) {
            resultat = operande1 % operande2;
        }

        System.out.println("The result is: " + resultat);
        sc.close();
    }
}