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
public class Par_impar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primero numero :");
        int a = scan.nextInt();
        if (a % 2 == 0) {
            //en caso de ser par
            System.out.println("Es par");
        } else {
            //en caso de ser impar
            System.out.println("Es impar");
        }
    }

}
