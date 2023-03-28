/*
Dadas 3 notas pertenecientes a tres trimestres distintos, la computadora
muestra la nota promedio.
Ejemplo: Ingresa 3, 8 y 2, debe devolver 4.33333333.
 */
package a20230327;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        double nota1=0;
        double nota2=0;
        double nota3=0;
        double promedio=0;
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Ingresar nota uno: ");
        nota1=teclado.nextDouble();
        
        System.out.println("Ingresar nota dos: ");
        nota2=teclado.nextDouble();
        
        System.out.println("Ingresar nota tres: ");
        nota3=teclado.nextDouble();

        promedio=((nota1+nota2+nota3)/3);
        
        System.out.println("El promedio es igual a: "+promedio);
          

    }
    
}
