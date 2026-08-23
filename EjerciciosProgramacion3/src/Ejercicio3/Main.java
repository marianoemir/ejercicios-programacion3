/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author andre
 */
public class Main {
    public static void main(String[] args) {
        // Solo instanciamos la entidad principal
        Pais argentina = new Pais("Argentina");

        // Creamos una provincia mediante el método de Pais
        Provincia bsAs = argentina.agregarProvincia("Buenos Aires");

        // Creamos una ciudad mediante el método de Provincia
        // (150.000 habs > 100.000, por lo que es "controlada". Gasto: 500.000)
        Ciudad laPlata = bsAs.agregarCiudad("La Plata", 150000, 500000.0f);

        // Agregamos impuestos a través de la Ciudad
        laPlata.agregarImpuesto("imp1", 100000.0f);
        laPlata.agregarImpuesto("imp2", 150000.0f);
        // Total recaudado: 250.000 vs Gasto: 500.000 -> Queda en DÉFICIT

        // Creamos otra ciudad controlada pero sin déficit
        Ciudad bahia = bsAs.agregarCiudad("Bahía Blanca", 120000, 100000.0f);
        bahia.agregarImpuesto("imp1", 200000.0f); // Recauda más de lo que gasta

        // --- COMPROBACIONES ---
        System.out.println("=== CIUDADES EN DÉFICIT EN " + argentina.getNombre().toUpperCase() + " ===");
        for (Ciudad c : argentina.ciudadesDeficitarias()) {
            System.out.println("- " + c.getNombre() + " (Recaudación: $" + c.totalRecaudado() + ")");
        }

        System.out.println("\n=== PROVINCIAS EN RIESGO ===");
        for (Provincia p : argentina.provinciasEnRiesgo()) {
            System.out.println("- " + p.getNombre());
        }
    }
}
