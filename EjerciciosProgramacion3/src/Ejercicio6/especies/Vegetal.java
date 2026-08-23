/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6.especies;

/**
 *
 * @author andre
 */
public class Vegetal extends Especie {
    private boolean tieneFloracion;
    private String periodoFloracion;

    public Vegetal(String nombreCientifico, String nombreVulgar, boolean tieneFloracion, String periodoFloracion) {
        super(nombreCientifico, nombreVulgar);
        this.tieneFloracion = tieneFloracion;
        this.periodoFloracion = periodoFloracion;
    }

    public boolean isTieneFloracion() { return tieneFloracion; }
    public String getPeriodoFloracion() { return periodoFloracion; }
}