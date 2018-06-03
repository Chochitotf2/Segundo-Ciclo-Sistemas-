/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

/**
 *
 * @author Pablo
 */
public class Notas_n_Alumnos_Ordenadas_Ascendente_Descendente {

    public static void main(String[] args) {
        int[] a;
        a = new int[33];
        System.out.println("Las notas de los alumnos son:");
        for (int i = 0; i < 33; i++) {
            a[i] = (int) (Math.random() * 10);
            System.out.print("|" + a[i] + "|");
        }

        System.out.println("\nLas notas en orden desendente son:");
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] < a[j + 1]) {
                    int tmp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = tmp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print("|" + a[i] + "|");
        }

        System.out.println("\nLas notas en ordenascendente son :");
        int aux = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1; j++) {

                if (a[j] > a[j + 1]) {

                    aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                }

            }
        }
        for (int i = 0; i < 33; i++) {
            System.out.print("|" + a[i] + "|");
        }

    }

}
