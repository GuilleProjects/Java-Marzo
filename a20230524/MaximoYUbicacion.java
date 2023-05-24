/*
4.3) Se ingresan 5 números. La computadora muestra cuál fue el mayor y en qué
orden apareció. MaximoYUbicacion.java
 */
package a20230524;

import java.util.Scanner;

public class MaximoYUbicacion {
    public static void main(String[] args) {
        int numero= 0;
        int maximo= 0;
        int posicionMaxima= -1;

        Scanner sc = new Scanner(System.in);

        // Ingresar los 5 números
        int e=0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el numero " + (e+=1) + ": ");
            numero = sc.nextInt();

            // Verificar si es el nuevo máximo
            if (numero > maximo) {
                maximo = numero;
                posicionMaxima= e;
            }
        }

        System.out.println("El maximo es: " + maximo);
        System.out.println("Posicion: " + posicionMaxima);
    }
}
