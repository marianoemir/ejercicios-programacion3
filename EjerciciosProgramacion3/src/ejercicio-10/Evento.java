import java.util.ArrayList;

public class Evento {
    String nombre;
    String fecha;
    int duracion; // en dias o en horas, uso un numero nomas
    int nroParticipantes;
    ArrayList<Comisario> comisarios = new ArrayList<>();
    ArrayList<Material> materiales = new ArrayList<>();

    public Evento(String nombre, String fecha, int duracion, int nroParticipantes) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.duracion = duracion;
        this.nroParticipantes = nroParticipantes;
    }

    public void agregarComisario(Comisario c) {
        comisarios.add(c);
        c.agregarEvento(this); // lo agrego de los 2 lados
    }

    public void agregarMaterial(Material m) {
        materiales.add(m);
    }

    // otro derivado: no se guarda, se cuenta
    public int getNroComisarios() {
        return comisarios.size();
    }
}
