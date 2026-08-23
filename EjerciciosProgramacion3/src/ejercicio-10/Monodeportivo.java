public class Monodeportivo extends Complejo {
    String deporte; // el unico deporte que se practica aca

    public Monodeportivo(String localizacion, String jefeOrganizacion, double areaOcupada, String deporte) {
        super(localizacion, jefeOrganizacion, areaOcupada);
        this.deporte = deporte;
    }

    public String tipoInfo() {
        return "Monodeportivo de " + deporte;
    }
}
