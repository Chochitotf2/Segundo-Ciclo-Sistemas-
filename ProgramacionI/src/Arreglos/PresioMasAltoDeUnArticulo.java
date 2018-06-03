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
public class PresioMasAltoDeUnArticulo {

    public static void main(String[] args) {

        /*
        5. Utilice la plantilla de la clase Arreglo para definir un objeto arreglo de nú-
meros reales en el cual almacene los precios de N artículos. Escriba una
aplicación que permita encontrar e imprimir el precio más alto.
         */
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de articulos:"));
        int[] a = new int[n];
        int mayor = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de articulo n° : " + (i + 1)));
            if (a[i] > mayor) {
                mayor =a[i] ;
            }
        }
        JOptionPane.showMessageDialog(null, "El precio mas alto es: " + mayor);

    }

}

