import java.util.ArrayList;

public class Sede {
    String nombre;
    double presupuesto;
    ArrayList<Complejo> complejos = new ArrayList<>();

    public Sede(String nombre, double presupuesto) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
    }

    public void agregarComplejo(Complejo c) {
        complejos.add(c);
    }

    // esto es un dato derivado, no hace falta guardarlo aparte, se cuenta
    public int getNroComplejos() {
        return complejos.size();
    }
}
