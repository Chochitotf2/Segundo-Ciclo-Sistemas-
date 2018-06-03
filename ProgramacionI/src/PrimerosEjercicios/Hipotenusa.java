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
public class Hipotenusa {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese el valor del primer cateto :");
        double cateto1 = scan.nextDouble();
        System.out.println("ingrese el valor del segundo cateto :");
        double cateto2 = scan.nextDouble();
        double hipotenusa = Math.sqrt(Math.pow(cateto2,2) + Math.pow(cateto1,2));
        System.out.println("La hipotenusa es igual a :" + hipotenusa);
    }
}
