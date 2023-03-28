/*
Ingresar el nombre, el valor de una hora de trabajo y la cantidad de horas trabajadas por
día, la computadora muestra el valor del sueldo diario.
Ejemplo: Ingresa 80 y 8, debe devolver 640.

 */
package a20230327;

import java.util.Scanner;

public class SueldoDiario {
    public static void main(String[] args) {
        String nombre="";
        double hora=0;
        double horasWork=0;
        double sueldoDiario=0;
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Ingrese nombre: ");
        nombre=teclado.next();
        
        System.out.println("Ingrese el valor de una hora de trabajo");
        hora=teclado.nextDouble();
        
        System.out.println("Ingresa horas de trabajo diaria ");
        horasWork=teclado.nextDouble();
        
        sueldoDiario=(hora*horasWork);
        System.out.println("Sueldo diario de "+nombre+" es: $"+sueldoDiario);
        
    }
}
