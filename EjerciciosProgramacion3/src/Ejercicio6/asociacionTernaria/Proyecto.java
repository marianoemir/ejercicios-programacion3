/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6.asociacionTernaria;

import java.util.Date;

/**
 *
 * @author andre
 */
public class Proyecto {
    private String nombre;
    private double presupuesto;
    private Date fechaInicio;
    private Date fechaFin;

    public Proyecto(String nombre, double presupuesto) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
    }

    public String getNombre() { return nombre; }
}
