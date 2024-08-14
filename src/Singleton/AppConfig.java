package Singleton;

public class AppConfig {
    private static AppConfig instance;

    private AppConfig() {
    }

    public static synchronized AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    private String urlDelServidor; // Cambiado de serverUrl a urlDelServidor
    private int numeroDePuerto; // Cambiado de port a numeroDePuerto
    private String nombreDePagina; // Cambiado de PaginaName a nombreDePagina
    private int anioDeCreacion; // Cambiado de AnioDecreacion a anioDeCreacion

    public int getAnioDeCreacion() {
        return anioDeCreacion;
    }

    public void setAnioDeCreacion(int anioDeCreacion) {
        this.anioDeCreacion = anioDeCreacion;
    }

    public String getNombreDePagina() {
        return nombreDePagina;
    }

    public void setNombreDePagina(String nombreDePagina) {
        this.nombreDePagina = nombreDePagina;
    }

    public String getUrlDelServidor() {
        return urlDelServidor;
    }

    public void setUrlDelServidor(String urlDelServidor) {
        this.urlDelServidor = urlDelServidor;
    }

    public int getNumeroDePuerto() {
        return numeroDePuerto;
    }

    public void setNumeroDePuerto(int numeroDePuerto) {
        this.numeroDePuerto = numeroDePuerto;
    }
}

