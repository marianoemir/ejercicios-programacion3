import java.text.SimpleDateFormat;
import java.util.Date;

// clase chiquita solo para poder comparar 2 fechas guardadas como String (dd/MM/yyyy)
// la necesito para el filtro de "ventas desde la ultima reunion"
public class Fechas {
    static SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

    // devuelve true si fecha es posterior (o igual) a referencia
    public static boolean esPosteriorOIgual(String fecha, String referencia) {
        try {
            Date f = formato.parse(fecha);
            Date r = formato.parse(referencia);
            return !f.before(r);
        } catch (Exception e) {
            // si alguna fecha esta mal cargada, la considero como que no cuenta
            return false;
        }
    }
}
