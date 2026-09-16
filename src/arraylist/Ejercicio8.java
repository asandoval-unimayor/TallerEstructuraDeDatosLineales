package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ejercicio8 {
    public static void ejecutar() {

        List<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        //  Generar 100 números enteros aleatorios entre 1 y 20
        for (int i = 0; i < 100; i++) {
            numeros.add(random.nextInt(21));
        }

        // Recorrer la lista para determinar frecuencias
        // arreglo de tamaño 21 para que los índices vayan del 0 al 20 
        int[] frecuencias = new int[21]; 
        for (int num : numeros) {
            frecuencias[num]++;
        }

        //  Construir la tabla y buscar el más frecuente
        System.out.println("=== Tabla de Frecuencias ===");
        System.out.println("Número\t|\tFrecuencia");
        System.out.println("--------------------------");

        int numeroMasFrecuente = 0;
        int mayorFrecuencia = 0;

        for (int i = 1; i <= 20; i++) {
            // Solo se imprime si el número apareció al menos una vez
            if (frecuencias[i] > 0) {
                System.out.printf("%2d\t|\t%2d veces\n", i, frecuencias[i]);
            }
            
            // Lógica para identificar el mayor
            if (frecuencias[i] > mayorFrecuencia) {
                mayorFrecuencia = frecuencias[i];
                numeroMasFrecuente = i;
            }
        }
        
        System.out.println("--------------------------");
        
        // Mostrar el número más repetido
        System.out.println("\nEl número que se repite con mayor frecuencia es el " 
                           + numeroMasFrecuente + " aparece " + mayorFrecuencia + " veces.\n");
    }

}
