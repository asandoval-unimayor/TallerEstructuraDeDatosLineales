//Escribe un programa que lea números enteros aleatorios entre -10 y 10 y los guarde en un ArrayList hasta que se lea el número 10 y muestra los números leídos, su suma y su media. 
package arraylist;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import recomendaciones.Impresion;

public class Ejercicio6 {

    public static void ejecutar() {
        List<Integer> numeros = new ArrayList<>();
        Random random = new Random();
        int suma = 0;
        int numero;

        // Genera y agrega números entre -10 y 10 hasta que salga el 10
        do {
            numero = random.nextInt(-10, 11);
            numeros.add(numero);
            suma += numero;
        } while (numero != 10);

        // Cálculo de la media 
        double media = (double) suma / numeros.size();

        // Muestra de resultados
        Impresion.imprimirArrayList("Números Leídos en el ArrayList", numeros);
        System.out.println("Cantidad de elementos leídos: " + numeros.size());
        System.out.println("Suma total: " + suma);
        System.out.printf("Media: %.3f\n\n", media);
    }
}
