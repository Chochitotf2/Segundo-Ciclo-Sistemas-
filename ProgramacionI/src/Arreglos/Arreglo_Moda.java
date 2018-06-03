/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orellana_mario_b;

import javax.swing.JOptionPane;

/**
 *
 * @author Mario 2
 */
public class Arreglo_Moda {

    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de numeros a ingresar:"));
        int[] arreglo = new int[n];
        int aux = 0;
        int aux2 = 0;
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el " + (i + 1) + " numero"));
        }
        for (int i = 0; i < arreglo.length; i++) {
            int cont = 0;
            for (int j = 0; j < arreglo.length; j++) {

                if (arreglo[i] == arreglo[j]) {
                    cont++;
                }
                if (cont > aux) {
                    aux = cont;
                    aux2 = arreglo[i];
                }
            }
        }
        JOptionPane.showMessageDialog(null, "La moda es " + aux2);
    }

}
