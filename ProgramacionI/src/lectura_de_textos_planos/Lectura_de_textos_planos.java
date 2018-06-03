package lectura_de_textos_planos;
import java.io.*;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Lectura_de_textos_planos {
    
    public void leer(String nombreArchivo){    
        try{  //Se usa un try catch debido a que se produce una excepcion al no encontrar el archivos
            
            FileReader r = new FileReader(nombreArchivo); //Se usa para leer los archivos planos 
            BufferedReader buffer = new BufferedReader(r); //Usa un espacio en memoria para guardar la informacion y lee el texto 
            
            String aux = "";
            while(aux!=null){
                aux = buffer.readLine(); //Lee solo una linea del archivo de texto
                if (aux==null) {
                    break;
                }
                System.out.println(aux);
            }       
        }catch(Exception e){
            System.out.println(e.getMessage());           
        } 
    }
    
    public void escribir(String nombreArchivo){
        int[][] array = new int[3][3];
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor :"));
            }
        }
        
        String presentar = "";
        for (int i = 0; i < 3; i++) {
            presentar += Arrays.toString(array[i]) + "\n";
        }
        
        try{
            File f = new File(nombreArchivo); //Crea un objeto de tipo File(archivo) y pasa por parametro el archivo
            
            FileWriter w = new FileWriter(f); ///Objeto que escribe en archivos
            BufferedWriter bw = new BufferedWriter(w); //Espacio en memoria que guarda lo que se escribe
            PrintWriter pw = new PrintWriter(bw); //Escribe directamente en el archivo
            
            pw.append("--Concatenado al texto: \n");
            pw.write(presentar);
            pw.close();
            bw.close();
            
        }catch(IOException e){} 
    }

    
}

        
