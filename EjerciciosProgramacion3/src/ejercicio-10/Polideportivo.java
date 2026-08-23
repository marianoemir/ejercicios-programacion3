import java.util.ArrayList;

public class Polideportivo extends Complejo {
    ArrayList<String> deportes = new ArrayList<>(); // varios deportes

    public Polideportivo(String localizacion, String jefeOrganizacion, double areaOcupada) {
        super(localizacion, jefeOrganizacion, areaOcupada);
    }

    public void agregarDeporte(String d) {
        deportes.add(d);
    }

    public String tipoInfo() {
        return "Polideportivo (" + deportes.size() + " deportes)";
    }
}
