/*
2.- Se ingresan 5 números pertenecientes al arreglo A y otros 5 números
pertenecientes al arreglo B. La computadora muestra un arreglo C, donde cada
posición es el resultado de la suma del número en la misma posición en el arreglo A
con el número en la misma posición en el arreglo B.
SumaArrays.java
 */
package a20230529;

import java.util.Scanner;

public class SumaArrays {
    public static void main(String[] args) {
        int[] arregloA = new int[5];
        int[] arregloB = new int[5];
        int[] arregloC = new int[5];

        Scanner tc = new Scanner(System.in);

        // Ingresar valores del Array A
        System.out.println("Ing valores para el Array A: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el valor: " + (i + 1) + ": ");
            arregloA[i]=tc.nextInt();
        }
        
        // Mostrar el arreglo A
        System.out.println("El arreglo A es: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(arregloA[i]);
        }

        // Ingresar valores del Array B
        System.out.println("Ing valores para el Array B: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el valor: " + (i + 1) + ": ");
            arregloB[i]=tc.nextInt();
        }
        
        // Mostrar el arreglo B
        System.out.println("El arreglo B es: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(arregloB[i]);
        }

        // Calcular la suma y guardar en el arreglo C
        for (int i = 0; i < 5; i++) {
            arregloC[i]= arregloA[i]+arregloB[i];
        }
        
        // Mostrar el arreglo C
        System.out.println("El arreglo C es: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(arregloC[i]);
        }
    }
}
