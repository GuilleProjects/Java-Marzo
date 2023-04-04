/*
 Dada la cantidad de alumnos de un curso y la cantidad de sillas disponibles, la
computadora indica si alcanzan las sillas, en caso contrario, indica cuántas faltan para
que todo el alumnado tenga asiento.
 */
package a20230403;

import java.util.Scanner;

public class Sillas {

    public static void main(String[] args) {
        int alumnos = 0;
        int sillas = 0;
        int nro = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero de alumnos: ");
        alumnos = teclado.nextInt();

        System.out.print("Ingrese otro numero de sillas: ");
        sillas = teclado.nextInt();

        nro = sillas - alumnos;

        if (nro == 0) {
            System.out.println("Alcanzaron todas la sillas");
        } else {
            if (nro > 0) {
                System.out.println("Alcanzaron todas la sillas y sobraron: " + nro + " sillas");
            } else {
                nro *= (-1);
                System.out.println("No alcanzaron todas las sillas, faltaron: " + nro + " sillas");
            }
        }
    }
}

