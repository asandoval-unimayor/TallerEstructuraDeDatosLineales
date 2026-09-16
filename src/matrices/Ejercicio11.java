package matrices;
import java.util.Random;
import java.util.Scanner;
import recomendaciones.Impresion;

public class Ejercicio11 {

    public static void ejecutar(Scanner scanner) {
        Random random = new Random();

        // Lectura de dimensiones m x n
        System.out.print("Ingrese el número de filas (m): ");
        int m = scanner.nextInt();
        System.out.print("Ingrese el número de columnas (n): ");
        int n = scanner.nextInt();

        int[][] matriz = new int[m][n];

        //  Rellenar matriz con números aleatorios
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(100); 
            }
        }

        // Imprimir matriz 
        Impresion.imprimirMatriz(matriz);

        // Leer número a buscar
        System.out.print("Ingrese el número entero a buscar en la matriz: ");
        int buscado = scanner.nextInt();

        // Búsqueda 
        boolean encontrado = false;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] == buscado) {
                    System.out.printf("\n Número %d encontrado%n", buscado);
                    System.out.printf("Primera ocurrencia en la posición -> Fila: %d, Columna: %d (índices 0..n)%n", i+1, j+1);
                    encontrado = true;
                    break; 
                }
            }
            if (encontrado) {
                break; 
            }
        }

        if (!encontrado) {
            System.out.printf("\n El número %d NO se encuentra en la matriz.%n", buscado);
        }
    }
}