/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6.lugar;

/**
 *
 * @author andre
 */

import Ejercicio6.alojamiento.Alojamiento;
import java.util.ArrayList;
import java.util.List;

public class ParqueNacional {
    private String nombre;
    private String fechaDeclaracionPN;
    private List<Area> areas;
    private List<Entrada> entradas;
    private List<Alojamiento> alojamientos;
    private List<ComunidadAutonoma> seExtiendePor;

    public ParqueNacional(String nombre, String fechaDeclaracionPN) {
        this.nombre = nombre;
        this.fechaDeclaracionPN = fechaDeclaracionPN;
        this.areas = new ArrayList<>();
        this.entradas = new ArrayList<>();
        this.alojamientos = new ArrayList<>();
        this.seExtiendePor = new ArrayList<>();
    }

    // Composiciones: Instanciación interna (Rombo Negro)
    public Area agregarArea(String nombre, double km2) {
        Area nuevaArea = new Area(nombre, km2);
        this.areas.add(nuevaArea);
        return nuevaArea;
    }

    public Entrada agregarEntrada(int numero) {
        Entrada nuevaEntrada = new Entrada(numero);
        this.entradas.add(nuevaEntrada);
        return nuevaEntrada;
    }

    public Alojamiento agregarAlojamiento(String nombre, int capacidad, String categoria) {
        Alojamiento nuevoAlojamiento = new Alojamiento(nombre, capacidad, categoria);
        this.alojamientos.add(nuevoAlojamiento);
        return nuevoAlojamiento;
    }

    // Asociación "se extiende por"
    public void agregarComunidadExtension(ComunidadAutonoma ca) {
        if (!seExtiendePor.contains(ca)) {
            seExtiendePor.add(ca);
        }
    }

    public String getNombre() { return nombre; }
    public List<Area> getAreas() { return areas; }
    public List<Entrada> getEntradas() { return entradas; }
    public List<Alojamiento> getAlojamientos() { return alojamientos; }
}