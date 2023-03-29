/*
 Dado un tiempo en segundos, la computadora lo muestra expresado en días,
horas, minutos y segundos.
Ejemplo: Ingresa 1000000, debe devolver 11d, 13h, 46m y 40s.
Segundos a dias, horas, minutos y segundos. 
 */
package a20230329;

import java.util.Scanner;


public class Tiempo {
    public static void main(String[] args) {
        int totalSg=0;
        int dias=0;
        int horas=0;
        int minutos=0;
        int segundos=0;
        int resto=0;
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Ingrese total en Segundos: ");
        totalSg=teclado.nextInt();
        
        dias=(totalSg/86400);
        resto=(totalSg%86400);
        horas=(resto/3600);
        resto=(resto%3600);
        minutos=(resto/60);
        segundos=(resto%60);
        
        System.out.println("Tiempo: "+dias+"d,"+horas+"h,"+minutos+"m,"+segundos+"s");
    }
}
