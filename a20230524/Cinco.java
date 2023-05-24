/*
4.5) El usuario ingresa un valor N. Escriba un programa que imprima los primeros N
números terminados en 5. Cinco.java
Ejemplo: Se ingresa 10, la computadora muestra 5 15 25 35 45 55 65 75 85 95.
 */
package a20230524;

import java.util.Scanner;

public class Cinco {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nro=0;
        int valor=0;
        
        System.out.print("Ingrese un número natural: ");
        nro= sc.nextInt();
        valor=5;
        System.out.println(valor);
        
        for (int i=0; i <nro; i++) {
            valor+=10;
            System.out.println(valor);
        }
    }
}
