/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasRepetitivas;

import java.util.Scanner;

/**
 *
 * @author Programacion I 2B
 */
public class Numeros1_N {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Hasta que numero desea presentar la serie:");
        int a = scan.nextInt();

        for (int i = 1; i <= a; i++) {
            System.out.print(i+" ");
        }

    }

}
