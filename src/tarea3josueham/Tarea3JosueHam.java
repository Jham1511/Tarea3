package tarea3josueham;

import java.util.*;

public class Tarea3JosueHam {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("");
        System.out.println("1 -> Opcion 1: Movimiento de un Robot");
        System.out.println("2 -> Salir");
        System.out.println("Ingrese la opcion que desea: ");
        int opcion = leer.nextInt();

    
        switch (opcion){
            
            case 1: {
                System.out.println("Ingrese la cadena de instrucciones: ");
                System.out.println("Nota: Las instrucciones deben ir separadas por comas(,)");
                String inst = leer.next();
                
                int[][] tablero = new int[10][10];
                
                
            }//Fin case 1
            break;
            
            default:
                System.out.println("Saliendo...");
        }//Fin switch 
    }//Fin del main 
    
    
    public static void control (String cadena, int[][] matriz){
        if (true) {
            
        } else {
            
        }
    }//Fin del metodo 
    
     public static int[][] crear (){
            int[][] temporal = new int [10][10];
            for (int i = 0; i < temporal.length; i++) {
                for (int j = 0; j < temporal[0].length; j++) {
                    if (true) {
                        
                    } else {
                        
                    }//Fin else
                }
         }
            
            return temporal;
        }//Fin del metodo crear
     
}//Fin de la clase 
