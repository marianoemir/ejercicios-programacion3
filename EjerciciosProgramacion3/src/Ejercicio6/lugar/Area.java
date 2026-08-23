/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6.lugar;

/**
 *
 * @author andre
 */
public class Area {
    private String nombre;
    private double km2;

    public Area(String nombre, double km2) {
        this.nombre = nombre;
        this.km2 = km2;
    }

    public String getNombre() { return nombre; }
    public double getKm2() { return km2; }
}