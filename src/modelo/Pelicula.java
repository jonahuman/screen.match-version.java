package modelo;

public class Pelicula {
    private String nombre;
    private int fechaDeLanzamiento;
    private double evaluacion;
    private boolean incluidoEnPLanBasico = true;
    private String sinopsis;
    private int tiempoDeDuracionEnMinutos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) { //Queda como nombre y no se pondrá una letra, para evitar CONFUSIÓN
        this.nombre = nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public boolean isIncluidoEnPLanBasico() {
        return incluidoEnPLanBasico;
    }

    public void setIncluidoEnPLanBasico(boolean incluidoEnPLanBasico) {
        this.incluidoEnPLanBasico = incluidoEnPLanBasico;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getTiempoDeDuracionEnMinutos() {
        return tiempoDeDuracionEnMinutos;
    }

    public void setTiempoDeDuracionEnMinutos(int tiempoDeDuracionEnMinutos) {
        this.tiempoDeDuracionEnMinutos = tiempoDeDuracionEnMinutos;
    }

    public double getEvaluacion() {
        return evaluacion;
    }



    public void muestraFichaTecnica() {
        // Creando mi ficha técnica con concatenación.
        System.out.println("-.-.-.-.-.-FICHA TÉCNICA-.-.-.-.-.-.-");
        System.out.println("Nombre de la película: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Tiempo de duración: " + tiempoDeDuracionEnMinutos + " minutos");

     }
}
