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
public class Mayorde2numeros {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primero numero :");
        int numero1 = scan.nextInt();
        System.out.println("Ingrese el segundo numero :");
        int numero2 = scan.nextInt();

        if (numero1 > numero2) 
        {
            System.out.println("El mayor es:" + numero1);
        } 
        else 
        {
            System.out.println("el mayor es: " + numero2);
        }

    }

}
