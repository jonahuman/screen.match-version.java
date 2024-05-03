import java.util.Scanner;

public class MainConWhile {
    public static void main(String[] args) {
        System.out.println("¡Bienvenidos a la inmersión en Java!");
        // System.out.println("Película Matrix");
        // Declaración de variables.
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";

        System.out.println("Película: " + nombre);
        System.out.println("Fecha: " + fechaDeLanzamiento);
        System.out.println("Puntaje: " + evaluacion);
        System.out.println("Plan: " + incluidoEnElPlanBasico);

        double mediaEvaluacionUsuario = 0;
        int i = 0;
        Scanner teclado = new Scanner(System.in);   // En consola, para los décimales intente usar coma (,)
        // En lugar de (.) si le da error y viceversa.

        while (i < 3) { // Se ha cambiado el ciclo for por un ciclo while en Java.
            System.out.println("Ingresa la nota que le darías a Matrix: ");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario += notaMatrix;
            i++;
        }

        System.out.println("La media de la película Matrix calculada por el usuario es: " + mediaEvaluacionUsuario / 3);
    }
}

// @author: Jonathan David Ahumada Novoa
// fecha: 2 de Mayo 2024
// alía: Flerr
// nacionalidad: Chilena