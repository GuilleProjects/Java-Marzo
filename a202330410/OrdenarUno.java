/*

 */
package a202330410;

import java.util.Scanner;

public class OrdenarUno {

    public static void main(String[] args) {
        double num1 = 0;
        double num2 = 0;
        double num3 = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese tres nros distintos:");
        num1 = teclado.nextDouble();

        System.out.println("Ingrese un nro distinto:");
        num2 = teclado.nextDouble();

        System.out.println("Ingrese otro nro distinto a los anteriores:");
        num3 = teclado.nextDouble();
        
        if (num1 == num2 || num2 == num3 || num1 == num3) {
            System.out.println("Ingrese tres nros distintos");
        } else {
            if (num1 > num2) {
                if (num2 > num3) {
                    System.out.println(num1 + " > " + num2 + " > " + num3);
                } else {
                    if (num3 > num1) {
                        System.out.println(num3 + " > " + num1 + " > " + num2);
                    } else {
                        System.out.println(num1 + " > " + num3 + " > " + num2);
                    }
                }
            } else {
                if (num1 > num3) {
                    System.out.println(num2 + " > " + num1 + " > " + num3);
                } else {
                    if (num2 > num3) {
                        System.out.println(num2 + " > " + num3 + " > " + num1);
                    } else {
                        System.out.println(num3 + " > " + num2 + " > " + num1);
                    }
                }
            }
        }

    }
}
