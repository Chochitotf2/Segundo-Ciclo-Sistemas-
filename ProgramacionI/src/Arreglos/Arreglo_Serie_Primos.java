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
public class Arreglo_Serie_Primos {

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de terminos a generar"));
        int[] arreglo = new int[n];
        int contador = 1;
        int serie = 1;
        int auxiliar;
        while(contador <= n){
            auxiliar = 0;
            for(int i = 1; i <= serie; i++ ){
                if(serie % i == 0){
                    auxiliar = auxiliar + 1;
                }
            }
            if(auxiliar == 2){ 
                arreglo[contador-1] = serie;
                contador = contador + 1;
            }
            
            serie = serie + 1;
        }
        
        
        JOptionPane.showMessageDialog(null, Arrays.toString(arreglo));
    }
}
