/*
4.- El usuario ingresa 12 valores, de a uno por vez, pertenecientes a sus sueldos
mensuales durante un año. La computadora muestra su sueldo anual. Si durante la
carga de los sueldos mensuales se detecta un valor negativo, esto indica que aún no 
se ha cobrado el mes en curso, por lo tanto, deben dejar de ingresar datos y la 
computadora debe mostrar la sumatoria de sueldos que se llevan cobrados.
Sueldos.java
 */
package a20230529;

import java.util.Scanner;

public class Sueldos {
    public static void main(String[] args) {
        int sueldo[]=new int[12];
        int paso=0;
        int suma=0;
        
        Scanner tc= new Scanner(System.in);
        
        for(int i=0; i<12; i++){
            System.out.println("Ing sueldo: ");
            paso=tc.nextInt();
            
            if(paso>0){
                sueldo[i]=paso;
                suma=suma+paso;
            }else{
                i=12;
            }
        }
        
        for(int i=0; i<12; i++){
            System.out.println("Mes: "+(i+1)+" sueldo $"+sueldo[i]);
        }
        System.out.println("El total de los sueldos cobras es: "+suma);
    }
}
