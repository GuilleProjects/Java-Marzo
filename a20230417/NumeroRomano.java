
package a20230417;

import java.util.Scanner;

public class NumeroRomano {

    public static void main(String[] args) {
        String romano = "";
        int numero=0;
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        numero = teclado.nextInt();

        switch (numero) {
            case 1:
                romano = "I";
                break;
            case 5:
                romano = "V";
                break;
            case 10:
                romano = "X";
                break;
            case 50:
                romano = "L";
                break;
            case 100:
                romano = "C";
                break;
            case 500:
                romano = "D";
                break;
            case 1000:
                romano = "M";
                break;
            default:
                System.out.println("El número ingresado no es válido");
        }

        System.out.println("El número " + numero + " en números romanos es " + romano);
    }
}

