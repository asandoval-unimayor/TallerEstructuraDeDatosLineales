package vista;

import java.util.Scanner;
import matrices.Ejercicio11;
import matrices.Ejercicio12;
import matrices.Ejercicio13;
import matrices.Ejercicio14;
import matrices.Ejercicio15;

public class MenuMatriz {

    public static void mostrarMenuMatriz(Scanner scanner) {
        System.out.println("--- MENÚ MATRICES ---");
        System.out.println("- Ejercicio 11" +
                "\n- Ejercicio 12" +
                "\n- Ejercicio 13" +
                "\n- Ejercicio 14" +
                "\n- Ejercicio 15");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 11:
                Ejercicio11.ejecutar(scanner);
                break;
            case 12:
                Ejercicio12.ejecutar(scanner);
                break;
            case 13:
                Ejercicio13.ejecutar(scanner);
                break;
            case 14:
                Ejercicio14.ejecutar(scanner);
                break;
            case 15:
                Ejercicio15.ejecutar(scanner);
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
}