import modelo.Pelicula;

public class Main {
    public static void main(String[] args) {
        Pelicula matrix = new Pelicula();
        matrix.setNombre("Matrix");
        matrix.setTiempoDeDuracionEnMinutos(120);
        matrix.setFechaDeLanzamiento(1999);

        matrix.muestraFichaTecnica();

    }
}

// @author: Jonathan David Ahumada Novoa
// Fecha: 3 de Mayo, 2024
// alías: Flerr
// nacionalidad: Chilena