package a20230412;

import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {
        int nro = 0;
        int resto = 0;
        int mil = 0;
        int cen = 0;
        int dec = 0;
        int uni = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un nro: ");
        nro = teclado.nextInt();

        mil = nro / 1000;
        resto = nro % 1000;
        cen = resto / 100;
        resto = resto % 100;
        dec = resto / 10;
        uni = resto % 10;

        if (nro <= 9) {
            System.out.println("Es capicua");
        } else {
            if (nro < 100) {
                if (dec == uni) {
                    System.out.println("Es capicua");
                } else {
                    System.out.println("No es capicua");
                }
            } else {
                if (mil == uni) {
                    if (cen == dec) {
                        System.out.println("Es capicua");
                    } else {
                        System.out.println("No es capicua");
                    }
                } else {
                    System.out.println("No es capicua");
                }
            }
        }
    }
}
