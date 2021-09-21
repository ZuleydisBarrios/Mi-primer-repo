import java.util.Scanner;

/*
02-Julio-2021
Sesion No. 1 Ejercicio No. 4
Ejemplo 4: Estructura condicional anidado

En un sistema de inventario es importante conocer si es necesario solicitar un determinado producto a su proveedor 
de acuerdo a una cantidad mínima requerida en bodega. Se requiere un algoritmo que dada una cantidad en bodega y 
una cantidad mínima requerida indique si es necesario o no solicitar el producto al proveedor. 
Adicionalmente, en caso de no ser necesario la solicitud del producto, indique cuántas unidades hacen falta vender 
para tener que realizar el pedido y genere una alerta cuando estas unidades sean menores a 10. Por el contrario si 
se debe realizar el pedido, debe solicitar las unidades de compra deseadas, el valor de compra del producto y el 
dinero en caja con el fin de validar si es posible realizar la compra.

Ejemplos: 
*Cantidad en bodega: 500, Cantidad mínima requerida 100. Entonces no es necesario realizar el pedido al proveedor. 
Unidades que hacen falta vender: 400. 
*Cantidad en bodega: 55, Cantidad mínima requerida 50. Entonces no es necesario realizar el pedido al proveedor. 
Unidades que hacen falta vender: 5. Alerta generada.
*Cantidad en bodega: 300, Cantidad mínima requerida 450. Entonces si es necesario realizar el pedido al proveedor. 
Cantidades de compra deseada: 200. Valor de compra: 3350, Valor en caja: 1.050.000. Si es posible realizar el pedido
*Cantidad en bodega: 300, Cantidad mínima requerida 450. Entonces si es necesario realizar el pedido al proveedor. 
Cantidades de compra deseada: 200. Valor de compra: 3350, Valor en caja: 400.000. No es posible realizar el pedido

Requerimiento: utilice condicionales anidados.
*/

public class Sesion1Ejercicio4 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.print("Digite la cantidad de inventario que hay en Bodega: ");
        int inventario = lectura.nextInt();
        System.out.print("Digite la cantidad requerida: ");
        int requerimiento = lectura.nextInt();
        int unidades;
        int totalCompra;
        if(inventario>requerimiento){
            unidades=inventario-requerimiento;
            System.out.println("No es necesario realizar pedido al proveedor "+"Unidades que hacen falta por vender: "+unidades);
            if(unidades<10){
                System.out.println("Alerta generada");
            }
        }
        else{
            System.out.print("Ingrese Compra deseada: ");
            int compraDeseada = lectura.nextInt();
            System.out.print("Ingresa Valor de la compra del producto: ");
            int valorCompraProducto = lectura.nextInt();
            System.out.print("Ingresa cuanto dinero tiene la caja: ");
            int dineroEnCaja = lectura.nextInt();
            totalCompra=valorCompraProducto*compraDeseada;
            if(dineroEnCaja>totalCompra){
                System.out.print("Es necesario realizar el pedido al proveedor.Cantidades de compra deseada: "+compraDeseada+". Valor de compra: "+valorCompraProducto+", Valor en caja: "+dineroEnCaja+". Si es posible realizar el pedido");
            }
            else{
                System.out.println("Es necesario realizar el pedido al proveedor. Cantidades de compra deseada: "+compraDeseada+". Valor de compra: "+valorCompraProducto+", Valor en caja: "+dineroEnCaja+". No es posible realizar el pedido");
            }
        }
        lectura.close();
    }
}