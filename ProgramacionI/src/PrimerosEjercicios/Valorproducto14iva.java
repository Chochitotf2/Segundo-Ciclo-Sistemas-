package PrimerosEjercicios;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Programacion I 2B
 */
public class Valorproducto14iva {
    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);

        System.out.println("Ingrse el valor del producto:");
        double prod=scan.nextDouble();
        
        System.out.println("Ingrse la edad de la persona:");
        int edad=scan.nextInt();
        
        double descuento = 0;
        
        if(edad>=65){
           descuento= prod * 0.2;
        }
        double subtotal=prod-descuento;
        double total = descuento * 1.14;
        System.out.println("El valor total a pagar es:"+ total);
         
    }
    
}
