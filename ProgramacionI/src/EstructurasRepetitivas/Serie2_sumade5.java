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
public class Serie2_sumade5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el numero de terminos a generar:");
        int n = scan.nextInt();

        //int serie = 5;
        // for (int i =1 ; i <= n; i++) {
        //     System.out.println(serie);
        //      serie = serie + 5;
        //  }
        
        
        
        // int j = 1;
        //  for (int i = 5; j <= n; i = i + 5) {
        //      System.out.print(i + "  ");
        //     j=j+1;
        // }
        
        
        for (int i = 5; i <= (n * 5); i = i + 5) {
            System.out.print(i + " ");}
        

        }

    }
