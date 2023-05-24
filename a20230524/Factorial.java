/*
4.4) Se ingresa un número natural. La computadora muestra el factorial del número.
Ejemplo: Se ingresa 5, la computadora muestra 120. Factorial.java
 */
package a20230524;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int factorial = 1;
        int numero=0;
        
        System.out.print("Ingrese un número natural: ");
        numero = sc.nextInt();

        // Calcular el factorial
        for (int i = 1; i <= numero; i++) {
            factorial*= i;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
