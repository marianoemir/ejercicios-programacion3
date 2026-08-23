import java.util.ArrayList;

public class Museo {
    String nombre;
    ArrayList<ObjetoArte> coleccion = new ArrayList<>();
    ArrayList<Exposicion> exposiciones = new ArrayList<>();

    public Museo(String nombre) {
        this.nombre = nombre;
    }

    public void agregarObjeto(ObjetoArte o) {
        coleccion.add(o);
    }

    public void agregarExposicion(Exposicion e) {
        exposiciones.add(e);
    }

    // devuelve los objetos que estan en prestamo
    public ArrayList<ObjetoArte> getObjetosEnPrestamo() {
        ArrayList<ObjetoArte> resultado = new ArrayList<>();
        for (ObjetoArte o : coleccion) {
            if (o.esPrestamo()) {
                resultado.add(o);
            }
        }
        return resultado;
    }

    // cuenta cuantas pinturas hay en la coleccion
    public int contarPinturas() {
        int contador = 0;
        for (ObjetoArte o : coleccion) {
            if (o.esPintura()) {
                contador++;
            }
        }
        return contador;
    }
}
