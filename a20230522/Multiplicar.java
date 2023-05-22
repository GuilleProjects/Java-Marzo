/*
4.1) Dado un entero N entre 1 y 10 (inclusive), la computadora muestra la tabla de
multiplicar de N.Multiplicar.java

 */
package a20230522;

import java.util.Scanner;

public class Multiplicar {
    public static void main(String[] args) {
        int n=0;
        int resultado=0;
        
        Scanner tc=new Scanner(System.in);
        System.out.println("Ing. nro: ");
        n=tc.nextInt();
        
        if(n>=0&&n<=10){
            for(int i=1; i<=12; i++){
            resultado=n*i;
            System.out.println(n+"x"+i+ " "+resultado);
        }
        } else {
            System.out.println("El valor ingresado esta fuera de rango");
        }
    }
}
