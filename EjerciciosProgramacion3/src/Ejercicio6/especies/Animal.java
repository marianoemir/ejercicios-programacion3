/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6.especies;

/**
 *
 * @author andre
 */

import java.util.ArrayList;
import java.util.List;

public abstract class Animal extends Especie {
    private String periodoCelo;
    private List<Especie> sirveDeAlimento;

    public Animal(String nombreCientifico, String nombreVulgar, String periodoCelo) {
        super(nombreCientifico, nombreVulgar);
        this.periodoCelo = periodoCelo;
        this.sirveDeAlimento = new ArrayList<>();
    }

    public void agregarAlimento(Especie especie) {
        this.sirveDeAlimento.add(especie);
    }

    public String getPeriodoCelo() { return periodoCelo; }
    public List<Especie> getSirveDeAlimento() { return sirveDeAlimento; }
}