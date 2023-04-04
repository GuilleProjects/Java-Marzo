/*
  Dado un número entero, la computadora indica si es par o impar.
ParImpar.java

 */
package a20230403;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        int number=0;
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        number=teclado.nextInt();
        
        if(number%2==0){
            System.out.println("El nro ingresado es PAR");
        }else{
            System.out.println("El nro ingresado es IMPAR");
        }
    }
}
