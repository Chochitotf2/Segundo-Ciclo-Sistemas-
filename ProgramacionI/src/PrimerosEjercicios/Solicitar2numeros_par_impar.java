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
public class Solicitar2numeros_par_impar {

    public static void main(String[] args) {

        /*Solicitar dos numeros e indicar:
  -si los numeros son pares o impares
  -si la multiplicacion entre ellos da como resultado un numero par o impar*/
        Scanner scan = new Scanner(System.in);

        //numero 1
        
        System.out.println("Ingrese el primero numero:");
        int n1 = scan.nextInt();

        System.out.println("Ingrese el segundo numero:");
        int n2 = scan.nextInt();

        if (n1 % 2 == 0) {
            System.out.println("El primero numero es par ");
        }
        else{
            System.out.println("El primero numero es impar");
        }
        
        //numero 2
        
        if (n2 % 2 == 0) {
            System.out.println("El segundo numero es par ");
        }
        else{
            System.out.println("El segundo numero es impar");
        }

        //mutiplicacion entre ellos 
        
        int mult=(n1*n2);
        
        if (mult % 2 == 0) {
            System.out.println("La mutiplicacion de los 2 numeros es par:" + mult);
        }
        else{
            System.out.println("La mutiplicacion de los 2 numeros es impar:"+ mult);
        }

        
    }

}
