/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2;
import Ejercicio_1.Notation;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author PotatoPower
 * @param <T>
 */
public class PrefixNotation <T> extends Notation <T>{
    //Atributos y métodos heredados del ejercicio 1
    
    public double resultado(){
        Stack  <T> op = new Stack <> ();
        double resultado = 0;
        while(!pila.empty()){
            op.push(pila.pop());
        }
        switch((String)op.pop()){
            case "+":
                resultado = Integer.parseInt((String)op.pop()) + Integer.parseInt((String)op.pop());
                break;
            case "-":
                resultado = Integer.parseInt((String)op.pop()) - Integer.parseInt((String)op.pop());
                break;
            case "/":
                resultado = Integer.parseInt((String)op.pop()) / Integer.parseInt((String)op.pop());
                break;
            case "*":
                resultado = Integer.parseInt((String)op.pop()) * Integer.parseInt((String)op.pop());
                break;
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        PrefixNotation prefix = new PrefixNotation();
        int c = 0;
        do {
            if (c != 0) {
                System.out.print("Ingrese un valor: ");
                prefix.push(scan.next());
            }else{
                System.out.print("Ingrese la operacion: ");
                prefix.push(scan.next());
            }            
            c++;
        } while (c < 3);
        
        System.out.println("Operación Ingresada: \n"+prefix.popAll());
        System.out.println("Resultado: \n"+prefix.resultado());
    }
}
