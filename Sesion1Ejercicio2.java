/*
02 Julio de 2021
Sesion No.1 
Ejemplo 2: Estructura condicional doble
En un sistema de inventario es importante conocer si es necesario solicitar un determinado producto a su proveedor de acuerdo a una cantidad mínima requerida en bodega. Se requiere un algoritmo que dada una cantidad en bodega y una cantidad mínima requerida indique si es necesario o no solicitar el producto al proveedor.
Ejemplos: 
*Cantidad en bodega: 500, Cantidad mínima requerida 100. Entonces no es necesario realizar el pedido al proveedor.
*Cantidad en bodega: 300, Cantidad mínima requerida 450. Entonces si es necesario realizar el pedido al proveedor.
Requerimiento: utilice condicionales dobles.
*/

import java.util.Scanner;
public class Sesion1Ejercicio2 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        System.out.print("Digita Cantidad de Inventario en Bodega: ");
        int inventario = lectura.nextInt();
        System.out.print("Digita Cantidad requerida: ");
        int requerimiento = lectura.nextInt();
        lectura.close();
        if (inventario>requerimiento){
            System.out.println("No es necesario realizar pedido al proveedor");
        }
        else{
            System.out.println("Es necesario realizar pedido al proveedor");
        }        
    }
}
