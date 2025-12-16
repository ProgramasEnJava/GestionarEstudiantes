import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Estudiante> estudiantes = new ArrayList<>(
                List.of(
                        new Estudiante("Juan", 10, 5),
                        new Estudiante("Ana", 11, 3),
                        new Estudiante("Luis", 12, 7),
                        new Estudiante("María", 10, 9),
                        new Estudiante("Pedro", 11, 6.5)
                )
        );

        for (Estudiante e : estudiantes) {
            System.out.println(
                    e.getNombre() + " - Calificación: " + e.getCalificacion() +
                            " - Aprobó: " + (e.aprobo() ? "Sí" : "No")
            );
        }
    }
}
