/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasRepetitivas;

import java.util.Scanner;

/**
 *
 * @author Mario 2
 */
public class Suma_De_potencias_de_3 {

    public static void main(String[] args) {
        //Presentar los n primeros numeros de la siguiente serie:(1,2,5,14,41,122.....n)    
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros a generar:");
        int n = scan.nextInt();


        
        int e = 0;
        int serie = 1;

        for (int i = 1; i <=n; i++) {
            System.out.print(serie + " ,");
            serie = (int) (serie + Math.pow(3, e));
            e = e + 1;
        }

        /*WHILE
        int e = 0;
        int serie = 1;
        int i = 1;
        while (i <= n) {
            System.out.print(serie + " ,");
            serie = (int) (serie + Math.pow(3, e));
            e = e + 1;
            i++;
        }
         */
 
 
        /*DO-WHILE
        int e = 0;
        int serie = 1;
        int i = 1;
        do {
            System.out.print(serie + " ,");
            serie = (int) (serie + Math.pow(3, e));
            e = e + 1;
            i++;
        } while (i <= n);
        */
    }

}
