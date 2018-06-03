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
public class Arreglo_Suma_IndicesPares__MultiplicacionImpares {
    public static void main(String[] args) {
        
int n =Integer.parseInt(JOptionPane.showInputDialog("Cantidad de numeros a ingresar:"));
int[] arreglo = new int[n];
int suma=0;
int multi=1;        

        for (int i = 0; i < arreglo.length; i++) {
        arreglo[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el "+(i+1)+" numero"));     
        }
        
        for (int i = 0; i < arreglo.length; i++) {
        if(i%2==0){
        suma=arreglo[i]+suma;    
        }
        if(i%2==1);
        multi=arreglo[i]*multi;
        }
        
       JOptionPane.showMessageDialog(null,"La suma de los indices pares es : "+suma+"\n La Multiplicacion de los indices impares es : "+multi);
    }
}
