/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a20230522;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class PromediW {

    public static void main(String[] args) {
        String nom;
        int nota1 = 0;
        int nota2 = 0;
        int nota3 = 0;
        int promedio = 0;

        Scanner tc = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del alumno");
        nom = tc.next();
        while (!nom.equalsIgnoreCase("XXX")) {
            System.out.println("Ingrese 1er nota: ");
            nota1 = tc.nextInt();
            System.out.println("Ing.. 2da nota");
            nota2 = tc.nextInt();
            System.out.println("Ingrese 1er nota: ");
            nota3 = tc.nextInt();
            promedio = (nota1 + nota2 + nota3 / 3);

            if (promedio > 6) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Desaprobado");

                System.out.println("Ingrese el nombre del alumno");

            }
        }

    }
}
