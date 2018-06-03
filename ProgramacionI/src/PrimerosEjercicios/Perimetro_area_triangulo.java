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
public class Perimetro_area_triangulo {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la base del triagulo:");
        double base=scan.nextDouble();
        System.out.println("Ingrese el segundo lado del triangulo:");
        double lado2=scan.nextDouble();
        System.out.println("Ingrese el tercer lado del triangulo:");
        double lado3=scan.nextDouble();
        System.out.println("Ingrse la altura del triangulo");
        double altura=scan.nextDouble();
        double perimetro=(base+lado3+lado2);
        double area=(base*altura)/2;
        System.out.println("EL perimetro del triangulo es : "+ perimetro);
        System.out.println("El area del triangulo es :"+ area);
      
    }
}
