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
public class Metodo_Seleccion {

    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("Cuantos numero va a ingresar:"));
        int[] arreglo = new int[n];

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero en la posicion: " + i));
        }

        for (int i = 0; i < arreglo.length - 1; i++) {
            int menor = arreglo[i];
            int pos = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < menor) {
                    menor = arreglo[j];
                    pos = j;
                }
            }
            if (pos != i) {
                int aux = arreglo[i];
                arreglo[i] = arreglo[pos];
                arreglo[pos] = aux;
            }
            
            System.out.println(Arrays.toString(arreglo));
        }

    }

}
