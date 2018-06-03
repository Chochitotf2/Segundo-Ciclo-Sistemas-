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
public class Serie_decresiente {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
        System.out.println("Ingrese el numero en donde inicia la sere :");
        int n=scan.nextInt();
        
        for(int i=n;i>0;i=i-1){
            System.out.print(i+"  ");
        }
    
    }
    
}
