import java.util.Scanner;

/* Ejemplo 6: Estructura cíclica
Como parte de un sistema de facturación es necesario conocer el valor unitario y las cantidades a comprar 
de cada uno de los productos para calcular el total a pagar. 
Se requiere un algoritmo que para 1 cliente, calcule el valor a pagar de N tipos de productos comprados de 
acuerdo a la cantidad a llevar de cada tipo.

Ejemplo:
Cantidad de tipo de productos: 3
Cantidad del producto 1: 4. Valor del producto 1: 2450
Cantidad del producto 2: 10. Valor del producto 2: 6540
Cantidad del producto 3: 1. Valor del producto 3: 1050
Total de la factura: 76250 */

public class Sesion1Ejercicio6 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.print("Digita cantidad total de productos: ");
        int cantTotalProducto = lectura.nextInt();
        int factura=0;    

        for (int i=1; i<=cantTotalProducto; i++){
            System.out.print("Digita cantidad del producto: "+i+" :");
            int cantProducto=lectura.nextInt();
            System.out.print("Digita valor unitario producto "+i+" : $");
            int valorUnitario=lectura.nextInt();        
            factura=factura+(valorUnitario*cantProducto);
        }
        System.out.println("-------------------------------------------");
        System.out.println("TOTAL A CANCELAR FACTURA: $"+factura);
        System.out.print("-------------------------------------------");
        lectura.close();
    }  
}