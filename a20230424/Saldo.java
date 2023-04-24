/*
Una cuenta bancaria tiene 30000 pesos de saldo. El usuario ingresará valores
que corresponden a extracciones vía cajero automático. Por cada extracción se debe
mostrar cómo quedó el saldo luego de la operación. Una extracción que supere al
saldo disponible se debe rechazar indicando que no es posible la operación. El
programa finaliza cuando el saldo queda en cero. Saldo.java
 */
package a20230424;

import java.util.Scanner;

public class Saldo {
    public static void main(String[] args) {
        //declaro y inicializo las vairables
        double extra = 0;
        double saldo = 30000.0;

        //crear objeto scanner
        Scanner teclado = new Scanner(System.in);
        System.out.println("------------------------------------");

        //repite el bucle o ciclo mientras la variable saldo sea mayor a cero
        while (saldo>0) {
            System.out.print("Ingrese el monto a extraer: ");
            extra = teclado.nextDouble();

            // Verificar que la extracción no supere el saldo disponible
            if (extra > saldo) {
                System.out.println("Saldo insuficiente");
            } else {
                saldo = saldo - extra;
                System.out.println("Saldo actual: " + saldo);
            }
        }
    }
}
