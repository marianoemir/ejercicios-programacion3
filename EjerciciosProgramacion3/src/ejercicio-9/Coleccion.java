// representa una coleccion externa (otro museo, coleccion privada, etc)
// con la que el museo intercambia obras en prestamo
public class Coleccion {
    String nombre; // es unico
    String tipo; // museo, coleccion privada, etc
    String descripcion;
    String direccion;
    String telefono;
    String contacto; // nombre de la persona de contacto

    public Coleccion(String nombre, String tipo, String descripcion, String direccion, String telefono, String contacto) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.telefono = telefono;
        this.contacto = contacto;
    }

    public String toString() {
        return nombre;
    }
}
