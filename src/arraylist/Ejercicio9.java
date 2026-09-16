package arraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import recomendaciones.Impresion;

public class Ejercicio9 {
    public static void ejecutar() {
        List<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        // Generar 20 números aleatorios entre 1 y 100
        for (int i = 0; i < 20; i++) {
            numeros.add(random.nextInt(100) + 1);
        }

        Impresion.imprimirArrayList("1. Lista Original", numeros);

        // Separar en dos nuevas listas (Pares e Impares)
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (int num : numeros) {
            if (num % 2 == 0) {
                pares.add(num);
            } else {
                impares.add(num);
            }
        }

        // Ordenar de menor a mayor 
        List<Integer> ascendente = new ArrayList<>(numeros);
        Collections.sort(ascendente);
        Impresion.imprimirArrayList("2. Lista Ordenada de Menor a Mayor", ascendente);

        // Ordenar de mayor a menor 
        List<Integer> descendente = new ArrayList<>(numeros);
        Collections.sort(descendente, Collections.reverseOrder());
        Impresion.imprimirArrayList("3. Lista Ordenada de Mayor a Menor", descendente);

        // Imprimir listas filtradas
        Impresion.imprimirArrayList("4. Lista de Números Pares", pares);
        Impresion.imprimirArrayList("5. Lista de Números Impares", impares);
    }

}
