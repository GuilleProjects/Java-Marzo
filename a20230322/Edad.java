/* Ingresamos nombre y edad de una persona.
Mostramos el nombre y si es o no mayorde edad
*/
package a20230322;
//importar la clase Scanner

import java.util.Scanner;

//creamos la clase
public class Edad{
    //crear el metodo principal
    public static void main(String[] args){ //psvm
    //definir e inic las variables
        int edad=0;
        String nom="";
        //crear un objeto de Scanner
        Scanner teclado=new Scanner(System.in);
        //mensaje para ingresar nombre
        System.out.println("Ingrese nombre: "); //sout
        //captura el ingreso y guardarlo en la variable
        nom=teclado.next();
        //mensaje para ingresar edad
        System.out.println("Ingrese edad: ");
        //capturar edad
        edad=teclado.nextInt();
        //comparar edad>=18
        if(edad>=18){
        //=>mensaje mayor de edad
        System.out.println(nom+" es mayor de edad");
        //sino mensaje menor de edad
        }else{
            System.out.println(nom+" es menor de edad");
             }
    }    
}

