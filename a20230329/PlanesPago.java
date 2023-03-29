/*
Una casa de artículos para el hogar ofrece a sus clientes los siguientes planes
de pago:
◦ Plan 1: 100% al contado. Se hace el 10% de descuento sobre el precio publicado.
◦ Plan 2: 50% al contado y el resto en 2 cuotas iguales. El precio publicado se
incrementa en un 10%.
◦ Plan 3: 25% al contado y el resto en 5 cuotas iguales. El precio publicado se
incrementa en un 15%.
◦ Plan 4: Totalmente financiado en 8 cuotas. El 60% se reparte en partes iguales en
las primeras 4 cuotas y el resto se reparte en partes iguales en las últimas 4
cuotas. El precio publicado se incrementa en un 25%.
Se ingresa el plan y el precio, se muestran la cantidad de cuotas, el valor de la cuota, el valor a pagar en efectivo y el total a pagar.
Descuento.java

 */
package a20230329;

import java.util.Scanner;

public class PlanesPago {
    public static void main(String[] args) {
        double total=0;
        int numP=0;
        double pago=0;
        double contado=0;
        double cuotas=0;
        
        Scanner teclado=new Scanner(System.in);

        System.out.println("Ingrese el total: ");
        total=teclado.nextDouble();
        
        System.out.println("Ingrese el nro de plan de pago: ");
        numP=teclado.nextInt();
       
        if(numP==1){
            contado=((total*9)/10);
            System.out.println("Pague al contado con un 10% de descuento.");
            System.out.println("Total: "+contado);
        } else if(numP==2){
                pago=((11*total)/10);
                contado=pago/2;
                cuotas=contado/2;
                System.out.println("Se paga un 10% más, 50% al contado y el resto en 2 cuotas iguales");
                System.out.println("Pagamos: "+pago+" 50% al contado: "+contado+" en 2 cuotas iguales de: "+cuotas);
            } else if(numP==3){
                pago=((115*total)/100);
                contado=((pago*25)/100);
                cuotas=((75*pago)/100)/5;
                System.out.println("Se paga un 15% más, 25% al contado y el resto en 5 cuotas iguales");
                System.out.println("Pagamos: "+pago+" 25% al contado: "+contado+" en 5 cuotas iguales de: "+cuotas);
            } else if(numP==4){
                pago=((125*total)/100);
                contado=((pago*60)/100)/8;
                cuotas=((pago*40)/100)/4;
                System.out.println("Se paga un 25% más, 60% en 8 cuotas y el resto en 4 cuotas iguales");
                System.out.println("Pagamos: "+pago+" 60% en 8 cuotas: "+contado+" y el resto en 4 cuotas iguales de: "+cuotas);
            } else {
                System.out.println("El numero ingresado no corresponde a un plan");
            }   
        }
    }
        
