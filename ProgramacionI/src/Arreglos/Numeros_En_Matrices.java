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
public class Numeros_En_Matrices {

    public static void main(String[] args) {

        String menu = "Numero:\n"
                + "Opcion 1 --> Numero 0 \n"
                + "Opcion 2 --> Numero 1 \n"
                + "Opcion 3 --> Numero 2 \n"
                + "Opcion 4 --> Numero 3\n"
                + "Opcion 5 --> Salir";

        int x = 0;
        String[][] arreglo = new String[5][3];
        String cadena = "";
        int opcion = 0;
        do {
            JOptionPane.showMessageDialog(null, menu);
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su opcion:"));

            switch (opcion) {
                case 1:
                    arreglo[0][0] = "0";
                    arreglo[0][1] = "0";
                    arreglo[0][2] = "0";
                    arreglo[1][0] = "0";
                    arreglo[1][2] = "0";
                    arreglo[2][0] = "0";
                    arreglo[2][2] = "0";
                    arreglo[3][0] = "0";
                    arreglo[3][2] = "0";
                    arreglo[4][0] = "0";
                    arreglo[4][1] = "0";
                    arreglo[4][2] = "0";
                    arreglo[1][1] = "  ";
                    arreglo[2][1] = "  ";
                    arreglo[3][1] = "  ";
                    cadena = "";
                    for (int i = 0; i < 5; i++) {
                        cadena = cadena + Arrays.toString(arreglo[i]) + "\n";

                    }
                    JOptionPane.showMessageDialog(null, cadena);

                    break;
                case 2:
                    arreglo[0][0] = "  ";
                    arreglo[0][1] = "1";
                    arreglo[0][2] = "  ";
                    arreglo[1][0] = "1";
                    arreglo[1][2] = "  ";
                    arreglo[2][0] = "  ";
                    arreglo[2][2] = "  ";
                    arreglo[3][0] = "  ";
                    arreglo[3][2] = "  ";
                    arreglo[4][0] = "  ";
                    arreglo[4][1] = "1";
                    arreglo[4][2] = "  ";
                    arreglo[1][1] = "1";
                    arreglo[2][1] = "1";
                    arreglo[3][1] = "1";
                    cadena = "";
                    for (int i = 0; i < 5; i++) {
                        cadena = cadena + Arrays.toString(arreglo[i]) + "\n";

                    }
                    JOptionPane.showMessageDialog(null, cadena);
                    break;
                case 3:
                    arreglo[0][0] = "  ";
                    arreglo[0][1] = "2";
                    arreglo[0][2] = "2";
                    arreglo[1][0] = "2";
                    arreglo[1][2] = "2";
                    arreglo[2][0] = "  ";
                    arreglo[2][2] = "2";
                    arreglo[3][0] = "  ";
                    arreglo[3][2] = "  ";
                    arreglo[4][0] = "2";
                    arreglo[4][1] = "2";
                    arreglo[4][2] = "2";
                    arreglo[1][1] = "  ";
                    arreglo[2][1] = "  ";
                    arreglo[3][1] = "2";
                    cadena = "";
                    for (int i = 0; i < 5; i++) {
                        cadena = cadena + Arrays.toString(arreglo[i]) + "\n";

                    }
                    JOptionPane.showMessageDialog(null, cadena);
                    break;
                case 4:
                    arreglo[0][0] = "3";
                    arreglo[0][1] = "3";
                    arreglo[0][2] = "  ";
                    arreglo[1][0] = "  ";
                    arreglo[1][2] = "3";
                    arreglo[2][0] = "3";
                    arreglo[2][2] = "  ";
                    arreglo[3][0] = "  ";
                    arreglo[3][2] = "3";
                    arreglo[4][0] = "3";
                    arreglo[4][1] = "3";
                    arreglo[4][2] = "  ";
                    arreglo[1][1] = "  ";
                    arreglo[2][1] = "3";
                    arreglo[3][1] = "  ";
                    cadena = "";
                    for (int i = 0; i < 5; i++) {
                        cadena = cadena + Arrays.toString(arreglo[i]) + "\n";

                    }
                    JOptionPane.showMessageDialog(null, cadena);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Saliendo");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }

        } while (opcion != 5);

    }
}
