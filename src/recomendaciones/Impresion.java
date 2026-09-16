package recomendaciones;
import java.util.Arrays;
import java.util.List;

public class Impresion {


    public static void imprimirArreglo(String titulo, int[] arreglo) {
      
        System.out.println("=== " + titulo + " ===");
        System.out.println(Arrays.toString(arreglo));
        System.out.println();
    }

    public static void imprimirArreglo(String titulo, long[] arreglo) {
    System.out.println("=== " + titulo + " ===");
    System.out.println(Arrays.toString(arreglo));
    System.out.println();
    }

    public static void imprimirArrayList(String titulo, List<Integer> lista) {
    System.out.println("=== " + titulo + " ===");
    System.out.println(lista);
    System.out.println();
    }

    public static void imprimirMatriz(int[][] matriz) {
        System.out.println("\n--- MATRIZ GENERADA ---");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("[%4d] ", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println("-----------------------");
    }


    //Del ejericio 2, imprime los números en una sola linea  

    public static void imprimirEnUnaLinea(String titulo, int[] arreglo) {
        System.out.println("=== " + titulo + " ===");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
    }

     //Del ejericio 2, imprime los números en 10 lineas  
    public static void imprimirEnLineas(String titulo, int[] arreglo, int totalLineas) {
    System.out.println("=== " + titulo + " ===");
    int elementosPorLinea = arreglo.length / totalLineas;
    int numeroLinea = 1;

    System.out.print("Línea " + numeroLinea + ": ");

    for (int i = 0; i < arreglo.length; i++) {
        System.out.print(arreglo[i]);

        // Si alcanzamos el final de una línea
        if ((i + 1) % elementosPorLinea == 0) {
            System.out.println(); // Salto de línea
            numeroLinea++;
            if (i + 1 < arreglo.length) {
                System.out.print("Línea " + numeroLinea + ": ");
            }
        } else {
            System.out.print(", ");
        }
    }
    System.out.println();
}

}
