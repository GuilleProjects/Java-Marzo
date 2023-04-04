/*
 Se ingresan dos números enteros. La computadora muestra su cociente
entero. Si hubiere resto, mostrarlo en otra línea.
CocienteYResto.java
 */
package a20230403;

import java.util.Scanner;

public class CocienteYResto {
    public static void main(String[] args) {
        double num1=0;
        double num2=0;
        int cociente=0;
        int resto=0;
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        num1= teclado.nextDouble();
        
        System.out.print("Ingrese otro numero: ");
        num2= teclado.nextDouble();
        
        //COCIENTE ENTERO
        cociente=(int) (num1/num2);
        //Mostrar el resto si lo hay
        resto=(int) (num1%num2);
        
        System.out.println("El cociente es: "+cociente);
        
        if(resto>0){
            System.out.println("El resto es: "+resto);
        }
    }
}
