package tarea3josueham;

import java.util.*;

public class Tarea3JosueHam {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        
        System.out.println("");
        System.out.println("1 -> Opcion 1: Movimiento de un Robot");
        System.out.println("2 -> Salir");
        System.out.println("Ingrese la opcion que desea: ");
        opcion = leer.nextInt();

    
        switch (opcion){
            
            case 1: {
                System.out.println("Ingrese la cadena de instrucciones: ");
                System.out.println("Nota: Las instrucciones deben ir separadas por comas(,)");
                String inst = leer.next();
                String[][] numeros = new String[10][10];
                
                System.out.println(imprimirInt(crear(numeros)));
            }//Fin case 1
            break;
            
            default:
                System.out.println("Saliendo...");
        }//Fin switch 
    }//Fin del main 
    
    
    public static void control (String cadena, String[][] matriz){
        if (true) {
            
        } else {
            
        }
    }//Fin del metodo 
    
    
     public static String [][] crear (String[][] numeros){
         for (int i = 0; i < numeros.length; i++) {
             for (int j = 0; j < numeros.length; j++) {
                 if (i == 5 || j == 1 || j == 5) {
                     numeros[i][j] = "X";
                 } else if ((i == 4 && j == 2) || (i == 4 && j == 3) || (i == 4 && j == 4)) {
                     numeros[i][j] = "C";
                 } else if (i == 8 && j == 5) {
                     numeros[i][j] = "O";
                 } else if (i == 7 && j == 7){
                     numeros[i][j] = "R";
                 } else {
                     numeros[i][j] = " ";
                 }
             }
         }
         
         return numeros;
     }//Fin metodo 

     
     
     public static String imprimirInt(String[][] numeros) {
        String cadena = "";

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                cadena += "[" + numeros[i][j] + "]";
            }
            cadena += "\n";
        }
        return cadena;
    }//Fin metodo imprimir
}//Fin de la clase 
