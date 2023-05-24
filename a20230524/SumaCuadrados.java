/*
4.6) El usuario ingresa un valor N. Escriba un programa que calcule la suma de los
cuadrados de los N primeros números naturales. SumaCuadrados.java
Ejemplo: Se ingresa 6, la computadora muestra 91.
 */
package a20230524;

import java.util.Scanner;

public class SumaCuadrados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nro=0;
        int total=0;
        
        System.out.println("Ingrese un número natural: ");
        nro= sc.nextInt();
        
        for (int i=1; i<=nro; i++) {
            int valor=i;
            total+=(int) Math.pow(valor,2);
        }
        System.out.println("El valor es: "+ total);
    }
}
