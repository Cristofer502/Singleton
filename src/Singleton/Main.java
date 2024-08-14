package Singleton;

public class Main {
    public static void main(String[] args) {
        AppConfig config = AppConfig.getInstance();
        config.setNombreDePagina("papulandia.com");
        config.setAnioDeCreacion(2000);
        config.setUrlDelServidor("https://giphy.com/gifs/cat-gato-tRoH9EYLs3lok");
        config.setNumeroDePuerto(8080);

        System.out.println("nombre de la pagina: " + config.getNombreDePagina());
        System.out.println("año de creacion: " + config.getAnioDeCreacion());
        System.out.println("URL de la pagina: " + config.getUrlDelServidor());
        System.out.println("Numero del Puerto: " + config.getNumeroDePuerto());
    }
}