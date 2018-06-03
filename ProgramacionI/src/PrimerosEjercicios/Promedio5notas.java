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
public class Promedio5notas {
    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese primera nota :");
        double n1=scan.nextDouble();
        System.out.println("Ingrese segunda nota :");
        double n2=scan.nextDouble();
        System.out.println("Ingrese Tercera nota :");
        double n3=scan.nextDouble();
        System.out.println("Ingrese cuarta nota :");
        double n4=scan.nextDouble();
        System.out.println("Ingrese quinta nota :");
        double n5=scan.nextDouble();
        
        double prom=(n1+n2+n3+n4+n5)/5;
        System.out.println("El promedio de las notas es :"+ prom);
    }
    
}
