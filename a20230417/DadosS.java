/*

 */
package a20230417;

import java.util.Scanner;

public class DadosS {

    public static void main(String[] args) {
        String caraOpuesta = "";
        int resultado = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el resultado obtenido al lanzar el dado: ");
        resultado = teclado.nextInt();

        switch (resultado) {
            case 1:
                caraOpuesta = "Seis";
                break;
            case 2:
                caraOpuesta = "Cinco";
                break;
            case 3:
                caraOpuesta = "Cuatro";
                break;
            case 4:
                caraOpuesta = "Tres";
                break;
            case 5:
                caraOpuesta = "Dos";
                break;
            case 6:
                caraOpuesta = "Uno";
                break;
            default:
                System.out.println("El resultado ingresado no es válido");
                break;
        }

        if (resultado > 0 && resultado <= 4) {
            System.out.println("La cara opuesta es: " + caraOpuesta);
        }
    }
}
