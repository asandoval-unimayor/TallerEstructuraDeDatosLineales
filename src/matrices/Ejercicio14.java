package matrices;
import java.util.Scanner;
import recomendaciones.Impresion;
import recomendaciones.Procesamiento;

public class Ejercicio14 {

    public static void ejecutar(Scanner scanner) {
        // Inicializando matriz
        int[][] matrizOriginal = {
            { 1,  2,  3,  4},
            { 5,  6,  7,  8},
            { 9, 10, 11, 12}
        };

        System.out.println("\n=================================");
        System.out.println("        MATRIZ ORIGINAL          ");
        System.out.println("=================================");
        Impresion.imprimirMatriz(matrizOriginal);

        // Calcular la transpuesta 
        int[][] matrizTranspuesta = Procesamiento.transponerMatriz(matrizOriginal);

        System.out.println("\n=================================");
        System.out.println("       MATRIZ TRANSPUESTA        ");
        System.out.println("=================================");
        Impresion.imprimirMatriz(matrizTranspuesta);
    }
}