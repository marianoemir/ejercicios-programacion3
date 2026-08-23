public class Vendedor extends Representante {

    public Vendedor(String nombre, String cuit) {
        super(nombre, cuit);
    }

    // el vendedor cobra el % solo sobre lo que el vendio desde la ultima reunion
    @Override
    public double calcularComision(Reunion reunion) {
        return totalVentasPropiasDesde(reunion.fechaUltima) * (reunion.porcentajeComision / 100.0);
    }
}
