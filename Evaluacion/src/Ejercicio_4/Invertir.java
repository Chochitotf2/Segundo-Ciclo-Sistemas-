/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_4;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author PotatoPower
 * @param <T>
 */
public class Invertir <T> {
    public Stack  <T> pila = new Stack <> ();
    public Stack  <T> aux = new Stack <> ();
    
    public void push(T data){
        pila.push(data);
        aux.push(data);
    }   
    
    public String popAll(){
        String cadena = (!aux.empty()) ? aux.pop()+"" : "";
        while (!aux.empty()) {            
            cadena += ", "+aux.pop();
        }
        return cadena;
    }
    
    public void invert(){
        while (!pila.empty()){
            aux.push(pila.pop());
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Invertir pila = new Invertir();
        
        String yn;
        do {
            System.out.print("Ingrese cualquier dato: ");
            pila.push(scan.next());
            
            System.out.print("Desea ingresar otro dato? (S/N)");
            yn = scan.next();
        } while ("s".equals(yn) || "S".equals(yn));
        
        System.out.println("Datos recuperados: \n "+pila.popAll());
        pila.invert();
        System.out.println("Datos ivertidos: \n "+pila.popAll());
    }
}
