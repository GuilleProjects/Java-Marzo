/*
1.- Crea una aplicación que permita adivinar un número. La aplicación genera un número aleatorio 
del 1 al 100. A continuación va pidiendo números y va respondiendo si el número a adivinar es 
mayor o menor que el introducido, a demás de los intentos que te quedan (tienes 10 intentos para 
acertarlo). 
El programa termina cuando se acierta el número (además te dice en cuantos intentos lo has acertado), 
si se llega al limite de intentos te muestra el número que había generado.
 */
package a20230524;

import java.util.Scanner;

public class AdivinarNro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int random = 300;//(int) (Math.random() * 1000);
        int nro = 0;
        int cont=0;
        
        while (nro != random) {
            cont++;
            for (int i = 1; i <= 10; i++) {
                System.out.println("Ingrese un nro: ");
                nro = sc.nextInt();

                if (nro < random) {
                    System.out.println("El numero ingresado es menor. Te quedan " + (10 - i) + " intentos");
                } else {
                    if (nro > random) {
                        System.out.println("El nro ingresado es mayor. Te quedan " + (10 - i) + " intentos");
                    }
                    System.out.println("Felicitaciones!" + " Intentos: " + i);
                }
            }

        }

    }

}
