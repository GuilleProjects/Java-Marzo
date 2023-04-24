/*
Ingrese un nro y muestre su tabla de multiplicar
 */
package a20230424;

import java.util.Scanner;

public class Multiplicar {

    public static void main(String[] args) {
        int resultado = 0;
        int nro = 0;
        int cont = 1;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un nro: ");
        nro = teclado.nextInt();

        System.out.println("------------------------------------");

        System.out.println("Tabla de multiplicar de: " + nro);

        while (cont <= 12) {
            resultado = nro * cont;
            System.out.println(nro + "x" + cont + "=" + resultado);
            cont++;
        }
    }
}
