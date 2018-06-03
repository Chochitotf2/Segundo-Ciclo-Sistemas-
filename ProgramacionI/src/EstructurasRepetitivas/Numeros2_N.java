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
public class Numeros2_N {
    public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
        System.out.println("Hasta que numero se desea presentar la serie:");
        int n=scan.nextInt();
        
        int i=2;
        do{
            System.out.print(i+" ");
            i=i+2;
            
        }while(i<=n);
   
        
   
    }
    
}
