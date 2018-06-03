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
public class Mayorde5numeros {

    public static void main(String[] args) {

//Pedir 5 numeros y presentar el mayor y menor 
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el primero numero:");
        int n1 = scan.nextInt();

        System.out.println("Ingrese el segundo numero:");
        int n2 = scan.nextInt();

        System.out.println("Ingrese el Tercer numero:");
        int n3 = scan.nextInt();

        System.out.println("Ingrese el Cuarto numero:");
        int n4 = scan.nextInt();

        System.out.println("Ingrese el Quinto numero:");
        int n5 = scan.nextInt();

        //Mayor de todos
        
        if (n1 > n2 & n1 > n3 & n1 > n4 & n1 > n5) {
            System.out.println("El primer numero es el mayor:" + n1);
        }

        if (n2 > n1 & n2 > n3 & n1 > n4 & n1 > n5) {
            System.out.println("El primer numero es el mayor:" + n2);
        }

        if (n3 > n1 & n3 > n2 & n3 > n4 & n3 > n5) {
            System.out.println("El primer numero es el mayor:" + n3);
        }

        if (n4 > n1 & n4 > n2 & n4 > n3 & n4 > n5) {
            System.out.println("El primer numero es el mayor:" + n4);
        }

        if (n5 > n1 & n5 > n2 & n5 > n4 & n5 > n3) {
            System.out.println("El primer numero es el mayor:" + n5);
        }

                //Menor de todos
        
        if (n1 < n2 & n1 < n3 & n1 < n4 & n1 < n5) {
            System.out.println("El primer numero es el menor:" + n1);
        }

        if (n2 < n1 & n2 < n3 & n1 < n4 & n1 < n5) {
            System.out.println("El primer numero es el menor:" + n2);
        }

        if (n3 < n1 & n3 < n2 & n3 < n4 & n3 < n5) {
            System.out.println("El primer numero es el menor:" + n3);
        }

        if (n4 < n1 & n4 < n2 & n4 < n3 & n4 < n5) {
            System.out.println("El primer numero es el menor:" + n4);
        }

        if (n5 < n1 & n5 < n2 & n5 < n4 & n5 < n3) {
            System.out.println("El primer numero es el menor:" + n5);
        }

    }
}
