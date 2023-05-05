/*Desarrolle un programa que pida un caracter al usuario, y q por c/carga 
pregunte  si se desea seguir ingresando. De la forma:"�Desea ingresar otro 
caracter?[S/N]"
La carga de datos finaliza cuando se detecta una n o N. La compu debe  mostrar 
la cant de letras vocales  ingresadas (debe admitir mayusculas y minusculas)
 */

package a20230426;

import java.util.Scanner;

public class Caracter {

    public static void main(String[] args) {

        //declarar e inicializar vaiables
        String letra = "";
        int vocal = 0;
        String caracteres = "";
        String respuesta = "s";

        //crear Scanner
        Scanner tc = new Scanner(System.in);

        while (respuesta.equalsIgnoreCase("s")) {

            System.out.println(" ingrese un caracter: ");

            letra = tc.next();

            if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")
                    || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
                vocal++;
            }
            caracteres = caracteres + letra;

            System.out.println("Desea ingresar otro caracter? (s/n): ");

            respuesta = tc.next();

        }
        System.out.println("la cantidad de vocales ingresadas es: " + vocal);

        System.out.println("los caracteres ingresados son: " + caracteres);

    }

}
