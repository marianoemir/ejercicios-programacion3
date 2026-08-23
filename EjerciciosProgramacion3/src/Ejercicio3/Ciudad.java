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

public class Ciudad {
    private String nombre;
    private int habitantes;
    private float gastoMantenimiento;
    private List<Impuesto> impuestos;

    public Ciudad(String nombre, int habitantes, float gastoMantenimiento) {
        this.nombre = nombre;
        this.habitantes = habitantes;
        this.gastoMantenimiento = gastoMantenimiento;
        this.impuestos = new ArrayList<>();
    }

    // La composición exige que Ciudad cree el Impuesto
    public void agregarImpuesto(String tipo, float montoRecaudado) {
        this.impuestos.add(new Impuesto(tipo, montoRecaudado));
    }

    public float totalRecaudado() {
        float total = 0;
        for (Impuesto imp : impuestos) {
            total += imp.getMontoRecaudado();
        }
        return total;
    }

    public boolean controlada() {
        return this.habitantes > 100000;
    }

    public boolean enDeficit() {
        return controlada() && (this.gastoMantenimiento > totalRecaudado());
    }

    public String getNombre() {
        return nombre;
    }
}