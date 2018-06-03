/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_10;

/**
 *
 * @author PotatoPower
 */
public class Impresion {
    String archivo;
    String autor;
    String hora;

    public Impresion(String archivo, String autor, String hora) {
        this.archivo = archivo;
        this.autor = autor;
        this.hora = hora;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
