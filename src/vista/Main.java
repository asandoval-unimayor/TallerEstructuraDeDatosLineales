package vista;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean menu = true;

        while (menu) {

            System.out.println("MENU PRINCIPAL - Seleccione una opcion");
            System.out.println("1. Array \n2. ArrayLisy \n3. Matriz \n4. Salir");

            int respuesta = scanner.nextInt();
            System.out.println("\n \n \n");

            switch (respuesta) {
                case 1:
                    MenuArray.mostrarMenuArray(scanner);
                    break;
                case 2:
                    MenuArrayList.mostrarMenuArrayList(scanner);
                    break;

                case 3:
                    MenuMatriz.mostrarMenuMatriz(scanner);
                    break;

                case 4:
                    
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                    break;
            }

        }

        scanner.close();

    }

}
