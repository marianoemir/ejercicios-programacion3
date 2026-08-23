import java.util.ArrayList;

public class Exposicion {
    String nombre;
    String fechaInicio;
    String fechaFin;
    ArrayList<ObjetoArte> objetos = new ArrayList<>();

    public Exposicion(String nombre, String fechaInicio, String fechaFin) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public void agregarObjeto(ObjetoArte o) {
        objetos.add(o);
    }
}
