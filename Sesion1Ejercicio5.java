import java.util.Scanner;

/* 05-07-2021
Sesion No.1 Ejercicio No. 5
Ejemplo 5: Estructura dependiendo de o Según

Una determinada empresa ha decidido ofrecer descuentos a sus clientes de acuerdo al día de la semana 
en el que se realice la compra, para lo cual se requiere un algoritmo que dado el día de la semana 
(en número), y el total a pagar sin descuento, calcule el total incluyendo el descuento. El descuento 
se otorga de acuerdo a la siguiente tabla.
dia 1--- 5%
dia 2--- 3%
dia 3--- 10%
dia 4--- 4%
dia 5--- 6%
dia 6--- 2%
dia 7--- 1% */

public class Sesion1Ejercicio5 {
    public static void main(String[] args) {
       Scanner lectura = new Scanner(System.in);
       System.out.print("Digita dia de la semana de 1 a 7: ");
       int diaSemana = lectura.nextInt();
       switch(diaSemana){
           case 1:
           System.out.print("Tienes un descuento del 5%");
           break;
           case 2:
           System.out.print("Tienes un descuento del 3%");
           break;
           case 3:
           System.out.print("Tienes un descuento del 10%");
           break;
           case 4:
           System.out.print("Tienes un descuento del 4%");
           break;
           case 5:
           System.out.print("Tienes un descuento del 6%");
           break;
           case 6:
           System.out.print("Tienes un descuento del 2%");
           break;
           case 7:
           System.out.print("Tienes un descuento del 1%");
           break;
           default:
           System.out.print("No es posible hacer descuento");
        }
    lectura.close();
    }
    
}
