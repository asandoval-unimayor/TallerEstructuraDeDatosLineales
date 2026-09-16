package arraylist;

import java.util.Iterator;
import java.util.List;

public class Ejercicio10 {

    public static void ejecutar() {
       
        List<Partido> partidos = ArrayListObjetos.ejecutarInformacionPartidos();

        
        // 1. Mostrar partidos donde ganó el visitante (Tabla + Resumen)
        
        System.out.println("\n==================================================================");
        System.out.println("            PARTIDOS GANADOS POR EQUIPO VISITANTE                 ");
        System.out.println("==================================================================");
        System.out.printf("%-22s | %-5s | %-5s | %-22s%n", "Equipo Local", "GL", "GV", "Equipo Visitante");
        System.out.println("------------------------------------------------------------------");

        int victoriasVisitantes = 0;
        for (Partido p : partidos) {
            if (p.getGolesVisitante() > p.getGolesLocal()) {
                System.out.printf("%-22s | %-5d | %-5d | %-22s%n", 
                        p.getEquipoLocal(), p.getGolesLocal(), p.getGolesVisitante(), p.getEquipoVisitante());
                victoriasVisitantes++;
            }
        }
        System.out.println("------------------------------------------------------------------");
        System.out.println("TOTAL DE PARTIDOS GANADOS POR VISITANTES: " + victoriasVisitantes);

        //  victorias del Barcelona
        
        int victoriasBarcelona = 0;
        for (Partido p : partidos) {
            boolean ganoLocal = p.getEquipoLocal().equalsIgnoreCase("Barcelona")
                    && p.getGolesLocal() > p.getGolesVisitante();
            boolean ganoVisita = p.getEquipoVisitante().equalsIgnoreCase("Barcelona")
                    && p.getGolesVisitante() > p.getGolesLocal();
            if (ganoLocal || ganoVisita) {
                victoriasBarcelona++;
            }
        }
        System.out.println("\n=== Victorias del Barcelona ===");
        System.out.println("El Barcelona ganó un total de: " + victoriasBarcelona + " partidos.");


        // Victorias de los equipos locales
 
        int victoriasLocales = 0;
        for (Partido p : partidos) {
            if (p.getGolesLocal() > p.getGolesVisitante()) {
                victoriasLocales++;
            }
        }
        System.out.println("\n=== Victorias Locales ===");
        System.out.println("Total de partidos ganados por el equipo local: " + victoriasLocales + " partidos.");

        // Eliminar no empates e imprimir restantes
        
        Iterator<Partido> it = partidos.iterator();
        while (it.hasNext()) {
            Partido p = it.next();
            if (p.getGolesLocal() != p.getGolesVisitante()) {
                it.remove();
            }
        }

        System.out.println("\n==================================================================");
        System.out.println("        PARTIDOS RESTANTES EN LA LISTA (SOLO EMPATES)             ");
        System.out.println("==================================================================");
        System.out.printf("%-22s | %-5s | %-5s | %-22s%n", "Equipo Local", "GL", "GV", "Equipo Visitante");
        System.out.println("------------------------------------------------------------------");

        for (Partido p : partidos) {
            System.out.printf("%-22s | %-5d | %-5d | %-22s%n", 
                    p.getEquipoLocal(), p.getGolesLocal(), p.getGolesVisitante(), p.getEquipoVisitante());
        }
        System.out.println("------------------------------------------------------------------");
        System.out.println("TOTAL DE PARTIDOS RESTANTES EN LA LISTA: " + partidos.size());
    }
}