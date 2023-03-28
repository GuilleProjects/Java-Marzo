

package a20230327;
//importar la clase scanner
import java.util.Scanner;
//creamos la clase
public class MayorResta {
    //crear metodo principal
    public static void main(String[] args) { //psvm
        //definir e inicializar las variables
        int num1=0;
        int num2=0;
        int resta=0;
        int producto=0;
        //crear un objeto de scanner para el teclado
        Scanner teclado=new Scanner(System.in);
        //MENSAJE EN PANTALLA
        System.out.println("Ingresa un nro: ");//sout
        //capturamos y guardamos en una variable
        num1=teclado.nextInt();
        System.out.println("Ingresa otro nro: ");
        num2=teclado.nextInt();
        // si num1>=num2 realizar una resta de los dos
        if(num1>=num2){
            resta=num1-num2;
            System.out.println("La resta entre "+num1 +" - " + num2 + " = "+ resta);
        }else{
            //Sino realizar el producto entre los dos
            producto=num1*num2;
            System.out.println("El producto entre "+num1 +" * " + num2 + " = "+ producto);
        }
      
    }
    
}
    

