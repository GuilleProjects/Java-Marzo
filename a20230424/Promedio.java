/*
Ingresan notas numéricas de 0 a 10. El proceso de carga finaliza cuando se
detecta un número fuera de rango (negativo o mayor que 10). La computadora
muestra el promedio de las notas.Promedio.java
 */
package a20230424;

import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        //declaro y inicializo las vairables
        double nro=0;
        double promedio=0;
        double suma=0;
        int cont=1;
        
        //crear objeto scanner
         Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un nro: ");
        nro = teclado.nextDouble();
        //capturar el valor ingresado en la variable numero
        
        System.out.println("------------------------------------");
        
        //repite el bucle o ciclo mientras la variable nro sea mayor a cero y menor a diez
        while(nro>=0 && nro<=10){
            System.out.print("Ingrese un nro: ");
            nro=teclado.nextDouble();    
            suma+=nro;
            cont++;
        }

        promedio=(suma/cont);
        System.out.println("El promedio es: "+promedio);
    }
}
