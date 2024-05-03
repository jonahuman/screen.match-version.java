public class Pelicula {
    String nombre;
    int fechaDeLanzamiento;
    double evaluacion;
    int tiempoDeDuracionEnMinutos;
    boolean incluidoEnPLanBasico = true;
    String sinopsis;

    void muestraFichaTecnica() {
        // Creando mi ficha técnica con concatenación.
        System.out.println("-.-.-.-.-.-FICHA TÉCNICA-.-.-.-.-.-.-");
        System.out.println("Nombre de la película: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Tiempo de duración: " + tiempoDeDuracionEnMinutos + " minutos");

     }
}
