package matrices;

import java.util.Random;
import java.util.Scanner;
import recomendaciones.Impresion;
import recomendaciones.Procesamiento;

public class Ejercicio12 {

    public static void ejecutar(Scanner scanner) {
        Random random = new Random();

        // Lectura del tamaño n
        System.out.print("Ingrese el tamaño de la matriz cuadrada (n): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("El tamaño de la matriz debe ser mayor a 0.");
            return;
        }

        int[][] matriz = new int[n][n];

        // Rellenar con aleatorios entre -50 y 50
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(-50, 51);
            }
        }

        // Imprimir la matriz
        Impresion.imprimirMatriz(matriz);

        // Calcular la sumatoria de la diagonal opuesta a la principal
        int sumaDiagonal = Procesamiento.sumarDiagonalOpuesta(matriz);

        // Mostrar resultado
        System.out.println("Sumatoria de los elementos de la diagonal opuesta: " + sumaDiagonal);
    }
}