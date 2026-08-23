/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author andre
 */
public class Lado {
    private Punto punto1;
    private Punto punto2;

    // Recibe las coordenadas y crea los Puntos adentro (Composición)
    public Lado(float x1, float y1, float x2, float y2) {
        this.punto1 = new Punto(x1, y1);
        this.punto2 = new Punto(x2, y2);
    }

    public double longitud() {
        float dx = punto2.getX() - punto1.getX();
        float dy = punto2.getY() - punto1.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public Punto getPunto1() { return punto1; }
    public Punto getPunto2() { return punto2; }
}
