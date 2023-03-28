/*
Dada la superficie de un cuadrado (en m2), la computadora muestra su
perímetro.
Ejemplo: Ingresa 81, debe devolver 36.

 */
package a20230327;

import java.util.Scanner;

public class Cuadrado {
    public static void main(String[] args) {
        double superficie=0;
        double lado=0;
        double perimetro=0;
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Dar la superficie de un cuadrado: ");
        superficie=teclado.nextDouble();
        
        lado=(Math.sqrt(superficie));
        perimetro=(lado*4);
        
        System.out.println("El perimetro es igual a: "+perimetro);
          
    }
}
