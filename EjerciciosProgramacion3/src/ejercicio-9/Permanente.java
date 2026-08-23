public class Permanente implements PertenenciaDetalle {
    String fechaAdquisicion;
    double costo;
    boolean enExposicion;

    public Permanente(String fechaAdquisicion, double costo, boolean enExposicion) {
        this.fechaAdquisicion = fechaAdquisicion;
        this.costo = costo;
        this.enExposicion = enExposicion;
    }

    public String getInfo() {
        return "Coleccion permanente desde " + fechaAdquisicion + " (costo $" + costo + ") " + (enExposicion ? "en exposicion" : "en almacen");
    }
}
