package arraylist;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListObjetos {

    private static final String NOMBREFICHERO = "partidos.txt";

    public static List<Partido> ejecutarInformacionPartidos() {

        List<Partido> partidos = new ArrayList<>();

        File fichero = new File(NOMBREFICHERO);
        Scanner s = null;

        try {
            System.out.println("...Leemos el contenido del fichero");
            s = new Scanner(fichero);

            while (s.hasNext()) {

                String linea = s.nextLine();
                String[] cortarString = linea.split("::");
                Partido partido = new Partido();

                partido.setEquipoLocal(cortarString[0]);
                partido.setEquipoVisitante(cortarString[1]);
                partido.setGolesLocal(Integer.parseInt(cortarString[2]));
                partido.setGolesVisitante(Integer.parseInt(cortarString[3]));

                partidos.add(partido);

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        return partidos;

    }

}
