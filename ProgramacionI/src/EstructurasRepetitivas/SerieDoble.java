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
public class SerieDoble {
    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);    
    
        System.out.println("ingrese el numero total de terminos a generar :");
        int n=scan.nextInt();
        
        int j=1;
                
        for(int i =1;i<=n;i=j+i){
            System.out.print(i+ " ");
            j++;
        }
        
        
        
        
    }
}
