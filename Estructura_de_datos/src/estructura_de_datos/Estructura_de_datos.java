/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura_de_datos;

import java.util.Scanner;

/**
 *
 * @author Mario 2
 */
public class Estructura_de_datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     Scanner scan=new Scanner(System.in)   ;
     
     
        System.out.println("Ingrese la cantidad de alumnos:");
        string[]a=new string[33];
        
        
        int p=0;
        int sum=0;
        int mayor=0;
        int menor=max.value;
        int j=0;
        int k=0;
        int contador=0;
        int aux=33;
        
        for(int i=0;i<33;i++){
            System.out.println("Ingrese la nota:");
        a[i]=scan.nextInt();
        sum=sum+a[i];
        if(a[i]>mayor){
         mayor=a[i];
         j=i;
        }else{
        if(a[i]<menor){
        menor=a[i];
        k=j;}    
        }
        if(a[i]>=7){
        contador++;    
        }else{
        aux=aux-contador;
        }
        }
        p=(aux*100)/33;
        int promedio=sum/a;
        System.out.println("El promedio es: "+promedio);
        System.out.println("El mayor esta en la posicion:"+j);
        System.out.println("el menor esta en la posicion:"+k);
        System.out.println("La calificaciones mayores a 7 son:"+contador);
        System.out.println("El porcentaje de notas menores a 7 es :"+p);
        
        
        //Esto quedo por revisar bro :v
        
        for (int i=0;i<33;i++){
        for( j=0;j<33;j++){
        if(a[i]==a[j]);    
        }    
        }
        
        
        
        
        
        
    }
    
}
