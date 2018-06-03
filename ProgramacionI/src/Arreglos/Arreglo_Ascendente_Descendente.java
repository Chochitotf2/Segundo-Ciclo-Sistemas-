/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orellana_mario_b;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Mario 2
 */
public class Arreglo_Ascendente_Descendente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de terminos a generar"));
        int[] arreglo = new int[n];
        int[] arreglo2 = new int[n];

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = i + 1;
        }
        
        int cont = 0;
        for (int i = arreglo.length - 1; i >= 0; i--) {
            arreglo2[i] = arreglo[cont];
            cont++;
        }
        
        JOptionPane.showMessageDialog(null,Arrays.toString(arreglo)+"\n"+ Arrays.toString(arreglo2));        

    }

}
