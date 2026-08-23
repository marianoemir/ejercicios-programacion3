// area designada dentro de un complejo para practicar un deporte especifico
// (ej: la zona de saltos dentro del estadio de atletismo)
public class Area {
    String deporte;
    String situacion; // ej: "centro", "esquina N-E"

    public Area(String deporte, String situacion) {
        this.deporte = deporte;
        this.situacion = situacion;
    }

    public String toString() {
        return deporte + " (" + situacion + ")";
    }
}
