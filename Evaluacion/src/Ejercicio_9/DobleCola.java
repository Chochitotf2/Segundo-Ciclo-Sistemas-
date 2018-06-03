/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_9;

import java.util.LinkedList;

/**
 *
 * @author PotatoPower
 * @param <T>
 */
public class DobleCola <T>{
    LinkedList <T> doblecola = new LinkedList <>();
    
    public void insertarIzq(T dato){
        doblecola.addFirst(dato);
    }
    
    public void insertarDer(T dato){
        doblecola.addLast(dato);
    }
    
    public void eliminarIzq(T dato){
        doblecola.removeFirst();
    }
    
    public void eliminarDer(T dato){
        doblecola.removeLast();
    }
    
    public boolean dobleColaLlena(){
        return !doblecola.isEmpty();
    }
    
    public boolean dobleColaVacia(){
        return doblecola.isEmpty();
    }
    
    public static void main(String[] args) {
        DobleCola doblecola = new DobleCola();
        
        doblecola.insertarDer(1);
        doblecola.insertarDer(2);
        doblecola.insertarDer(3);
        
        doblecola.insertarIzq("a");
        doblecola.insertarIzq("b");
        doblecola.insertarIzq("c");
        
        System.out.println(doblecola.doblecola);
        System.out.println("Lleno?: "+doblecola.dobleColaLlena());
        System.out.println("Vacio?: "+doblecola.dobleColaVacia());
    }
}
