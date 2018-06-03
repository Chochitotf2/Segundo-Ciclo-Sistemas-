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
public class Diagonal_principal_y_sobre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la matriz:"));
        int[][] arreglo = new int[n][n];
        int[] diagonal = new int[n];
        int aux = 0;
        int cont = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arreglo[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la fila " + (i + 1) + " y de la columna " + (j + 1)));
            }
        }
        for (int i = 0; i < arreglo.length; i++) {
            diagonal[i] = arreglo[i][i];
        }
        String cadena = "";
        for (int i = 0; i < arreglo.length; i++) {
            cadena = cadena + Arrays.toString(arreglo[i]) + "\n";
        }

        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = i + 1; j < arreglo[i].length; j++) {
                cont++;
            }

        }
        int[] s = new int[cont];
        
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = i + 1; j < arreglo[i].length; j++) {
                s[aux]=arreglo[i][j];
                aux++;
            }

        }

        JOptionPane.showMessageDialog(null, "La matriz es :\n" + cadena + "\nSu diagonal principal es :" + Arrays.toString(diagonal)+"\nLos elementos sobre la diagonal principal son :"+Arrays.toString(s));

    }
}
