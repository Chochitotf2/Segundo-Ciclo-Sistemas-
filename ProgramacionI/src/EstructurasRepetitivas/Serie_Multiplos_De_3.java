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
public class Serie_Multiplos_De_3 {

    public static void main(String[] args) {

        //Presentar los n primeros numeros de la siguiente serie:(1,3,9,27,81.....n)    
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros a generar:");
        int n = scan.nextInt();

        int pow = (int) (Math.pow(3, n - 1));

        for (int i = 1; i <= pow; i = i * 3) {
            System.out.print(i + ", ");

        }

        /*WHILE
        
        
        int i=1;
        while(i<=pow){
            System.out.print(i+ ", ");
            i=i*3;
    }
         */
         
        
        /*DO WHILE
        int i = 1;
        do {
            System.out.print(i + ", ");
            i = i * 3;
        } while (i <= pow);
         */
    }

}
