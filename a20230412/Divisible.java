/*
Dados dos números enteros, la computadora indica si el mayor es divisible por
el menor.
Divisible.java
 */
package a20230412;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        int nro1=0;
        int nro2=0;
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Ingrese un nro: ");
        nro1=teclado.nextInt();
        
        System.out.println("Ingrese un nro: ");
        nro2=teclado.nextInt();
        
        if(nro1>nro2){
            if(nro1%nro2==0){
                System.out.println("El nro1 es divisible por el nro2");
            } else{
                System.out.println("No es divisible");
            }
        } else{
            if(nro2%nro1==0){
                System.out.println("El Nro2 es divisible por nro1");
            } else{
                System.out.println("No es divisible");
            }
        }
    }
}
