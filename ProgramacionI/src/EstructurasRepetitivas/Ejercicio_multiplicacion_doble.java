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
public class Ejercicio_multiplicacion_doble {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    
        System.out.println("Ingrese el limite de las serie:");
        int n=scan.nextInt();
        
        int serie=1;
        
        for(int i =1;i<=n;i++){
            System.out.print(serie+" "); 
            serie=(serie*2);
        }
    }
    
}
