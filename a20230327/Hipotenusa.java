/*
Dados dos valores para cada cateto de un triángulo rectángulo, la computadora
calcula y muestra el valor de la hipotenusa.
Ejemplo: Ingresa 3 y 4, debe devolver 5.
 */
package a20230327;

import java.util.Scanner;

public class Hipotenusa {
    public static void main(String[] args) {
        double cateto1=0;
        double cateto2=0;
        double hipotenusa=0;
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Dar un cateto: ");
        cateto1=teclado.nextDouble();
        
        System.out.println("Dar otro cateto: ");
        cateto2=teclado.nextDouble();
        
        hipotenusa=Math.sqrt(Math.pow(cateto1, 2)+Math.pow(cateto2,2));
        
        System.out.println("La hipotenusa es: "+hipotenusa);
    }
        
}
