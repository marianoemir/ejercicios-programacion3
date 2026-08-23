public class EsculturaDetalle implements TipoDetalle {
    String material; // marmol, bronce
    double altura;
    double peso;
    String estilo;

    public EsculturaDetalle(String material, double altura, double peso, String estilo) {
        this.material = material;
        this.altura = altura;
        this.peso = peso;
        this.estilo = estilo;
    }

    public String getInfo() {
        return "Escultura de " + material + ", " + altura + "m, " + peso + "kg (estilo " + estilo + ")";
    }
}
