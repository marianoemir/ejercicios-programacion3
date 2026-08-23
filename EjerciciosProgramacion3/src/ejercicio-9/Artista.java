public class Artista {
    String nombre;
    String fechaNacimiento;
    String fechaDefuncion;
    String paisOrigen;
    String epoca;
    String estiloPrincipal;
    String descripcion;

    public Artista(String nombre, String fechaNacimiento, String fechaDefuncion, String paisOrigen,
                   String epoca, String estiloPrincipal, String descripcion) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaDefuncion = fechaDefuncion;
        this.paisOrigen = paisOrigen;
        this.epoca = epoca;
        this.estiloPrincipal = estiloPrincipal;
        this.descripcion = descripcion;
    }

    public String toString() {
        return nombre + " (" + paisOrigen + ")";
    }
}
