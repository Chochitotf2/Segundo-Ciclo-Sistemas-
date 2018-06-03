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
public class Presentar_el_mayor_de_n_numeros {

    public static void main(String[] args) {
        //Presentar el mayor de n numeros     
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros a comparar:");
        int n = scan.nextInt();

        /*For
        
        int mayor=0;
        
        for(int i=1;i<=n;i++){
         System.out.println("Ingrese un numero:");
        int a = scan.nextInt();   
        if(a>=mayor){
        mayor=a ;   
        }        
        }
        System.out.println("El mayor es: "+mayor);
         */
   
        int mayor=0;
        int i=1;
        while(i<=n){
        System.out.println("Ingrese un numero:");
        int a = scan.nextInt(); 
        if(a>=mayor){
        mayor=a ;   
        }    
        i++;
        }
        System.out.println("El mayor es: "+mayor);
        
        
        /*DO WHILE
 
        int mayor = 0;
        int i = 1;
        do {
            System.out.println("Ingrese un numero:");
            int a = scan.nextInt();
            if (a >= mayor) {
                mayor = a;
            }
            i++;
        } while (i <= n);
        System.out.println("El mayor es: " + mayor);
        */
    }
}
