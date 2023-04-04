/*
Dado un número, la computadora indica si es positivo.
Positivo.java
 */
package a20230403;

import java.util.Scanner;

public class Positivo {
    public static void main(String[] args) {
        double number=0;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese un nro: ");
        number=teclado.nextDouble();
        
        if(number>0){
            System.out.println("El numero ingresado es POSITIVO");
        }else{
            System.out.println("El numero ingresado es NEGATIVO");
        }
    }
}
