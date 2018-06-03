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
public class Matriz_serie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de filas:"));
        int m = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de columnas:"));

        int[][] arreglo = new int[n][m];
        int serie = 1;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                arreglo[i][j] = serie;
                serie++;
            }

        }
        
        String cadena = "";
        /*for (int i = 0; i < n; i++) {
            cadena += Arrays.toString(arreglo[i])+"\n";
        }*/
        
        for (int i = 0; i < n; i++) {
            cadena += "[";
            for (int j = 0; j < m; j++) {
                if (j != m-1) {
                    cadena += arreglo[i][j]+", ";
                }else{
                    cadena += arreglo[i][j];
                }
            }
            cadena += "]\n";
        }
    
        JOptionPane.showMessageDialog(null,cadena);
        
    }

}