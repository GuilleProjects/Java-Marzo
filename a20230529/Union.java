/*
3.- Se ingresan 5 números pertenecientes al arreglo A y otros 5 números
pertenecientes al arreglo B. La computadora muestra la unión de A y B.
Union.java
 */
package a20230529;

import java.util.Scanner;

public class Union {
    public static void main(String[] args) {
        int[] arregloA = new int[5];
        int[] arregloB = new int[5];
        int[] union = new int[10];

        Scanner tc = new Scanner(System.in);

        // Ingresar valores en el arreglo A
        System.out.println("Ingresar valores para el arreglo A:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el valor " + (i + 1) + ": ");
            arregloA[i] = tc.nextInt();
        }

        // Ingresar valores en el arreglo B
        System.out.println("Ingresar valores para el arreglo B:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el valor " + (i + 1) + ": ");
            arregloB[i] = tc.nextInt();
        }

        // Unir los arreglos A y B en el arreglo de unión
        for (int i=0; i<5; i++) {
            union[i]=arregloA[i];
        }
        
        for (int i=0; i<5; i++){
            union[i + 5]=arregloB[i];
        }
        
        // Mostrar la unión de A y B
        System.out.println("La unión de A y B es:");
        for (int i = 0; i < 10; i++) {
            System.out.print(union[i]+", "); //sub i
        }
    }
}
