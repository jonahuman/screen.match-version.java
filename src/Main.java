import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pelicula matrix = new Pelicula();
        matrix.nombre = "Matrix";
        matrix.tiempoDeDuracionEnMinutos = 125;
        matrix.fechaDeLanzamiento = 1999;

        System.out.println(matrix.nombre);
        System.out.println(matrix.tiempoDeDuracionEnMinutos);
        System.out.println(matrix.fechaDeLanzamiento);

        Pelicula encanto =  new Pelicula();
        encanto.nombre = "Encanto";
        encanto.tiempoDeDuracionEnMinutos = 120;
        encanto.fechaDeLanzamiento = 2022;
        encanto.muestraFichaTecnica();
    }
}

// @author: Jonathan David Ahumada Novoa
// Fecha: 3 de Mayo, 2024
// alías: Flerr
// nacionalidad: Chilena