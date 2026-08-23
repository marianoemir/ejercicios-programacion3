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

class Pais {
    private String nombre;
    private Continente continente; // Asociación
    private Ciudad capital; // Asociación
    private List<Provincia> provincias; // Composición
    private List<Pais> paisesLimitrofes; // Asociación reflexiva

    public Pais(String nombre, Continente continente) {
        this.nombre = nombre;
        this.continente = continente;
        this.provincias = new ArrayList<>();
        this.paisesLimitrofes = new ArrayList<>();
    }

    // COMPOSICIÓN: Crea la Provincia dentro del País
    public Provincia agregarProvincia(String nombreProvincia, String nombreCapitalProvincia) {
        Provincia nuevaProvincia = new Provincia(nombreProvincia, nombreCapitalProvincia);
        this.provincias.add(nuevaProvincia);
        return nuevaProvincia;
    }

    public void establecerCapital(Ciudad ciudad) {
        this.capital = ciudad;
    }

    public void agregarPaisLimitrofe(Pais pais) {
        if (!this.paisesLimitrofes.contains(pais)) {
            this.paisesLimitrofes.add(pais);
        }
    }

    public String getNombre() { return nombre; }
    public Continente getContinente() { return continente; }
    public Ciudad getCapital() { return capital; }
    public List<Provincia> getProvincias() { return provincias; }
    public List<Pais> getPaisesLimitrofes() { return paisesLimitrofes; }
}