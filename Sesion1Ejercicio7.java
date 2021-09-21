import java.util.Scanner;

/* aspecto importante es el formato de entrada de los datos, la primera línea de la entrada se trata del 
número de registros que se deben leer. Las líneas de los registros tienen un formato de tabla, el orden 
de las columnas es: nombre, género, materia y calificación, las columnas están separadas por un espacio. 
Se recomienda copiar y pegar este ejemplo en la terminal para realizar pruebas. */


public class Sesion1Ejercicio7 {
    public static void main(String[] args) {
        Scanner lectura =new Scanner(System.in);
        System.out.print("Digita cantidad de registros a leer: ");
        int cantRegistros = lectura.nextInt(); //Cantidad de registros a leer
        for(int i=0;i<=cantRegistros;i++){
            //System.out.println("Registro "+(i)+" : ");
            String[] arregloRegistros = lectura.nextLine().split(" ");
        }
        for (String arregloRegistro : arregloRegistros)
        {
          System.out.println(arregloRegistro);
        }

    }
}

