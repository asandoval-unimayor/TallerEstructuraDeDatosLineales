//Inicializar directamente un arreglo con los primeros 10 números primos e imprimir el arreglo.
package arreglos;
import recomendaciones.Impresion;

public class Ejercicio1 {


    public static void ejecutar() {
        // Inicialización directa de los primeros 10 números primos
        int[] primos = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};

        // Impresión del resultado
        Impresion.imprimirArreglo("Primeros 10 Números Primos", primos);
    }

}
