import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("¡Bienvenidos a la inmersión en Java!");
        // System.out.println("Película Matrix");
        // Declaración de variables.
        int fechaDeLanzamiento;
        fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico;
        incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                El programador informático Thomas Anderson, 
                más conocido en el mundo de los "hacker" como Neo, 
                está en el punto de mira del temible agente Smith. 
                Otros dos piratas informáticos, Trinity y Morfeo, se ponen en contacto con Neo para ayudarlo a escapar. 
                Matrix te posee. Sigue al conejo blanco.
                """;
        double mediaEvaluacionUsuario = 0;
        System.out.println("Película: " + nombre);
        System.out.println("Fecha: " + fechaDeLanzamiento);
        System.out.println("Puntaje: " + evaluacion);
        System.out.println("Plan: " + incluidoEnElPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("Media de la Evaluación de Matrix: " + mediaEvaluacion);

        if (fechaDeLanzamiento >= 2023) {
            System.out.println("Película popular en el momento");
        } else {
            System.out.println("Película retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darías a Matrix: ");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix; // En consola, para los décimales intente usar coma (,)
                                                                          // En lugar de (.) si le da error y viceversa.
        }
        System.out.println("La media de la película " +
                "Matrix calculada por el usuario es: " + mediaEvaluacionUsuario / 3);
    }
}