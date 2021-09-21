import java.util.Scanner;

/*
02-Julio-2021
Sesion No. 1 Ejercicio No. 3
En un sistema de inventario es importante conocer si es necesario solicitar un determinado producto a su 
proveedor de acuerdoa una cantidad mínima requerida en bodega. Se requiere un algoritmo que dada una cantidad 
en bodega y una cantidad mínima requerida indique si es necesario o no solicitar el producto al proveedor. 
En caso de no ser necesario la solicitud del producto, indique cuántas unidades hacen falta vender para tener
 que realizar el pedido y genere una alerta cuando estas unidas sean menores a 10.
Ejemplos: 
*Cantidad en bodega: 500, Cantidad mínima requerida 100. Entonces no es necesario realizar el pedido al 
proveedor. Unidades que hacen falta vender: 400. 
*Cantidad en bodega: 55, Cantidad mínima requerida 50. Entonces no es necesario realizar el pedido al 
proveedor. Unidades que hacen falta vender: 5. Alerta generada.
*Cantidad en bodega: 300, Cantidad mínima requerida 450. Entonces si es necesario realizar el pedido al 
proveedor.
Requerimiento: utilice condicionales múltiples.
*/

public class Sesion1Ejercicio3 {
    public static void main(String[] args) {
        Scanner lectura =new Scanner(System.in);
        System.out.print("Digita cantidad de inventario en Bodega: ");
        int inventario = lectura.nextInt();
        System.out.print("Digita cantidad minima requerida: ");
        int requerimiento = lectura.nextInt();
        int unidades;
        lectura.close();
        if(inventario<requerimiento){
            System.out.println("Es necesario realizar pedido al proveedor");
        }
        else{
            unidades=inventario-requerimiento;
            System.out.println("No es necesario realizar pedido al proveedor"+" Unidades que hacen falta por vender: "+unidades);
            if(unidades<10){
                System.out.println("Alerta quedan pocas unidades en existencia");
            }
        }
    }        
}       
            