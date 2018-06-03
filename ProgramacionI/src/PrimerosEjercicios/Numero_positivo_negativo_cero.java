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
public class Numero_positivo_negativo_cero {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrse el numero:");
        int n = scan.nextInt();
        if (n == 0) {
            System.out.println("Es el cero");
        }
        if (n > 0) {
            System.out.println("Es mayor a cero");
        }
        if (n < 0) {
            System.out.println("Es menor a cero");
        }

    }

}
