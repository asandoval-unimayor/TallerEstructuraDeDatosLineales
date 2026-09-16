package vista;

import java.util.Scanner;

import arreglos.Ejercicio1;
import arreglos.Ejercicio2;
import arreglos.Ejercicio3;
import arreglos.Ejercicio4;
import arreglos.Ejercicio5;

public class MenuArray {

    public static void mostrarMenuArray(Scanner scanner){

       System.out.println("--- MENÚ ARRAYS ---");
        System.out.println("- Ejercicio 1" + 
        "\n- Ejercicio 2" + 
        "\n- Ejercicio 3" + 
        "\n- Ejercicio 4" +
        "\n- Ejercicio 5");

        int opcionSeleccionada = scanner.nextInt();

        switch (opcionSeleccionada) {
            case 1:

            Ejercicio1.ejecutar();
                
                break;
                            case 2:
                Ejercicio2.ejecutar();
                break;
                            case 3:
                Ejercicio3.ejecutar(scanner);
                break;
                            case 4:
                Ejercicio4.ejecutar();
                break;
                            case 5:
                Ejercicio5.ejecutar();
                break;
        
            default:
                break;
        }


    }

}
