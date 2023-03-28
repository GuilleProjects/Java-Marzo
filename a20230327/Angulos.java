/*
 Dados los valores de dos de los ángulos interiores de un triángulo, la
computadora muestra el valor restante.
Ejemplo: Ingresa 40 y 60, debe devolver 80.
 */
package a20230327;

import java.util.Scanner;

public class Angulos {
    public static void main(String[] args) {
        double ang1=0;
        double ang2=0;
        double total=0;
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Ingrese un angulo interior: ");
        ang1=teclado.nextDouble();
        
        System.out.println("Ingrese otro angulo interior: ");
        ang2=teclado.nextDouble();
        
        total=(180-ang1-ang2);
        System.out.println("Angulo restante: "+total);
        
    }
}
