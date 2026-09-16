package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import recomendaciones.Impresion;

public class Ejercicio7 {

    public static void ejecutar(Scanner scanner) {
        List<Integer> pares = new ArrayList<>();

        // 1. Inicializar con los 20 primeros números pares ascendentemente
        for (int i = 1; i <= 20; i++) {
            pares.add(i * 2);
        }

        // Imprimir el ArrayList original
        Impresion.imprimirArrayList("20 Primeros Números Pares", pares);

        // 2. Leer un número e insertarlo en la posición correcta
        System.out.print("Ingrese un número cualquiera para insertarlo en orden: ");
        int numeroInsertar = scanner.nextInt();
        int indiceInsercion = 0;

        // Buscar la posición donde el número actual de la lista sea mayor que el ingresado
        while (indiceInsercion < pares.size() && pares.get(indiceInsercion) < numeroInsertar) {
            indiceInsercion++;
        }
        // Insertar en la posición calculada
        pares.add(indiceInsercion, numeroInsertar);

        // Imprimir para verificar 
        Impresion.imprimirArrayList("ArrayList después de la Inserción", pares);

        // 3. Borrar un valor solicitado al usuario
        System.out.print("Ingrese el valor exacto que desea borrar del ArrayList: ");
        int valorBorrar = scanner.nextInt();
        boolean eliminado = pares.remove(Integer.valueOf(valorBorrar));

        if (eliminado) {
            System.out.println("El valor " + valorBorrar + " fue retirado exitosamente.\n");
        } else {
            System.out.println("El valor " + valorBorrar + " no se encontró en la lista.\n");
        }

        // Imprimir para verificar la eliminación
        Impresion.imprimirArrayList("ArrayList Final", pares);
    }

}
