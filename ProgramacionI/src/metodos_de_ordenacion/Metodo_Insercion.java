/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_de_ordenacion;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Mario 2
 */
public class Metodo_Insercion {

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Cuantos numero va a ingresar:"));
        int[] arreglo = new int[n];

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero en la posicion: " + i));
        }

        int j;
        for (int i = 1; i < arreglo.length; i++) {
            int a = arreglo[i];
            for (j = i - 1; j >= 0 && arreglo[j] > a; j--) {
                arreglo[j + 1] = arreglo[j];
            }
            arreglo[j + 1] = a;
            System.out.println(Arrays.toString(arreglo));
        }
    }

}
