public class ObjetoArte {
    int id;
    String titulo;
    Artista artista;
    int anio;
    String descripcion;

    TipoDetalle tipoDetalle;
    PertenenciaDetalle pertenenciaDetalle;

    String pais;
    String cultura;
    String epoca;

    public ObjetoArte(int id, String titulo, Artista artista) {
        this.id = id;
        this.titulo = titulo;
        this.artista = artista;
        this.anio = -1;
    }

    public void setTipoDetalle(TipoDetalle t) {
        this.tipoDetalle = t;
    }

    public void setPertenenciaDetalle(PertenenciaDetalle p) {
        this.pertenenciaDetalle = p;
    }

    public void setOrigen(String pais, String cultura, String epoca) {
        this.pais = pais;
        this.cultura = cultura;
        this.epoca = epoca;
    }


    public boolean esPintura() {
        return tipoDetalle instanceof PinturaDetalle;
    }

    public boolean esEscultura() {
        return tipoDetalle instanceof EsculturaDetalle;
    }

    public boolean esPermanente() {
        return pertenenciaDetalle instanceof Permanente;
    }

    public boolean esPrestamo() {
        return pertenenciaDetalle instanceof Prestamo;
    }

    public String toString() {
        String nombreArtista = (artista != null) ? artista.nombre : "desconocido";
        return "#" + id + " " + titulo + " (artista: " + nombreArtista + ")\n"
                + "   -> " + (tipoDetalle != null ? tipoDetalle.getInfo() : "sin tipo") + "\n"
                + "   -> " + (pertenenciaDetalle != null ? pertenenciaDetalle.getInfo() : "sin pertenencia");
    }
}
