//crear un paquete
package a20230315;

//importar scanner
import java.util.Scanner;
//crear una clase
public class SumaIng {
    //crear un metodo principal
    public static void main(String[] args){  //psvm
        //declarar e inic. las variables
        int nro1=0;
        int nro2=0;
        int suma=0;
        
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
        //operacion suma
        suma=nro1+nro2;

        //muestre el resultado
        System.out.println("La suma de "+nro1+" + "+nro2+" = "+suma);
        
    }
}
