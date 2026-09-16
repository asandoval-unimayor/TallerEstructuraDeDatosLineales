package vista;
import java.util.Scanner;

import arraylist.Ejercicio10;
import arraylist.Ejercicio6;
import arraylist.Ejercicio7;
import arraylist.Ejercicio8;
import arraylist.Ejercicio9;

public class MenuArrayList {

    public static void mostrarMenuArrayList(Scanner scanner) {
        System.out.println("--- MENÚ ARRAYLIST ---");
        System.out.println("- Ejercicio 6" +
        "\n- Ejercicio 7" +
        "\n- Ejercicio 8" +
        "\n- Ejercicio 9" +
        "\n- Ejercicio 10");

        int opcionSeleccionada = scanner.nextInt();

        switch (opcionSeleccionada) {
            case 6:
                Ejercicio6.ejecutar();
                break;
            case 7:
                Ejercicio7.ejecutar(scanner);
                break;
            case 8:
                Ejercicio8.ejecutar();
                break;
            case 9:
                Ejercicio9.ejecutar();
                break;
            case 10:
                Ejercicio10.ejecutar();
                break;

            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
}