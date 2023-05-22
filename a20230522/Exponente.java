/*
4.2) Dados dos números naturales b y e, la computadora muestra el valor de b y de 
e sin utilizar operadores o funciones que calculen exponentes. Exponente.java
Ejemplo: Se ingresa 2 y 5, la computadora muestra 32.

 */
package a20230522;

import java.util.Scanner;


public class Exponente {
 public static void main(String[] args) {
        int b, e, resultado;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el valor de b: ");
        b = scanner.nextInt();
        
        System.out.print("Ingrese el valor de e: ");
        e = scanner.nextInt();
        
        resultado = 1;
        for (int i = 1; i <= e; i++) {
            resultado *= b;
        }
        
        System.out.println("El resultado es: " + resultado);
    }
}
