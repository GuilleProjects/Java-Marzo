/*
     Dada una comisión de 5 alumnos se debe ingresar el nombre del alumno y sus 3 notas
    Indicar el nombre del alumno 
 */
package a20230522;

import java.util.Scanner;

public class Promediow {
        public static void main(String[] args) {
        String nom;
        int nota1=0;
        int nota2=0;
        int nota3=0;
        int promedio=0;
        
        Scanner tc=new Scanner(System.in);
        
        for(int i=0; i<3; i++){
            System.out.println("Ing. nombre: ");
            nom=tc.next();
            
            System.out.println("Ing. 1er nota: ");
            nota1=tc.nextInt();
            
            System.out.println("Ing. 2da nota: ");
            nota2=tc.nextInt();
            
            System.out.println("Ing. 3er nota: ");
            nota3=tc.nextInt();
            
            promedio=(nota1+nota2+nota3)/3;
            
            if(promedio>=6){
                System.out.println(nom+" Legajo n°"+i+" aprobado");
            } else {
                System.out.println(nom+" reprobrado");
            }
        } 
    }
}

