/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6.roles;

/**
 *
 * @author andre
 */

import Ejercicio6.lugar.Entrada;

public class RolCelador {
    private Entrada entradaDestinada;

    public RolCelador(Entrada entradaDestinada) {
        this.entradaDestinada = entradaDestinada;
    }

    public Entrada getEntradaDestinada() { return entradaDestinada; }
}