/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6.asociacionTernaria;

import Ejercicio6.especies.Especie;
import Ejercicio6.lugar.Area;

/**
 *
 * @author andre
 */
public class IndividuosPorArea {
    private Area area;
    private Especie especie;
    private int cantidadIndividuos;

    public IndividuosPorArea(Area area, Especie especie, int cantidadIndividuos) {
        this.area = area;
        this.especie = especie;
        this.cantidadIndividuos = cantidadIndividuos;
    }

    public Area getArea() { return area; }
    public Especie getEspecie() { return especie; }
    public int getCantidadIndividuos() { return cantidadIndividuos; }
}