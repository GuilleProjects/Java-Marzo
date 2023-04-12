/*
Escribir un programa que simule una calculadora básica que realice 
operaciones de suma, resta, multiplicación y división. Se deben recibir como entrada 
dos números reales y un operador, que puede ser +, -, * ó /. La salida del programa 
debe ser el resultado de la operación.
 */
package a20230412;

import java.util.Scanner;

public class CalculadoraBasica {

    public static void main(String[] args) {
        double num1 = 0;
        double num2 = 0;
        double resultado = 0;
        int operador = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        num1 = teclado.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        num2 = teclado.nextDouble();

        System.out.print("Ingrese el nro segun el operador \n 1-Suma, 2-Resta, 3-Producto y 4-Cociente: \n");
        operador = teclado.nextInt();

        if (operador == 1) {
            resultado = num1 + num2;
        } else if (operador == 2) {
            resultado = num1 - num2;
        } else if (operador == 3) {
            resultado = num1 * num2;
        } else if (operador == 4) {
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                System.out.println("No se puede dividir por cero");
            }
        } else {
            System.out.println("Ingrese un operador valido");
        }

        System.out.println("El resultado es: " + resultado);
    }
}
