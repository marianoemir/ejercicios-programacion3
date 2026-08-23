public class MainOlimpiadas {
    public static void main(String[] args) {
        Sede sede = new Sede("Paris 2028 (ejemplo)", 5000000);

        // areaOcupada es un numero del complejo (m2), distinto de las areas por deporte
        Monodeportivo estadio = new Monodeportivo("Zona Norte", "Juan Perez", 12000, "atletismo");
        Polideportivo polideportivo = new Polideportivo("Zona Sur", "Maria Lopez", 25000);
        polideportivo.agregarDeporte("basquet");
        polideportivo.agregarDeporte("voley");

        // areas designadas dentro de cada complejo, con su situacion
        estadio.agregarArea(new Area("atletismo", "centro"));
        estadio.agregarArea(new Area("salto en alto", "esquina N-E"));
        polideportivo.agregarArea(new Area("basquet", "ala este"));
        polideportivo.agregarArea(new Area("voley", "ala oeste"));

        sede.agregarComplejo(estadio);
        sede.agregarComplejo(polideportivo);

        Evento carrera100m = new Evento("100 metros llanos", "10/07/2028", 1, 40);
        Evento saltoAltura = new Evento("Salto en alto", "11/07/2028", 1, 20);

        estadio.celebrarEvento(carrera100m);
        estadio.celebrarEvento(saltoAltura);

        Comisario com1 = new Comisario("Carlos Ruiz");
        Comisario com2 = new Comisario("Ana Diaz");

        carrera100m.agregarComisario(com1);
        carrera100m.agregarComisario(com2);
        saltoAltura.agregarComisario(com1); // com1 esta en los dos eventos

        carrera100m.agregarMaterial(new Material("Tacos de salida"));
        saltoAltura.agregarMaterial(new Material("Colchoneta"));
        saltoAltura.agregarMaterial(new Material("Barra"));

        System.out.println("=== " + sede.nombre + " ===");
        System.out.println("Presupuesto: $" + sede.presupuesto);
        System.out.println("Cantidad de complejos: " + sede.getNroComplejos());

        for (Complejo c : sede.complejos) {
            System.out.println("\nComplejo en " + c.localizacion + " (area ocupada: " + c.areaOcupada + " m2) -> " + c.tipoInfo());
            System.out.println("  Areas: " + c.areas);
            for (Evento e : c.eventos) {
                System.out.println("  Evento: " + e.nombre + " (" + e.fecha + ") comisarios: " + e.getNroComisarios() + " materiales: " + e.materiales);
            }
        }

        System.out.println("\nEventos en los que participa " + com1.nombre + ": " + com1.eventos.size());
    }
}
