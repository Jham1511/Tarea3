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

        switch (opcion) {

            case 1: {

                String[][] numeros = new String[10][10];

                System.out.println(imprimir(creo(numeros)));

                System.out.println("Ingrese la cadena de instrucciones: ");
                System.out.println("Nota: Las instrucciones deben ir separadas por comas(,)");
                String inst = leer.next().toLowerCase();

                contar(inst, numeros);
            }//Fin case 1
            break;

            default:
                System.out.println("Saliendo...");
        }//Fin switch 
    }//Fin del main 

    public static void control(String cadena, String[][] matriz) {
        if (true) {

        } else {

        }
    }//Fin del metodo 

    public static void contar(String cadena, String[][] numeros) {
        String[] reglas = cadena.split(",");
        int cont = 0;

        for (int i = 0; i < cadena.length(); i++) {
            for (int j = 0; j < cadena.length(); j++) {
                if (cadena.charAt(i) == 'u') {
                    numeros[i - 1][j] = "R";
                } else if (cadena.charAt(i) == 'd') {
                    numeros[i + 1][j] = "R";
                } else if (cadena.charAt(i) == 'l') {
                    numeros[i][j - 1] = "R";
                } else if (cadena.charAt(i) == 'r') {
                    numeros[i][j + 1] = "R";
                } else if (cadena.charAt(i) == 'g') {
                    numeros[i + 1][j] = " ";
                } else if (cadena.charAt(i) == 's') {
                    numeros[i][j] = " ";
                }//
            }
        }

    }

    public static String[][] creo(String[][] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[0].length; j++) {
                if (i == 8 && j == 5) {
                    numeros[i][j] = "O";
                } else if ((i == 4 && j == 2) || (i == 4 && j == 3) || (i == 4 && j == 4)) {
                    numeros[i][j] = "C";
                } else if (i == 7 && j == 7) {
                    numeros[i][j] = "R";
                } else if (i > 5 || j < 1 || j > 5 || i == 0) {
                    numeros[i][j] = " ";
                } else if (i == 5 || j == 1 || j == 5) {
                    numeros[i][j] = "X";
                } else {
                    numeros[i][j] = " ";
                }
            }
        }

        return numeros;
    }//Fin metodo que imprime el tablero inicial 

    public static String imprimir(String[][] numeros) {
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
