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
public class Menorde3numeros {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrse el primer numero:");
        int n1 = scan.nextInt();
        System.out.println("Ingrse el Segundo numero:");
        int n2 = scan.nextInt();
        System.out.println("Ingrse el Tercer numero:");
        int n3 = scan.nextInt();

        if (n1 < n2 && n1 < n3) {
            System.out.println("El menor es:" + n1);
        }
        if (n2 < n1 && n2 < n3) {
            System.out.println("El menor es:" + n2);
        }
        if (n3 < n1 && n3 < n2) {
            System.out.println("El menor es :" + n3);
        }

    }

}
