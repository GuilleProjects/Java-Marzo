/*
  Dada la edad de una persona y su género (“F” para mujeres, “M” para
hombres), la computadora indica si está en edad de jubilarse.
 */
package a20230403;

import java.util.Scanner;
public class Jubilacion {
    public static void main(String[] args) {
        int edad=0;
        String genero="";
        
        Scanner teclado= new Scanner(System.in);
        
        System.out.print("Ingrese su edad: ");
        edad= teclado.nextInt();
        
        System.out.print("Ingrese su genero, si es mujer ingrese F y si es hombre ingrese M: ");
        genero= teclado.next();
        
        if(genero.equals("F")){
            if(edad>=60){
                System.out.println("Usted puede jubilarse");
            }else{
                System.out.println("Usted no puede jubilarse");
            }
        }else if(genero.equals("M")){
            if(edad>=65){
                System.out.println("Usted puede jubilarse");
            }else{
                System.out.println("Usted no puede jubilarse");
            }
        } else {
            System.out.println("El genero ingresado no corresponde");
        }
    }
}
