/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6.alojamiento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class Alojamiento {
    private String nombre;
    private int capacidad;
    private String categoria;
    private List<Excursion> excursionesOrganizadas;

    public Alojamiento(String nombre, int capacidad, String categoria) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.categoria = categoria;
        this.excursionesOrganizadas = new ArrayList<>();
    }

    public void organizarExcursion(Excursion excursion) {
        this.excursionesOrganizadas.add(excursion);
    }

    public String getNombre() { return nombre; }
}
