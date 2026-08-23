public class PinturaDetalle implements TipoDetalle {
    String tipoPintura; // oleo, acuarela, etc
    String soporte; // lienzo, papel
    String estilo; // impresionista, abstracto, etc

    public PinturaDetalle(String tipoPintura, String soporte, String estilo) {
        this.tipoPintura = tipoPintura;
        this.soporte = soporte;
        this.estilo = estilo;
    }

    public String getInfo() {
        return "Pintura " + tipoPintura + " sobre " + soporte + " (estilo " + estilo + ")";
    }
}
