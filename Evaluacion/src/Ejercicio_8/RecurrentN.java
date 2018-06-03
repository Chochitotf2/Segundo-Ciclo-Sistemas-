/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_8;
    
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Deus Vult
 * @param <T>
 */
public class RecurrentN <T> {
    LinkedList <T> queue = new LinkedList<>();
    LinkedList <T> queue2 = new LinkedList<>();
    
    public void addQueue(T data){
        queue.add(data);
    }
    
    public void deleteRecurrent(){
        while(!queue.isEmpty()){
            if (queue2.isEmpty()) {
                queue2.add(queue.remove());
            }else{
                if(!queue2.contains(queue.getFirst())){
                    queue2.add(queue.remove());
                }else{
                    queue.remove();
                } 
            }
            
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        RecurrentN rct = new RecurrentN();
        
        String yn;
        do {
            System.out.print("Ingrese un dato: ");
            rct.addQueue(scan.next());
            
            System.out.print("Desea ingresar otro dato? (S/N)");
            yn = scan.next();
        } while ("s".equals(yn) || "S".equals(yn));
        
        System.out.println("Datos ingresados: "+rct.queue);
        rct.deleteRecurrent();
        System.out.println("Elementos iguales consecutivos eliminados: "+rct.queue2);
    }
}
