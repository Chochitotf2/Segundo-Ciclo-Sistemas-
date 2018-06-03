package PilasYcolas_Metodos_Añadir_quitar;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class codigo<T> extends ArrayList {

    public ArrayList<String> t;

    public void apilar(String dato) {
        if (dato != null) {
            this.add(dato);
        } else {
            JOptionPane.showInputDialog("Introduzca un dato no nulo");
        }
    }

    public void desapilar() {
        if (this.size() > 0) {
            this.remove(0);

        }
    }

    public void insertar(String i) {
        int x = 0;
        do {
            x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posiocion que \n este en rango del tamaño del arreglo "));
        } while (x >= (this.size() + 1));
        this.add((x - 1), i);
    }

    public void lista() {
        String ah = "";
        for (int i = 0; i < this.size(); i++) {
            ah += "\nPosicion:" + (i + 1) + "\n " + this.get(i);
        }
        JOptionPane.showMessageDialog(null, ah);

    }

    public int tamaño() {
        int t1 = this.size();
        return t1;
    }
}
