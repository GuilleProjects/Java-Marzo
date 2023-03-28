/*
Dado el valor del radio de una circunferencia, la computadora muestra el valor
de su superficie y su perímetro.
Ejemplo: Ingresa 5, debe devolver Sup: 78.5398163397 y Per: 31.4159265359.
 */
package a20230327;

import java.util.Scanner;

public class Circunferencia {
    public static void main(String[] args) {
        double radio=0;
        double superficie=0;
        double perimetro=0;
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Dar radio de circunferencia: ");
        radio=teclado.nextDouble();
        
        superficie=Math.PI*(Math.pow(radio,2));
        perimetro=((Math.PI*2)*radio);
        
        System.out.println("El valor de la superficie es: "+superficie);
        System.out.println("El valor del perimetro es: "+perimetro);
    }

}
