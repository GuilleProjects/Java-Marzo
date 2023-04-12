/*
Escribir un programa que simule una calculadora básica que realice 
operaciones de suma, resta, multiplicación y división. Se deben recibir como entrada 
dos números reales y un operador, que puede ser +, -, * ó /. La salida del programa 
debe ser el resultado de la operación.
 */
package a20230412;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        double num1 = 0;
        double num2 = 0;
        double resultado = 0;
        String operador = "";

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        num1 = teclado.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        num2 = teclado.nextDouble();

        System.out.print("Ingrese el operador (+, -, *, /): ");
        operador = teclado.next();

        if (operador.equals("+")) {
            resultado = num1 + num2;
            System.out.println("El resultado es: " + resultado);
        } else if (operador.equals("-")) {
            resultado = num1 - num2;
            System.out.println("El resultado es: " + resultado);
        } else if (operador.equals("*")) {
            resultado = num1 * num2;
            System.out.println("El resultado es: " + resultado);
        } else if (operador.equals("/")) {
            if (num2 != 0) {
                resultado = num1 / num2;
                System.out.println("El resultado es: " + resultado);
            } else {
                System.out.println("No se puede dividir por cero");
            }
        } else {
            System.out.println("Ingrese un operador valido");
        }
    }
}
