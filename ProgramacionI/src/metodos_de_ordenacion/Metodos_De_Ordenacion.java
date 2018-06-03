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
public class Metodos_De_Ordenacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int n = Integer.parseInt(JOptionPane.showInputDialog("Cuantos numero va a ingresar:"));
        int[] arreglo = new int[n];

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero en la posicion: " + i));
        }

        for (int i = 0; i < arreglo.length - 1; i++) {

            for (int j = 0; j < arreglo.length - 1; j++) {

                if (arreglo[j] > arreglo[j + 1]) {

                    int tmp = arreglo[j + 1];

                    arreglo[j + 1] = arreglo[j];

                    arreglo[j] = tmp;

                }

            }

        }
        System.out.println(Arrays.toString(arreglo));

    }

}
