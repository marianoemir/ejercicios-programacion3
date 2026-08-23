import java.util.ArrayList;

// clase abstracta, padre de Vendedor y Lider
// implementa Comisionable pero deja calcularComision() sin implementar (lo hace cada hijo)
public abstract class Representante implements Comisionable {
    String nombre;
    String direccion;
    String telefono;
    String fechaNacimiento;
    String cuit;
    String fechaIncorporacion;
    ArrayList<Cliente> cartera = new ArrayList<>();
    ArrayList<Ticket> tickets = new ArrayList<>(); // los productos que compro a la empresa

    public Representante(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    public void agregarCliente(Cliente c) {
        cartera.add(c);
    }

    public void agregarTicket(Ticket t) {
        tickets.add(t);
    }

    // suma el total de ventas registradas desde una fecha (la de la ultima reunion)
    // ya no cuenta TODOS los tickets, solo los posteriores a esa fecha
    public double totalVentasPropiasDesde(String fechaDesde) {
        double total = 0;
        for (Ticket t : tickets) {
            if (Fechas.esPosteriorOIgual(t.fecha, fechaDesde)) {
                total += t.precio;
            }
        }
        return total;
    }
}
