/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

/**
 *
 * @author Pablo
 */
public class Moda_de_n_Numeros {
    public static void main(String[] args) {
         int[]a;
        a=new int[33];
             System.out.println("Las notas de los alumnos son:");
        for(int i=0;i<33;i++){
        a[i]=(int)(Math.random()*10);
         System.out.print("|"+a[i]+"|");
        }   
int vecesmas = 0;
int moda = 0;


for(int i=0; i<a.length; i++){
int esIgual = 0;
for(int j=0; j<a.length; j++){
if(a[i] == a[j])
esIgual++;
}
if(esIgual > vecesmas){
moda = a[i];
vecesmas = esIgual;
}
}

System.out.println("La moda es "+moda+" y se repitió "+vecesmas+" veces.");
    }
    
}
