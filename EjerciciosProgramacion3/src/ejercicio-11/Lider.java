import java.util.ArrayList;

public class Lider extends Representante {
    String fechaPromocion; // solo el lider tiene esta fecha
    ArrayList<Vendedor> equipo = new ArrayList<>();

    public Lider(String nombre, String cuit) {
        super(nombre, cuit);
    }

    public void agregarVendedor(Vendedor v) {
        equipo.add(v);
    }

    // el lider cobra lo mismo que un vendedor, PERO ADEMAS cobra por su equipo
    // los dos montos se calculan desde la fecha de la ultima reunion
    @Override
    public double calcularComision(Reunion reunion) {
        double comisionPropia = totalVentasPropiasDesde(reunion.fechaUltima) * (reunion.porcentajeComision / 100.0);
        double comisionEquipo = 0;
        for (Vendedor v : equipo) {
            comisionEquipo += v.totalVentasPropiasDesde(reunion.fechaUltima) * (reunion.porcentajeComision / 100.0);
        }
        return comisionPropia + comisionEquipo;
    }
}
