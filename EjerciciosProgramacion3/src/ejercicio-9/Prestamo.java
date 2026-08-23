public class Prestamo implements PertenenciaDetalle {
    Coleccion coleccion; // de que coleccion externa proviene el objeto prestado
    String fechaPrestamo;
    String fechaDevolucion;

    public Prestamo(Coleccion coleccion, String fechaPrestamo, String fechaDevolucion) {
        this.coleccion = coleccion;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getInfo() {
        return "En prestamo de " + coleccion.nombre + " (" + fechaPrestamo + " a " + fechaDevolucion + ")";
    }
}
