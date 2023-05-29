/*
Cargar por teclado 7 valores. Mostrar la suma y el promedio de los valores cargados.
Despues mostrar los valores mayores al promedio calculado
 */
package a20230529;

import java.util.Scanner;

public class MayorPromedio {
    public static void main(String[] args) {
        int valor[]=new int[5];
        int suma=0;
        int promedio=0;
        
        Scanner sc = new Scanner(System.in);
        
        //Cargar datos en el Array
        for(int i=0; i<5; i++){
            System.out.println("Ing un valor: ");
            valor[i]=sc.nextInt();
           suma+=valor[i]; 
        }
        
        //Mostrar contenido del Array
        for(int j=0;j<5;j++){
            System.out.println(valor[j]);   
        }
        
        //Calcular y mostrar el promedio
        promedio=suma/5;
        System.out.println("Suma: "+suma+", Promedio: "+promedio);
        
        //Valores mayores del promedio
        for(int i=0; i<5;i++){
            if(promedio<valor[i]){
                System.out.println("Valor mayor del promedio: "+valor[i]);
            }
        }
    }
}
