/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author andre
 */
public class Impuesto {
    private String tipo;
    private float montoRecaudado;

    public Impuesto(String tipo, float montoRecaudado) {
        this.tipo = tipo;
        this.montoRecaudado = montoRecaudado;
    }

    public String getTipo() {
        return tipo;
    }

    public float getMontoRecaudado() {
        return montoRecaudado;
    }
}