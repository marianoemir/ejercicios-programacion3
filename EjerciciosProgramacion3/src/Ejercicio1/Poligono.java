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

public abstract class Poligono extends Figura {
    private int nroLados;
    private List<Lado> lados;

    public Poligono(int nroLados) {
        this.nroLados = nroLados;
        this.lados = new ArrayList<>();
    }

    // Recibe coordenadas y crea el Lado adentro (Composición)
    public void agregarLado(float x1, float y1, float x2, float y2) {
        if (lados.size() < nroLados) {
            lados.add(new Lado(x1, y1, x2, y2));
        }
    }

    public int getNroLados() { return nroLados; }
    public List<Lado> getLados() { return lados; }

    @Override
    public String tipo() {
        return "Polígono";
    }
}
