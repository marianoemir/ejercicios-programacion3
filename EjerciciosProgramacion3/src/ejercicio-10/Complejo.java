import java.util.ArrayList;

// clase abstracta, es padre de Monodeportivo y Polideportivo
// implementa Deportivo pero deja tipoInfo() sin implementar (lo hace cada hijo)
public abstract class Complejo implements Deportivo {
    String localizacion;
    String jefeOrganizacion;
    double areaOcupada; // en m2 (o la unidad que se use), es del complejo en si
    ArrayList<Area> areas = new ArrayList<>(); // areas designadas para cada deporte dentro del complejo
    ArrayList<Evento> eventos = new ArrayList<>();

    public Complejo(String localizacion, String jefeOrganizacion, double areaOcupada) {
        this.localizacion = localizacion;
        this.jefeOrganizacion = jefeOrganizacion;
        this.areaOcupada = areaOcupada;
    }

    public void agregarArea(Area a) {
        areas.add(a);
    }

    public void celebrarEvento(Evento e) {
        eventos.add(e);
    }
}
