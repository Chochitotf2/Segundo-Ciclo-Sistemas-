/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrices;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Mario 2
 */
public class Matriz_diag_princ {

    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la matriz"));
        int[][] arreglo = new int[n][n];
        int[] arreglo2 = new int[n];
        //int aux = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arreglo[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la columa " + (j + 1) + " y de la fila " + (i + 1)));
                /*if (i == j) {
                    arreglo2[aux] = arreglo[i][j];
                    aux++;
                }*/
            }

        }
        for (int i = 0; i < n; i++) {
            arreglo2[i] = arreglo[i][i];
        }
        JOptionPane.showMessageDialog(null, Arrays.toString(arreglo2));
    }

}