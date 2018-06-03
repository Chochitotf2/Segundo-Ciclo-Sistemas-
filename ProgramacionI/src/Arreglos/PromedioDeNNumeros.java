/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author Mario 2
 */
public class PromedioDeNNumeros {
       public static void main(String[] args) {
        // TODO code application logic here

        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros que va a usar:"));
        int[] arreglo = new int[n];
        int suma = 0;

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero:"));
            suma = suma + arreglo[i];
        }
        int promedio = suma / arreglo.length;
        JOptionPane.showMessageDialog(null, "El promedio es :" + promedio);
    }

}
