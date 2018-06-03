/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimerosEjercicios;

import java.util.Scanner;

/**
 *
 * @author Programacion I 2B
 */
public class SumaDe2Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese primer numero");
        int numero1 = scan.nextInt();
        
        System.out.println("Ingrese segundo nuemro");
        int numero2 = scan.nextInt();
        
        int total = numero1 + numero2;
        System.out.println("La suma de los numeros es : "+ total);
        
    }

}
