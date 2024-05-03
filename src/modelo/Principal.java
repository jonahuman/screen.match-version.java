package modelo;

import java.util.Scanner;

public class Principal {

    private Scanner teclado = new Scanner(System.in);

    public void muestraElMenu() {
        int opcion = 0;
        while (opcion != 9) {
            System.out.println("""
                    Bienvenid@ a ScreenMatch
                    1) Registrar nueva película
                    2) Registrar una nueva serie
                    3) Calculadora de tiempo de maratón
                    9) Salir
                    """);
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion) {
                case 1:
                    registrarTitulo(new Pelicula());
                    break;
                case 2:
                    registrarTitulo(new Serie());
                    break;
                case 3:
                    calculadoraDeMaraton();
                    break;
                case 9:
                    System.out.println("Saliendo del Programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }

    private void registrarTitulo(Titulo titulo) {
        System.out.println("Ingrese nombre del título:");
        titulo.setNombre(teclado.nextLine());
        System.out.println("Ingrese el año de lanzamiento:");
        titulo.setFechaDeLanzamiento(teclado.nextInt());
        teclado.nextLine();
        if (titulo instanceof Pelicula) {
            System.out.println("Ingresa la duración en minutos de la película:");
            ((Pelicula) titulo).setTiempoDeDuracionEnMinutos(teclado.nextInt());
            teclado.nextLine();
        } else if (titulo instanceof Serie) {
            System.out.println("Ingresa el número de temporadas:");
            ((Serie) titulo).setTemporadas(teclado.nextInt());
            System.out.println("Ingresa el número de episodios por temporada:");
            ((Serie) titulo).setEpisodiosPorTemporada(teclado.nextInt());
            System.out.println("Ingresa la duración en minutos por episodio:");
            ((Serie) titulo).setDuracionEnMinutosPorEpisodio(teclado.nextInt());
            teclado.nextLine();
            System.out.println("Ingresa la calificación de la serie (0 a 5), por ejemplo, 4.2:");
            ((Serie) titulo).setCalificacion(teclado.nextDouble());
            teclado.nextLine();
        }
        titulo.muestraFichaTecnica();
    }

    private void calculadoraDeMaraton() {
        System.out.println("Calculadora de tiempo de maratón");
        System.out.println("Ingresa el número total de minutos de series y películas:");
        int totalMinutos = teclado.nextInt();
        int dias = totalMinutos / (24 * 60);
        int horas = (totalMinutos % (24 * 60)) / 60;
        System.out.printf("Necesitarás %d días y %d horas para completar el maratón.%n", dias, horas);
    }
}
