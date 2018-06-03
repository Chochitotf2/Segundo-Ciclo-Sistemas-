package PilasYcolas_Metodos_Añadir_quitar;

import javax.swing.JOptionPane;

public class colas<T> {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Las posiciones de los arrays comienzan desde 1 hasta n numeros ");

        String menu = "Escoja un opcion " + "\n 1 Agregar :" + "\n2 Insertar" + "\n3 Datos intoducidos:" + "\n4 Eliminar:" + "\n5 Salir:";
        int opcion = 0;
        codigo adi = new codigo();
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcion) {

                case 1:
                    adi.apilar(JOptionPane.showInputDialog("Ingrese el dato ah agregar "));
                    break;
                case 2: ;
                    adi.lista();
                    adi.insertar(JOptionPane.showInputDialog("Ingrese el dato que quiera insertar "));
                    break;
                case 3:
                    adi.lista();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Se elimino  el primer dato ingresado");
                    adi.desapilar();
                    break;
                case 5:
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Ingrese una opción válida");
            }
            int t1 = adi.tamaño();
            menu = "Escoja un opcion " + "\n 1 Agregar :" + "\n2 Insertar" + "\n3 Datos intoducidos:" + "\n4 Eliminar:"
                    + "\n5 Salir:" + "\n    El tamaño del array es de: " + t1;
        } while (opcion != 5);

    }
}
