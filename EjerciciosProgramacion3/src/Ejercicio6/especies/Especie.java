/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6.especies;

/**
 *
 * @author andre
 */
public abstract class Especie {
    private String nombreCientifico;
    private String nombreVulgar;

    public Especie(String nombreCientifico, String nombreVulgar) {
        this.nombreCientifico = nombreCientifico;
        this.nombreVulgar = nombreVulgar;
    }

    public String getNombreCientifico() { return nombreCientifico; }
    public String getNombreVulgar() { return nombreVulgar; }
}