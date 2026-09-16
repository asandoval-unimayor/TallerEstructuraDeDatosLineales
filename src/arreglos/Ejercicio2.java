/*2.   Inicializar por programa un arreglo con los 100 primeros números pares e imprimirlo:
- En una sola línea.
- En 10 líneas indicando el número de línea
*/

package arreglos;
import recomendaciones.Impresion;

public class Ejercicio2 {

    public static void ejecutar() {
        int[] pares = new int[100];

        // primeros 100 pares
        for (int i = 0; i < pares.length; i++) {
            pares[i] = (i + 1) * 2;
        }

        // 1. Impresión en una sola línea
        Impresion.imprimirEnUnaLinea("100 Primeros Números Pares ", pares);

        // 2. Impresión en 10 líneas indicando el número de línea
        Impresion.imprimirEnLineas("100 Primeros Números Pares ", pares, 10);
    }
}
