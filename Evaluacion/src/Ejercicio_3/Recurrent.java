package Ejercicio_3;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author CAOJ
 * @param <T>
 */
public class Recurrent <T> {
    Stack <T> stck = new Stack<>(), stck2 = new Stack<>();
    
    public void push(T data){
        stck.push(data);
        stck2.push(data);
    }
    
    public String popAll(){
        String str = "";
        while(!stck2.empty())
            str+= stck2.pop()+" ";
        return str;
    }    
    public void deleteRecurrent(){
        Stack <T> rp = new Stack<>();
        T data= (T) "";
        while(!stck.empty()){
            if(!data.equals(stck.peek())){
                data = stck.peek();
                rp.push(stck.pop());
            }else
                stck.pop();
        }
        while(!rp.empty()){
            stck2.push(rp.pop());
        }        
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Recurrent rct = new Recurrent();
        
        String yn = "";
        do {
            System.out.print("Ingrese un dato: ");
            rct.push(scan.next());
            
            System.out.print("Desea ingresar otro dato? (Y/N)");
            yn = scan.next();
        } while ("y".equals(yn) || "Y".equals(yn));
        
        System.out.println("Datos ingresados: "+rct.popAll());
        rct.deleteRecurrent();
        System.out.println("Elementos repetidos eliminados: "+rct.popAll());
    }
    
}


