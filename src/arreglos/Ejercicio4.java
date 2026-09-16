/*Lea 25 números enteros aleatorios entre -50 y 50, almacénese en un arreglo y encuentre:
El número menor del arreglo.
El número mayor del arreglo.
*/
package arreglos;
import java.util.Random;
import recomendaciones.Impresion;

public class Ejercicio4 {

public static void ejecutar() {
        int[] numeros = new int[25];
        Random random = new Random();

        // 1. Llenado con aleatorios entre -50 y 50
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(-50,51);
        }

        // 2. Inicializar varibles
        int menor = numeros[0];
        int mayor = numeros[0];

        // 3. Buscar el menor y mayor recorriendo el arreglo
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        // 4. Mostrar resultados
        Impresion.imprimirArreglo("25 Números Aleatorios (-50 a 50)", numeros);
        System.out.println("Número menor encontrado: " + menor);
        System.out.println("Número mayor encontrado: " + mayor);
        System.out.println();
    }

}
