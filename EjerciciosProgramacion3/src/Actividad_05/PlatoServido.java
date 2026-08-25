/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_05;

/**
 *
 * @author FACUNDO
 */
public class PlatoServido {
    
    private Restaurante restaurante;
    private Plato plato;
    private int valoracion;

    
    public PlatoServido(Restaurante restaurante, Plato plato, int valoracion) {
        
        this.restaurante = restaurante;
        this.plato = plato;
        this.valoracion = valoracion;
        
    }

    
    public Restaurante getRestaurante() {
        return restaurante;
    }

    
    public Plato getPlato() {
        return plato;
    }

    public int getValoracion() {
        return valoracion;
    }
    
    
}
