package modelo;

import java.util.Scanner;

public class Principal {

    public void muestraElMenu(){
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        while(opcion != 9) {
            String menu = """
                    Bienvenid@ a ScreenMatch
                    1) Registrar nueva película
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese nombre de película");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingrese el año de lanzamiento de la película");
                    int fechaDeLanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingresa la duración en minutos de la película");
                    int duracionEnMinutos = teclado.nextInt();
                    teclado.nextLine();
                    Pelicula peliculaUsuario = new Pelicula();
                    peliculaUsuario.setNombre(nombre);
                    peliculaUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
                    peliculaUsuario.muestraFichaTecnica();
            }
        }
    }
}
