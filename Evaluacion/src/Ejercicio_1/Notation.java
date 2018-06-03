/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_1;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author PotatoPower
 * @param <T>
 */
public class Notation <T> {
    public Stack  <T> pila = new Stack <> ();
    public Stack  <T> aux = new Stack <> ();
    
    private boolean isNumeric(T cadena){
    	try {
            Integer.parseInt((String) cadena);
            return true;
    	} catch (NumberFormatException nfe){
            return false;
    	}
    }
    
    public void push(T data){
        pila.push(data);
        aux.push(data);
    }   
    
    public String popAll(){
        String cadena = "";
        while (!aux.empty()) {            
            cadena = aux.pop()+" "+cadena;
        }
        return cadena;
    }
    
    public String notacionPrefija(){
        String values = "", signs = "";        
        while(!pila.empty()){
            if (isNumeric(pila.peek()))
                values = pila.pop() +" "+ values;
            else
                signs += pila.pop()+" ";
        } 
        
        return signs+values;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Notation notation = new Notation();
        
        String yn;
        do {
            System.out.print("Ingrese un dato (valor/operacion): ");
            notation.push(scan.next());
            
            System.out.print("Desea ingresar otro dato? (S/N)");
            yn = scan.next();
        } while ("s".equals(yn) || "S".equals(yn));
        
        System.out.println("Notación Infija: \n"+notation.popAll());
        System.out.println("Notación Prefija: \n"+notation.notacionPrefija());
    }
}
