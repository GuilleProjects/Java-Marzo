/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a20230417;

import java.util.Scanner;

public class Mes {
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero=0;
        String mes = "";

        
        System.out.print("Ingrese un número entre 1 y 12: ");
        numero = teclado.nextInt();
        
        switch(numero) {
            case 1:
                mes = "ENERO";
                break;
            case 2:
                mes = "FEBRERO";
                break;
            case 3:
                mes = "MARZO";
                break;
            case 4:
                mes = "ABRIL";
                break;
            case 5:
                mes = "MAYO";
                break;
            case 6:
                mes = "JUNIO";
                break;
            case 7:
                mes = "JULIO";
                break;
            case 8:
                mes = "AGOSTO";
                break;
            case 9:
                mes = "SEPTIEMBRE";
                break;
            case 10:
                mes = "OCTUBRE";
                break;
            case 11:
                mes = "NOVIEMBRE";
                break;
            case 12:
                mes = "DICIEMBRE";
                break;
            default:
                System.out.println("Error: número fuera de rango");
        }

        System.out.println("El mes correspondiente al número ingresado es: " + mes);
    }
}
