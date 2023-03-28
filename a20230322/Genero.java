/*
Ingresar nombre y genero y mostrar un saludo formal
 */
package a20230322;
//importar la clase Scanner

import java.util.Scanner;


//creamos la clase
public class Genero {
    //crear el metodo principal
    public static void main(String[] args) {
        //definir e inic las variables
        String nom;
        String genero;
        //crear un objeto de la Scanner
        Scanner tecla=new Scanner(System.in);
        //Mensaje ingrese nombre
        System.out.println("Ingrese nombre: ");
        //capturar nombre 
        nom=tecla.next();
        //mensaje ingrese genero
        System.out.println("Ingrese genero: ");
        //capturar el genero
        genero=tecla.next();
        //compare genero con "F"
        if(genero.equals("f")){
            //verdad msj "hola Srta "+nombre
            System.out.println("Hola srta. "+nom);
            //falso msj "hola sr. "+nombre
        }else{
            System.out.println("Hola sr. "+nom);
        }
    }
}
