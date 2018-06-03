/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Mario 2
 */
public class Diagonal_secundaria_y_bajo {

    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la matriz:"));
        int[][] arreglo = new int[n][n];
        int[] diagonal = new int[n];
        int aux = arreglo.length - 1;
        int aux2 = 0;
        int aux3 = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arreglo[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la fila " + (i + 1) + " y de la columna " + (j + 1)));
            }
        }
        String cadena = "";
        for (int i = 0; i < arreglo.length; i++) {
            cadena = cadena + Arrays.toString(arreglo[i]) + "\n";
        }

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = arreglo.length - 1; j < n; j++) {
                diagonal[i] = arreglo[i][aux];
                aux--;
                aux2 += n - (i + 1);
            }

        }

        int[] b = new int[aux2];

        for (int i = arreglo.length - 1; i >= 0; i--) {
            for (int j = n - i; j < n; j++) {
                b[aux3] = arreglo[i][j];
                aux3++;
            }

        }

        JOptionPane.showMessageDialog(null, "La matriz es :\n" + cadena + "\n Su diagonal secundaria es :" + Arrays.toString(diagonal) + "\nLos elementos bajo la diagonal secundaria son :" + Arrays.toString(b));
    }
}
