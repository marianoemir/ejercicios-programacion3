/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6.roles;

import Ejercicio6.lugar.Area;

/**
 *
 * @author andre
 */
public class RolGuarda {
    private Area areaAsignada;
    private Vehiculo vehiculo;

    public RolGuarda(Area areaAsignada, Vehiculo vehiculo) {
        this.areaAsignada = areaAsignada;
        this.vehiculo = vehiculo;
    }

    public Area getAreaAsignada() { return areaAsignada; }
    public Vehiculo getVehiculo() { return vehiculo; }
}