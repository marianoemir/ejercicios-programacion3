/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author andre
 */

import java.util.ArrayList;
import java.util.List;

class Provincia {
    private String nombre;
    private Ciudad capital; // Asociación
    private List<Ciudad> ciudades; // Composición
    private List<Provincia> provinciasLimitrofes; // Asociación reflexiva
    private List<Pais> paisesLimitrofes; // Asociación

    public Provincia(String nombre, String nombreCapital) {
        this.nombre = nombre;
        this.ciudades = new ArrayList<>();
        this.provinciasLimitrofes = new ArrayList<>();
        this.paisesLimitrofes = new ArrayList<>();
        
        // COMPOSICIÓN: La Provincia crea su propia Ciudad Capital internamente
        this.capital = new Ciudad(nombreCapital);
        this.ciudades.add(this.capital);
    }

    // COMPOSICIÓN: Crea la Ciudad dentro de la Provincia
    public Ciudad agregarCiudad(String nombreCiudad) {
        Ciudad nuevaCiudad = new Ciudad(nombreCiudad);
        this.ciudades.add(nuevaCiudad);
        return nuevaCiudad;
    }

    public void agregarProvinciaLimitrofe(Provincia provincia) {
        if (!this.provinciasLimitrofes.contains(provincia)) {
            this.provinciasLimitrofes.add(provincia);
        }
    }

    public void agregarPaisLimitrofe(Pais pais) {
        if (!this.paisesLimitrofes.contains(pais)) {
            this.paisesLimitrofes.add(pais);
        }
    }

    public String getNombre() { return nombre; }
    public Ciudad getCapital() { return capital; }
    public List<Ciudad> getCiudades() { return ciudades; }
    public List<Provincia> getProvinciasLimitrofes() { return provinciasLimitrofes; }
    public List<Pais> getPaisesLimitrofes() { return paisesLimitrofes; }
}