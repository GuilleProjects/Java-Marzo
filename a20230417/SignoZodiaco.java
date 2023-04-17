/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a20230417;

import java.util.Scanner;

public class SignoZodiaco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia=0;
        int mes=0;
        String signo = "";
        
        System.out.print("Ingresa el día de tu cumpleaños: ");
        dia = teclado.nextInt();
        
        System.out.print("Ingresa el mes de tu cumpleaños: ");
        mes = teclado.nextInt();
        
        switch(mes) {
            case 1:
                if(dia < 21) {
                    signo = "CAPRICORNIO";
                } else {
                    signo = "ACUARIO";
                }
                break;
            case 2:
                if(dia < 19) {
                    signo = "ACUARIO";
                } else {
                    signo = "PISCIS";
                }
                break;
            case 3:
                if(dia < 21) {
                    signo = "PISCIS";
                } else {
                    signo = "ARIES";
                }
                break;
            case 4:
                if(dia < 21) {
                    signo = "ARIES";
                } else {
                    signo = "TAURO";
                }
                break;
            case 5:
                if(dia < 22) {
                    signo = "TAURO";
                } else {
                    signo = "GEMINIS";
                }
                break;
            case 6:
                if(dia < 22) {
                    signo = "GEMINIS";
                } else {
                    signo = "CANCER";
                }
                break;
            case 7:
                if(dia < 23) {
                    signo = "CANCER";
                } else {
                    signo = "LEO";
                }
                break;
            case 8:
                if(dia < 24) {
                    signo = "LEO";
                } else {
                    signo = "VIRGO";
                }
                break;
            case 9:
                if(dia < 24) {
                    signo = "VIRGO";
                } else {
                    signo = "LIBRA";
                }
                break;
            case 10:
                if(dia < 24) {
                    signo = "LIBRA";
                } else {
                    signo = "ESCORPIO";
                }
                break;
            case 11:
                if(dia < 23) {
                    signo = "ESCORPIO";
                } else {
                    signo = "SAGITARIO";
                }
                break;
            case 12:
                if(dia < 22) {
                    signo = "SAGITARIO";
                } else {
                    signo ="CAPRICORNIO";
                }
                break;
            default:
                System.out.println("Fecha de cumpleaños inválida");
        }
        
        System.out.println("Tu signo del zodiaco es: " + signo);
    }
}
