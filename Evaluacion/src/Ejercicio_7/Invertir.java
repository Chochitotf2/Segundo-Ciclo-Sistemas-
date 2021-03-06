/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_7;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author PotatoPower
 * @param <T>
 */
public class Invertir <T>{
    LinkedList <T> cola = new LinkedList <>();
    LinkedList <T> aux = new LinkedList <>();
    
    public void insert(T dato){
        cola.add(dato);
    }
    
    public void invert(){
        if (!cola.isEmpty()){ 
            aux.add(cola.pollLast());
            invert();  
        }else{
            cola = aux;
        }             
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Invertir cola = new Invertir();
        String yn;
        do {
            System.out.print("Ingrese cualquier dato: ");
            cola.insert(scan.next());
            
            System.out.print("Desea ingresar otro dato? (S/N)");
            yn = scan.next();
        } while ("s".equals(yn) || "S".equals(yn));
        System.out.println(cola.cola);
        cola.invert();
        System.out.println(cola.cola);
    }
}
