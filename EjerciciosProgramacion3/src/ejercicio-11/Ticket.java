// el ticket relaciona 3 cosas: el representante que compra, el producto y (despues) el cliente
public class Ticket {
    String fecha;
    Producto producto;
    double precio; // se guarda el precio del producto AL MOMENTO de la venta (por si el precio cambia despues)
    Representante representante;
    Cliente cliente; // puede ser null! recien se completa cuando se hace la venta final

    public Ticket(String fecha, Producto producto, Representante representante) {
        this.fecha = fecha;
        this.producto = producto;
        this.precio = producto.precio; // se fija el precio en este momento
        this.representante = representante;
        this.cliente = null; // al principio no tiene cliente todavia
    }

    // esto se llama cuando el representante vende el producto a un cliente final
    public void completarVenta(Cliente c) {
        if (!representante.cartera.contains(c)) {
            System.out.println("ERROR: el cliente no pertenece a la cartera de este representante");
            return;
        }
        this.cliente = c;
    }
}
