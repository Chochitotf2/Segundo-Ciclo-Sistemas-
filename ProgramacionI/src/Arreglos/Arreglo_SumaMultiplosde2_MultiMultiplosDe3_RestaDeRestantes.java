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
public class Arreglo_SumaMultiplosde2_MultiMultiplosDe3_RestaDeRestantes {

    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de numeros a ingresar:"));
        int[] arreglo = new int[n];
        int suma = 0;
        int multi = 1;
        int resta = 0;

        for (int i = 0; i < arreglo.length; i++) {            
            arreglo[i] =Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero :")) ;
        }
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] % 2 == 0) {
                suma = suma + arreglo[i];
                if(arreglo[i] % 3 == 0){
                    multi = multi * arreglo[i];
                }
            }
            if (arreglo[i] % 3 == 0) {
                multi = arreglo[i] * multi;
            } else {
                resta = arreglo[i] - resta;
            }
        }

        JOptionPane.showMessageDialog(null,"La suma de los multiplos de 2 es : " +suma+ "\n La multiplicacion de los multiplos de 3 es : "+multi+ "\n La resta del resto es : "+resta);
    }

}