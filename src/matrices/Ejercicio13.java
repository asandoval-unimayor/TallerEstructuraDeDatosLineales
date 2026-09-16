package matrices;
import java.util.Random;
import java.util.Scanner;
import recomendaciones.Impresion;
import recomendaciones.Procesamiento;

public class Ejercicio13 {

    public static void ejecutar(Scanner scanner) {
        Random random = new Random();

        // Lectura del tamaño n
        System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("El tamaño de la matriz debe ser mayor a 0.");
            return;
        }

        int[][] matriz = new int[n][n];

        // Rellenar con aleatorios 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(21);
            }
        }

        // Imprimir la matriz
        Impresion.imprimirMatriz(matriz);

        // Evaluar si es simétrica 
        boolean esSimetrica = Procesamiento.esSimetrica(matriz);
        System.out.println("\n¿La matriz es simétrica?: " + (esSimetrica ? "SÍ" : "NO"));

        // Imprimir las cuatro esquinas
        System.out.println("\n--- ESQUINAS DE LA MATRIZ ---");
        System.out.println("Esquina Superior Izquierda [0][0]: " + matriz[0][0]);
        System.out.println("Esquina Superior Derecha   [0][" + (n - 1) + "]: " + matriz[0][n - 1]);
        System.out.println("Esquina Inferior Izquierda [" + (n - 1) + "][0]: " + matriz[n - 1][0]);
        System.out.println("Esquina Inferior Derecha   [" + (n - 1) + "][" + (n - 1) + "]: " + matriz[n - 1][n - 1]);
    }
}