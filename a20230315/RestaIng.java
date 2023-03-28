package a20230315;
//importar scanner

import java.util.Scanner;
//crear una clase

public class RestaIng {
     //crear un metodo principal
    public static void main(String[] args){  //psvm
        //declarar e inic. las variables
        int nro1=0;
        int nro2=0;
        int resta=0;
        
        //crear un objeto scanner
        Scanner teclado=new Scanner(System.in);
        
        //Mostrar mensaje
        System.out.println("Ingrese un numero: ");
        //capturar valor
        nro1=teclado.nextInt();
        
        //mostrar mensaje
        System.out.println("Ingrese un numero: ");
        //capturar valor
        nro2=teclado.nextInt();
        
        //operacion resta
        resta=nro1-nro2;

        //muestre el resultado
        System.out.println("La resta de "+nro1+" - "+nro2+" = "+resta);   
    }
}

