/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_10;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Deus Vult
 * @param <T>
 */
public class Main <T>{
    LinkedList <T> cola = new LinkedList <>();
    
    public void encolar(T dato){
        cola.add(dato);
    }
    
    public Impresion imprimir(){
        return (Impresion) cola.remove();
    }
    
    public String enlistar(){
        String cadena = "";
        if (!cola.isEmpty()) {
            for (int i = 0; i < cola.size(); i++) {            
                Impresion item = (Impresion) cola.get(i);
                cadena += (i+1)+" Archivo: "+item.archivo+", Autor: "+item.autor+", Fecha: "+item.hora+"\n";
            }
        }else{
            cadena = "No hay archivos en cola...\n";
        }      
        return cadena;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Main cola = new Main();
        int yn;
        do {
            System.out.print(cola.enlistar()+"\n"
                    + "1. Añadir documento a la cola:\n"
                    + "2. Imprimir documento: \n"
                    + "3. Salir\n");            
            System.out.print("Elija una opción: ");
            yn = scan.nextInt();
            
            switch(yn){
                case 1:
                    System.out.println("---------------------------------------");
                    System.out.print("Nombre del archivo: ");
                    String archivo = scan.next();
                    
                    System.out.print("Nombre del autor: ");
                    String autor = scan.next();
                    
                    System.out.print("Nombre del hora: ");
                    String hora = scan.next();
                    
                    Impresion item = new Impresion(archivo, autor, hora);
                    cola.encolar(item);
                    System.out.println("Se añadió el archivo a la cola....");
                    System.out.println("---------------------------------------\n");
                    break;
                case 2:
                    if (!cola.cola.isEmpty()) {
                        System.out.println("---------------------------------------");
                        Impresion imp = cola.imprimir();
                        System.out.println("El archivo: "+imp.archivo+" se imprimió.");
                        System.out.println("---------------------------------------\n");
                    }else{
                        System.out.println("---------------------------------------");
                        System.out.println("No hay archivos para imprimir...");
                        System.out.println("---------------------------------------\n");
                    }                    
                    break;
                case 3:
                    System.out.println("---------------------------------------");
                    System.out.println("TERMINADO...");
                    System.out.println("---------------------------------------\n");
                    break;
            }
        } while (yn < 3);
    }
}
