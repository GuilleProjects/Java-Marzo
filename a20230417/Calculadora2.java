/*
    Calculadora con SWITCH
 */
package a20230417;

import java.util.Scanner;

public class Calculadora2 {
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

        switch (operador) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("No se puede dividir por cero");
                }   break;
            default:
                System.out.println("Ingrese un operador valido");
                break;
        }

        System.out.println("El resultado es: " + resultado);
        //El sout puede ir dentro o fuera del SWITCH.        
        

    }
}
