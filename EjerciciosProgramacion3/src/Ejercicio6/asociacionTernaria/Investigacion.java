/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6.asociacionTernaria;

import Ejercicio6.especies.Especie;
import Ejercicio6.roles.RolInvestigador;

/**
 *
 * @author andre
 */


public class Investigacion {
    private Proyecto proyecto;
    private RolInvestigador investigador;
    private Especie especie;

    public Investigacion(Proyecto proyecto, RolInvestigador investigador, Especie especie) {
        this.proyecto = proyecto;
        this.investigador = investigador;
        this.especie = especie;
    }

    public void mostrarDetalle() {
        System.out.println("Proyecto: " + proyecto.getNombre() + 
                           " | Investigador Titulado: " + investigador.getTitulacion() + 
                           " | Especie: " + especie.getNombreVulgar());
    }
}
