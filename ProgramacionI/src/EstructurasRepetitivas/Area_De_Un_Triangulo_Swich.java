package EstructurasRepetitivas;

import java.util.Scanner;

// @author Feller98

public class Area_De_Un_Triangulo_Swich {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
              
        System.out.println("Ingrese tres valores:");
        
        System.out.println("lado 1 o base:");
        double lado1 = scan.nextDouble();
        System.out.println("lado 2 o hipotenusa:");
        double lado2 = scan.nextDouble();
        System.out.println("lado 3");
        double lado3 = scan.nextDouble();
        
        String menu = "Menu:\n"
                + "1 --> Perimetro del Triangulo \n"
                + "2 --> Area del Triangulo\n"
                + "3 --> SALIR";     

        int opcion = 0;
            
        do{
            System.out.println(menu);
            opcion = scan.nextInt();
            
            switch (opcion){
                case 1:
                    System.out.println("Perimetro");
                    double perimetro = lado1 + lado2 + lado3;
                    System.out.println("El perimetro es: " + perimetro);
                    break;
                    
                case 2:
                    System.out.println("Area");
                    //BASE Y ALTURA DEL TRIANGULO
                    double base = lado1 / 2;
                    double altura = Math.sqrt(Math.pow(lado2, 2) - Math.pow(base,2));
                    //AREA TOTAL
                    double area = (lado1 * altura) / 2;
                    System.out.println("El area es: " + area);
                    break;
                    
                case 3:
                    System.out.println("Saliendo");
                    break;
                default: System.out.println("Ingrese una opcion valida");
            }   
        }while (opcion != 3);
    }
}
