public class MainCosmetica {
    public static void main(String[] args) {
        Producto crema = new Producto("Crema hidratante", 3500);
        Producto shampoo = new Producto("Shampoo natural", 2200);

        Lider lider1 = new Lider("Silvia Gomez", "27-12345678-9");
        lider1.fechaPromocion = "01/03/2020";

        Vendedor vend1 = new Vendedor("Pedro Alvarez", "20-98765432-1");
        Vendedor vend2 = new Vendedor("Lucia Torres", "27-11223344-5");

        lider1.agregarVendedor(vend1);
        lider1.agregarVendedor(vend2);

        Cliente clienteA = new Cliente("Rosa Fernandez", "Calle Falsa 123", "1122334455");
        vend1.agregarCliente(clienteA);

        Reunion reunionJulio = new Reunion("01/07/2026", "01/08/2026", 10); // 10% de comision, desde el 01/07

        // esta venta es de ANTES de la ultima reunion, no tiene que contar para la comision
        Ticket viejo = new Ticket("15/06/2026", crema, vend1);
        vend1.agregarTicket(viejo);

        // el vendedor compra el producto a la empresa (todavia sin cliente)
        Ticket t1 = new Ticket("05/07/2026", crema, vend1);
        vend1.agregarTicket(t1);

        // despues se vende al cliente final y se completa el ticket
        t1.completarVenta(clienteA);

        Ticket t2 = new Ticket("06/07/2026", shampoo, vend2);
        vend2.agregarTicket(t2);

        Ticket t3 = new Ticket("07/07/2026", crema, lider1);
        lider1.agregarTicket(t3);

        System.out.println("=== Cosmetica Natural ===");
        System.out.println("Comision de " + vend1.nombre + " (deberia ser solo por t1, no por la venta vieja): $" + vend1.calcularComision(reunionJulio));
        System.out.println("Comision de " + vend2.nombre + ": $" + vend2.calcularComision(reunionJulio));
        // el lider cobra lo propio + lo de su equipo (vend1 y vend2), todo desde la ultima reunion
        System.out.println("Comision de " + lider1.nombre + " (lider): $" + lider1.calcularComision(reunionJulio));

        System.out.println("\nTicket 1 -> producto: " + t1.producto.nombre + " a $" + t1.precio + ", cliente: " + (t1.cliente != null ? t1.cliente.nombre : "sin asignar"));
        System.out.println("Ticket 2 -> producto: " + t2.producto.nombre + " a $" + t2.precio + ", cliente: " + (t2.cliente != null ? t2.cliente.nombre : "sin asignar"));

        // pruebo que no se puede completar con un cliente de otro representante
        Ticket t4 = new Ticket("08/07/2026", shampoo, vend2);
        t4.completarVenta(clienteA); // clienteA es de vend1, no de vend2 -> tiene que dar error
    }
}
