
package colas;


public class Nodo <T>{
    private T dato;
    private Nodo siguiente;
    
    public Nodo(T dato){
        this.dato = dato;
    }
    
    public void setSiguiente(T dato){
        siguiente = new Nodo(dato);
    }
    
    public void setSiguienteObj(Nodo siguiente){
        this.siguiente = siguiente;
    }
    
    public Nodo getSiguiente(){
        return siguiente;
    }
    
    public T getDato(){
        return dato;
    }
}