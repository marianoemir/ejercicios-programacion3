import java.util.ArrayList;

public class Comisario {
    String nombre;
    ArrayList<Evento> eventos = new ArrayList<>(); // en que eventos participa

    public Comisario(String nombre) {
        this.nombre = nombre;
    }

    public void agregarEvento(Evento e) {
        eventos.add(e);
    }
}
