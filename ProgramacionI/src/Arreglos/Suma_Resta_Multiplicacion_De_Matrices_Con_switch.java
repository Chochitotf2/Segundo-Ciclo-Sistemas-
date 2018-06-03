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
public class Suma_Resta_Multiplicacion_De_Matrices_Con_switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Ingrese una matriz y realize la suma , resta y multiplicacion
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del primer arreglo :"));
        int[][] arreglo = new int[n][n];

        int m = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del segundo arreglo :"));
        int[][] arreglo2 = new int[m][m];

        if (m == n) {

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arreglo[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la fila " + (i + 1) + " y de la columna " + (j + 1)));
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arreglo2[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la fila " + (i + 1) + " y de la columna " + (j + 1)));
                }
            }

            String cadena = "";

            String menu = "Menu:\n"
                    + "1 --> Suma \n"
                    + "2 --> Resta\n"
                    + "3 --> Multiplicacion\n"
                    + "4 --> Salir";

            int opcion = 0;

            do {
                JOptionPane.showMessageDialog(null, menu);
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su opcion:"));

                switch (opcion) {
                    case 1:
                        for (int i = 0; i < n; i++) {
                            for (int j = 0; j < n; j++) {
                                arreglo[i][j] = arreglo[i][j] + arreglo2[i][j];
                            }
                        }
                        cadena = "";
                        for (int x = 0; x < n; x++) {
                            cadena = cadena + Arrays.toString(arreglo[x]) + "\n";

                        }
                        JOptionPane.showMessageDialog(null, cadena);
                        break;
                    case 2:
                        for (int i = 0; i < n; i++) {
                            for (int j = 0; j < n; j++) {
                                arreglo[i][j] = arreglo[i][j] - arreglo2[i][j];
                            }
                        }
                        cadena = "";
                        for (int x = 0; x < n; x++) {
                            cadena = cadena + Arrays.toString(arreglo[x]) + "\n";

                        }
                        JOptionPane.showMessageDialog(null, cadena);
                        break;

                    case 3:
                        for (int i = 0; i < n; i++) {
                            for (int j = 0; j < n; j++) {
                                arreglo[i][j] = arreglo[i][j] * arreglo2[i][j];
                            }
                        }
                        cadena = "";
                        for (int x = 0; x < n; x++) {
                            cadena = cadena + Arrays.toString(arreglo[x]) + "\n";

                        }
                        JOptionPane.showMessageDialog(null, cadena);
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Saliendo");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion no valida");
                }

            } while (opcion != 4);

        } else {
            JOptionPane.showMessageDialog(null, "Las 2 matrices nesesitan ser del mismo tamaño");
        }
    }

}
