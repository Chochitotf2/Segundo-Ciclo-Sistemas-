/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectura_de_textos_planos;


/**
 *
 * @author Mario
 */
public class Textos_planos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Lectura_de_textos_planos texto = new Lectura_de_textos_planos();

        texto.leer("prueba.txt");
        texto.escribir("prueba.txt");
    }
    
}
