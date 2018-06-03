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
public class Pares_Entre_UnLimite {

    public static void main(String[] args) {
        
        //Pares entre n1 y n2 

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese en el numero e el qe se desea inciar la serie :");
        int n1 = scan.nextInt();

        System.out.println("Ingrese en el limite de la serie :");
        int n2 = scan.nextInt();

        for (int i = n1; i <= n2;i++) {
            if (i % 2 == 0){
                System.out.print(i + "  ");
            }
        }

    }

}
