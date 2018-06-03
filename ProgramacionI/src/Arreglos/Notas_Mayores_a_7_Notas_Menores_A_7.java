/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

import static java.lang.Byte.MAX_VALUE;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Notas_Mayores_a_7_Notas_Menores_A_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scan = new Scanner(System.in);

        System.out.println("tomamos en cuenta que  la cantidad de alumnos es de:33");
        int[] a;
        a = new int[33];

        int p = 0, sum = 0, mayor = 0, menor = MAX_VALUE, j = 0, k = 0, contador = 0, aux = 33;
        System.out.println("Las notas de los alumnos son:");
        for (int i = 0; i < 33; i++) {
            a[i] = (int) (Math.random() * 10);
            System.out.print("|" + a[i] + "|");
        }

        for (int i = 0; i < 33; i++) {
            sum = sum + a[i];
            if (a[i] > mayor) {
                mayor = a[i];
                j = i;
            } else {
                if (a[i] < menor) {
                    menor = a[i];
                    k = i;
                }
            }
            if (a[i] >= 7) {
                contador++;
            }
        }
        aux = aux - contador;
        p = (aux * 100) / 33;
        double promedio = sum / 33;
        System.out.println("El promedio es: " + promedio);
        System.out.println("El mayor esta en la posicion:" + j);
        System.out.println("el menor esta en la posicion:" + k);
        System.out.println("La calificaciones mayores a 7 son:" + contador);
        System.out.println("El porcentaje de notas menores a 7 es :" + p);

    }

}
