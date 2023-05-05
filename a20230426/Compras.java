/*Desarrollar un programa que pida  ua cant de articulos comprados y el precio
unitario de ese articulo. Por cada carga debe preguntar si se desea seguir 
ingresando de la forma "Ã‚Â¿Desea ingresar otro articulo? [S/N]".La carga de datos
finaliza cuando se detecta una n o N. La computadora debemostrar elmonto de la
factura.
 */
package a20230426;

import java.util.Scanner;

public class Compras {

    public static void main(String[] args) {

        //declarar e inicializar variables
        int cantidad = 0;
        int precioUnitario;
        int total = 0;
        String respuesta = "s";

        //crear Scanner
        Scanner tc = new Scanner(System.in);

        while (respuesta.equalsIgnoreCase("s")) {

            System.out.print("Ingrese la cantidad de articulos comprados: ");
            cantidad = tc.nextInt();

            System.out.print("Ingrese el precio unitario del articulo: $");
            precioUnitario = tc.nextInt();

            total = total + (precioUnitario * cantidad);

            System.out.print("¿Desea ingresar otro articulo? [S/N]: ");
            respuesta = tc.next();
        }

        System.out.println("El monto total de la factura es: "
                + "$" + total);
    }
}
