/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author andre
 */



public class Main {
    public static void main(String[] args) {
        // 1. Instanciamos el Continente
        Continente america = new Continente("América del Sur");

        // 2. Instanciamos Países (Asociación con Continente)
        Pais argentina = new Pais("Argentina", america);
        Pais uruguay = new Pais("Uruguay", america);

        // 3. Relación Reflexiva entre Países (limita con)
        argentina.agregarPaisLimitrofe(uruguay);
        uruguay.agregarPaisLimitrofe(argentina);

        // 4. COMPOSICIÓN: El País crea sus Provincias (y cada Provincia crea su Capital)
        Provincia bsAs = argentina.agregarProvincia("Buenos Aires", "La Plata");
        Provincia mendoza = argentina.agregarProvincia("Mendoza", "Mendoza Capital");

        // COMPOSICIÓN: La Provincia crea ciudades adicionales
        Ciudad bahiaBlanca = bsAs.agregarCiudad("Bahía Blanca");
        Ciudad sanRafael = mendoza.agregarCiudad("San Rafael");

        // 5. Asignación de la capital nacional (Asociación a una Ciudad existente)
        // Por ejemplo, creamos CABA mediante la provincia de Buenos Aires o la asignamos
        Ciudad caba = bsAs.agregarCiudad("CABA");
        argentina.establecerCapital(caba);

        // 6. Relaciones de la Provincia
        bsAs.agregarProvinciaLimitrofe(mendoza);
        bsAs.agregarPaisLimitrofe(uruguay);

        // --- SALIDA POR CONSOLA ---
        System.out.println("--- INFORMACIÓN DEL PAÍS ---");
        System.out.println("País: " + argentina.getNombre());
        System.out.println("Continente: " + argentina.getContinente().getNombre());
        System.out.println("Capital Nacional: " + argentina.getCapital().getNombre());
        System.out.println("Límita con: " + argentina.getPaisesLimitrofes().get(0).getNombre());

        System.out.println("\n--- COMPOSICIÓN PAÍS -> PROVINCIAS ---");
        System.out.println("Cantidad de Provincias: " + argentina.getProvincias().size());
        for (Provincia p : argentina.getProvincias()) {
            System.out.println(" - Provincia: " + p.getNombre() + " (Capital Prov: " + p.getCapital().getNombre() + ")");
        }

        System.out.println("\n--- COMPOSICIÓN PROVINCIA -> CIUDADES ---");
        System.out.println("Ciudades de Buenos Aires (" + bsAs.getCiudades().size() + "):");
        for (Ciudad c : bsAs.getCiudades()) {
            System.out.println("   * " + c.getNombre());
        }

        System.out.println("\n--- LÍMITES DE PROVINCIA ---");
        System.out.println("Buenos Aires limita con el país: " + bsAs.getPaisesLimitrofes().get(0).getNombre());
    }
}
