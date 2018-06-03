/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos_de_busqueda;

import java.util.Arrays;

/**
 *
 * @author franzandresflores
 */
public class MetodoHash {
    
    String [] arreglo;
    int tamanio,contador;
    
    public MetodoHash(int tam){
        tamanio = tam;
        arreglo = new String[tam];
        Arrays.fill(arreglo,"-1");
    }
    
    public void funcionHash(String [] cadenaArreglo,String [] arreglo){
        
        for (int i = 0; i < cadenaArreglo.length; i++) {
            String elemento = cadenaArreglo[i];
            int indiceArreglo = Integer.parseInt(elemento)%7;
            System.out.println("El indice es " + indiceArreglo + " para el elemento o valor " + elemento);
            
            //Tratando las Colisiones
            while(arreglo[indiceArreglo]!= "-1"){
                indiceArreglo++;
                System.out.println("Ocurrio una colision en el indice " + (indiceArreglo-1) + " cambiar al indice " + indiceArreglo);
                indiceArreglo%=tamanio;
            }
            arreglo[indiceArreglo] = elemento;
        }
    }
    
    
    public String buscarClave(String elemento){
        int indiceArreglo = Integer.parseInt(elemento)%7;
        int contador = 0;
        while(arreglo[indiceArreglo]!="-1"){
            if (arreglo[indiceArreglo]==elemento) {
                System.out.println("El elemento " + elemento + " fue encontrado en el indice " + indiceArreglo);
                return arreglo[indiceArreglo];
            }
            indiceArreglo++;
            indiceArreglo%=tamanio;
            contador++;
            if (contador>7) {
                break;
            }
        }
        return null;
    }
    
    
    public static void main(String[] args) {
        
        MetodoHash hash = new MetodoHash(8);
        
        String [] elementos = {"20","33","21","10","12","14","56","100"};
        hash.funcionHash(elementos, hash.arreglo);
        
        System.out.println(Arrays.toString(elementos));
        System.out.println(Arrays.toString(hash.arreglo));
        String buscar = hash.buscarClave("56");
        if (buscar == null) {
            System.out.println("El elemento " + buscar + " no se encuentra en la tabla");
        }
    }
    
    
    
}
