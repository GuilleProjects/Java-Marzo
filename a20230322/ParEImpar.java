/*
Ingresar un numero por teclado y mostrar un mensaje inficando si es par o impar
 */
//crear paquete
package a20230322;
//importar la clase Scanner

import java.util.Scanner;

//crear clase
public class ParEImpar {
    //crear metodo principal
    public static void main(String[] args) {
        //definir e inicializar variables
        int num=0;
        //crear objeto scanner
        Scanner tecla=new Scanner(System.in);
        //mensaje ingrese numero
        System.out.println("Ingrese nro: ");
        //capturar nro
        num=tecla.nextInt();
        //Consulta resto nro %2==0
        if(num%2==0){
            //Verdadero msj nro par
            System.out.println("El nro ingresado es PAR, el nro es "+num);
        }else{
            //Falso msj nro impar
            System.out.println("El nro ingresado es IMPAR, el numero es "+num);
        }
    }
}
