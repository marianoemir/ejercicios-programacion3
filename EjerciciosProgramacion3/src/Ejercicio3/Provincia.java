/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author andre
 */
import java.util.ArrayList;
import java.util.List;

public class Provincia {
    private String nombre;
    private List<Ciudad> ciudades;

    public Provincia(String nombre) {
        this.nombre = nombre;
        this.ciudades = new ArrayList<>();
    }

    // Retorna la Ciudad creada para poder agregarle impuestos directamente
    public Ciudad agregarCiudad(String nombre, int habitantes, float gastoMantenimiento) {
        Ciudad nuevaCiudad = new Ciudad(nombre, habitantes, gastoMantenimiento);
        this.ciudades.add(nuevaCiudad);
        return nuevaCiudad;
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    public boolean mitadCiudadesEnDeficit() {
        int totalCiudadesControladas = 0;
        int ciudadesDeficitarias = 0;

        for (Ciudad c : ciudades) {
            if (c.controlada()) {
                totalCiudadesControladas++;
                if (c.enDeficit()) {
                    ciudadesDeficitarias++;
                }
            }
        }

        if (totalCiudadesControladas == 0) return false;

        return ciudadesDeficitarias > (totalCiudadesControladas / 2.0);
    }

    public String getNombre() {
        return nombre;
    }
}