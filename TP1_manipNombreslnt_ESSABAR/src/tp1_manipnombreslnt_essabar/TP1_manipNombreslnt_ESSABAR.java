/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombreslnt_essabar;

import java.util.Scanner;

/**
 *
 * @author helia
 */
public class TP1_manipNombreslnt_ESSABAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = 0;
        double b = 0;
        System.out.println("choisissez un entier");
        a = sc.nextDouble();
        System.out.println("choisissez un autre entier");
        b = sc.nextDouble();
        System.out.println("Voici la somme, la difference, le produit, le quotient et le reste de la division euclidienne du premier par le second des deux entiers que vous avez choisis :\n"
                + (a + b) + "\n"
                + (a - b) + "\n"
                + (a * b) + "\n"
                + a/b + "\n"
                + a%b);

    }

}
