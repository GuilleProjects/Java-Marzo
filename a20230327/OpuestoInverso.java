/*
Ingresar un número y que la computadora muestre su opuesto y su inverso.
Ejemplo: Ingresa 8, debe devolver -8 y 0.125.
 */
package a20230327;

import java.util.Scanner;

public class OpuestoInverso {
    public static void main(String[] args) {
       //definir e inicializar las variables
       double num1=0;
       double opuesto=0;
       double inverso=0;
       //crear un objeto scanner para el taclado
        Scanner teclado=new Scanner(System.in);
        //Mensaje en pantalla
        System.out.println("Ingresa un nro: ");//sout
        //capturamos y guardamos en una variable
        num1=teclado.nextDouble();
        
        opuesto=(num1*(-1));
        inverso=(1/num1);
        System.out.println("El opuesto de: "+num1+" es: "+opuesto);
        System.out.println("El inverso de: "+num1+" es: "+inverso);
}

}
