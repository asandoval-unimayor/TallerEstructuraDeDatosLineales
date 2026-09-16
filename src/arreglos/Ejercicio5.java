//Inicializa un arreglo con 20 números aleatorios, enteros e invierta cada uno de los números del arreglo y guarde los números invertidos en otro arreglo. Imprima ambos arreglos.
package arreglos;
import java.util.Random;
import recomendaciones.Impresion;
import recomendaciones.Procesamiento;

public class Ejercicio5 {
    public static void ejecutar() {
        int[] originales = new int[20];
        int[] invertidos = new int[20];
        Random random = new Random();

        // 1. Generar 20 enteros aleatorios (ej. entre 10 y 999) e invertirlos
        for (int i = 0; i < originales.length; i++) {
            // Genera números entre 10 y 999 para ver el efecto visualmente
            originales[i] = random.nextInt(990) + 10; 
            invertidos[i] = Procesamiento.invertirNumero(originales[i]);
        }

        // 2. Imprimir ambos arreglos
        Impresion.imprimirArreglo("Arreglo Original ", originales);
        Impresion.imprimirArreglo("Arreglo con Números Invertidos", invertidos);
    }

}
