public class Reunion {
    String fechaUltima;
    String fechaProxima;
    double porcentajeComision; // porcentaje fijo para toda la fuerza de ventas

    public Reunion(String fechaUltima, String fechaProxima, double porcentajeComision) {
        this.fechaUltima = fechaUltima;
        this.fechaProxima = fechaProxima;
        this.porcentajeComision = porcentajeComision;
    }
}
