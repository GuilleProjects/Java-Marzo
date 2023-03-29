/*
Dada una temperatura en grados centígrados, la computadora la muestra en
grados Fahrenheit.
 */
package a20230329;
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        double celsius=0;
        double fahrenheit=0;
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        celsius = teclado.nextDouble();
        fahrenheit = (celsius * 1.8) + 32;
        
        System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);
    }
}
