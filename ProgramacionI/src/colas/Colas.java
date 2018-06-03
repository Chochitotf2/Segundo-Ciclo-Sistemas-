package colas;

public class Colas<T> {

    private Nodo primero;

    public void agregar(T dato) {
        if (!(primero == null)) {
            agregar(primero).setSiguiente(dato);
        } else {
            primero = new Nodo(dato);
        }
    }

    private Nodo agregar(Nodo primero) {
        if (primero.getSiguiente() == null) {
            return primero;
        } else {
            return agregar(primero.getSiguiente());
        }
    }

    public void insertar(int posicion, T dato) {
        if (posicion == 0) {
            Nodo aux = new Nodo(dato);
            aux.setSiguienteObj(primero);
            primero = aux;
        } else {
            if (posicion <= size()) {
                Nodo aux = insertar(1, posicion, primero);
                Nodo item = new Nodo(dato);
                item.setSiguienteObj(aux.getSiguiente());
                insertar(1, posicion, primero).setSiguienteObj(item);
            } else {
                System.out.println("La posicion Ingresada no existe ");
            }
        }
    }

    private Nodo insertar(int cont, int pos, Nodo primero) {
        if (primero.getSiguiente() != null) {
            if (cont == pos) {
                return primero;
            } else {
                cont++;
                return insertar(cont, pos, primero.getSiguiente());
            }
        } else {
            return primero;
        }
    }

    public void suprimir(T dato) {
        if (dato == primero.getDato()) {
            primero = primero.getSiguiente();
        } else {
            Nodo aux = suprimir(dato, primero);
            if (aux.getSiguiente() != null) {
                suprimir(dato, primero).setSiguienteObj(aux.getSiguiente().getSiguiente());
            } else {
                suprimir(dato, primero).setSiguienteObj(null);
            }
        }
    }

    private Nodo suprimir(T dato, Nodo primero) {
        if (primero.getSiguiente() != null) {
            if (dato == primero.getSiguiente().getDato()) {
                return primero;
            } else {
                return suprimir(dato, primero.getSiguiente());
            }
        } else {
            return primero;
        }

    }

    public int size() {
        if (primero == null) {
            return 0;
        } else {
            return size(primero);
        }
    }

    public int size(Nodo primero) {
        if (primero.getSiguiente() == null) {
            return 1;
        } else {
            return 1 + size(primero.getSiguiente());
        }
    }

    public String recorrer() {
        if (primero == null) {
            return "Sin elementos";
        } else {
            return "[ " + recorrer(primero);
        }
    }

    private String recorrer(Nodo primero) {
        if (primero.getSiguiente() == null) {
            return primero.getDato() + " ]";
        } else {
            return primero.getDato() + " , " + recorrer(primero.getSiguiente());
        }
    }
}
