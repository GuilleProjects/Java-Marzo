/*
1.- Crear un arreglo de 200 posiciones cargado con los números de 1 a 200. La
computadora debe mostrar el resultado de la suma de todos los números.
Doscientos.java
 */
package a20230529;

import java.util.Scanner;

public class Doscientos {
    public static void main(String[] args) {
        int valor[]=new int[200]; //Declaras la cantidad de posiciones
        int suma=0;
        
        Scanner sc = new Scanner(System.in);
        
        // Cargar datos en el Array
        for (int i = 0; i < 200; i++) {
            valor[i]=i+1;
            suma +=(i+1);
        }
        //Mostramos los valores de el Array
        for(int i=0; i<200;i++){
            System.out.println(valor[i]);
        }
        System.out.println("Suma: " + suma);
    }
}
