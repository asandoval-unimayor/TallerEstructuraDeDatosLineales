package recomendaciones;

public class Procesamiento {

    public static long calcularFactorial(int n) {
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int invertirNumero(int numero) {
        int invertido = 0;
        int signo = numero < 0 ? -1 : 1;
        int absNumero = Math.abs(numero);

        while (absNumero > 0) {
            int digito = absNumero % 10;
            invertido = (invertido * 10) + digito;
            absNumero /= 10;
        }

        return invertido * signo;
    }

    public static int sumarDiagonalOpuesta(int[][] matriz) {
        int suma = 0;
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            suma += matriz[i][n - 1 - i];
        }
        return suma;
    }

    public static boolean esSimetrica(int[][] matriz) {
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false; // Si un solo elemento difiere de su reflejo, no es simétrica
                }
            }
        }
        return true;
    }

    public static int[][] transponerMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] transpuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
        return transpuesta;
    }

    public static void intercambiarFilas(int[][] matriz, int fila1, int fila2) {
        if (matriz.length > fila1 && matriz.length > fila2) {
            int[] temp = matriz[fila1];
            matriz[fila1] = matriz[fila2];
            matriz[fila2] = temp;
        }
    }

}
