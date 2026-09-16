package arreglos;
import java.util.Random;
import java.util.Scanner;
import recomendaciones.Impresion;
import recomendaciones.Procesamiento;

public class Ejercicio3 {

    public static void ejecutar(Scanner scanner) {
        System.out.print("Ingrese la cantidad de números a generar: ");
        int n = scanner.nextInt();

        int[] originales = new int[n];
        long[] factoriales = new long[n];
        Random random = new Random();

        // Llenado y cálculo del factorial
        for (int i = 0; i < n; i++) {
            // Rango de 0 a 12 para prevenir desbordamientos numéricos
            originales[i] = random.nextInt(13); 
            factoriales[i] = Procesamiento.calcularFactorial(originales[i]);
        }

        // Impresión de resultados
        Impresion.imprimirArreglo("Números Aleatorios Iniciales", originales);
        Impresion.imprimirArreglo("Factoriales Resultantes", factoriales);
    }

}
