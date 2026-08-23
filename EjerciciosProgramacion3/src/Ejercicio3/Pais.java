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

public class Pais {
    private String nombre;
    private List<Provincia> provincias;

    public Pais(String nombre) {
        this.nombre = nombre;
        this.provincias = new ArrayList<>();
    }

    // Retorna la Provincia creada para poder agregarle ciudades
    public Provincia agregarProvincia(String nombre) {
        Provincia nuevaProvincia = new Provincia(nombre);
        this.provincias.add(nuevaProvincia);
        return nuevaProvincia;
    }

    public List<Ciudad> ciudadesDeficitarias() {
        List<Ciudad> resultado = new ArrayList<>();
        for (Provincia p : provincias) {
            for (Ciudad c : p.getCiudades()) {
                if (c.enDeficit()) {
                    resultado.add(c);
                }
            }
        }
        return resultado;
    }

    public List<Provincia> provinciasEnRiesgo() {
        List<Provincia> resultado = new ArrayList<>();
        for (Provincia p : provincias) {
            if (p.mitadCiudadesEnDeficit()) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    public String getNombre() {
        return nombre;
    }
}