/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author andre
 */
import java.util.ArrayList;
import java.util.List;

public abstract class Figura {

    private List<Figura> figuras;

    public Figura() {
        figuras = new ArrayList<>();
    }

    public String tipo() {
        return "Figura";
    }

    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    public List<Figura> getFiguras() {
        return figuras;
    }
}
