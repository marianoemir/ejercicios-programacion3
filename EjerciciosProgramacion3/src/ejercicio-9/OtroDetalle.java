// para los objetos que no son ni pintura ni escultura
public class OtroDetalle implements TipoDetalle {
    String descripcionTipo;

    public OtroDetalle(String descripcionTipo) {
        this.descripcionTipo = descripcionTipo;
    }

    public String getInfo() {
        return "Otro: " + descripcionTipo;
    }
}
