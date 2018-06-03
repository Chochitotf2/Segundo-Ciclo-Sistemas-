
package colas;

public class Main {

    public static void main(String[] args) {
        Colas cola = new Colas();
        
        cola.agregar(1);
        cola.agregar("2");
        cola.agregar("3");
        cola.agregar("4");
        cola.agregar("5");
        
        System.out.println("El tamaño de la cola es:"+cola.size()+"\n"
                + cola.recorrer());
        
        cola.suprimir("4");
        System.out.println("El tamaño de la cola ahora es :"+cola.size()+"\n"
                + cola.recorrer());
        
        cola.insertar(4, "5");
        System.out.println("EL tamaño de la cola es :"+cola.size()+"\n"
                + cola.recorrer());
    }
    
}