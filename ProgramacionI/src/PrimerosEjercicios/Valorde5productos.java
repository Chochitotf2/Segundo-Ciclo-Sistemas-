package PrimerosEjercicios;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mario 2
 */
public class Valorde5productos {

    public static void main(String[] args) {

        /*(Utilizar decimales)INgresar el valor de 5 productos ,si el valor total (suma de productos   
esta entre 50-100 se aplica un descuento del 10%,si esta entre 100-200 descuento del 20% y
si es mayor a 200 tiene un descuento de 30%  
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el valor del primer producto:");
        double prod1 = scan.nextDouble();

        System.out.println("Ingrese el valor del segundo producto:");
        double prod2 = scan.nextDouble();

        System.out.println("Ingrese el valor del tercer producto:");
        double prod3 = scan.nextDouble();

        System.out.println("Ingrese el valor del cuarto producto:");
        double prod4 = scan.nextDouble();

        System.out.println("Ingrese el valor del quinto producto:");
        double prod5 = scan.nextDouble();

        double sum = (prod1 + prod2 + prod3 + prod4 + prod5);
        double desc = 0.00;        
        
        if (sum >= 50 & sum <= 100) {
            desc= (sum * 0.1);
        }

        if (sum > 100 & sum <= 200) {
            desc= (sum * 0.2);
        }

        if (sum > 300) {
            desc= (sum * 0.3);
        }

        double total=(sum-desc);
         
         System.out.println("El total a pagar es :"+ total);
    }

}
