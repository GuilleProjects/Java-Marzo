/*
Se ingresan números hasta que se introduce un cero. La computadora muestra
el máximo y el mínimo. MaxMin.java
 */
package a20230424;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        //declaro y inicializo las vairables
        int nro=0;
        int max=0;
        int min=9999999;
        //crear objeto scanner
         Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un nro: ");
        nro = teclado.nextInt();
        //capturar el valor ingresado en la variable numero
        System.out.println("------------------------------------");
        //repite el bucle o ciclo mientras la variable nro sea distinta de 0
        while(nro!=0){
            //comparar el contenido de nro con e contenido de max
            if(nro>max){
                //si nro>max asigna a la variable max el contenido de nro
                max=nro;
            }
            if(nro<min){
                min=nro;
            }
            
            System.out.print("Ingrese un nro: ");
            nro=teclado.nextInt();
        }
        System.out.println(max+" es el mayor nro ingresado");
        System.out.println(min+" es el menor nro ingresado");
    }
}
