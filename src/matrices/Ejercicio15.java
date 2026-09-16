package matrices;
import java.util.Random;
import java.util.Scanner;
import recomendaciones.Impresion;
import recomendaciones.Procesamiento;

public class Ejercicio15 {

    public static void ejecutar(Scanner scanner) {
        Random random = new Random();

        // Lectura de dimensiones
        System.out.print("Ingrese el número de filas (m): ");
        int m = scanner.nextInt();
        System.out.print("Ingrese el número de columnas (n): ");
        int n = scanner.nextInt();

        // Validación de dimensiones mínimas para el intercambio
        if (m < 2) {
            System.out.println("Error: Se necesitan al menos 2 filas para intercambiar la primera con la segunda.");
            return;
        }

        int[][] matriz = new int[m][n];

        // Rellenar con números aleatorios
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(51);
            }
        }

        // Imprimir matriz original
        System.out.println("\n=================================");
        System.out.println("        MATRIZ ORIGINAL          ");
        System.out.println("=================================");
        Impresion.imprimirMatriz(matriz);

        // Intercambiar fila 0  con fila 1 
        Procesamiento.intercambiarFilas(matriz, 0, 1);

        // Imprimir matriz modificada
        System.out.println("\n=================================");
        System.out.println("  MATRIZ CON FILAS INTERCAMBIADAS ");
        System.out.println("=================================");
        Impresion.imprimirMatriz(matriz);
    }
}