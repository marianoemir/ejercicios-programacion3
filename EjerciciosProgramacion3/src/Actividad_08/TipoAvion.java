/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_08;

/**
 *
 * @author FACUNDO
 */

public class TipoAvion {
    
    private String nroModelo;
    private float capacidad;
    private float peso;

    public TipoAvion(String nroModelo, float capacidad, float peso) {
        
        this.nroModelo = nroModelo;
        this.capacidad = capacidad;
        this.peso = peso;
    }

    public String getNroModelo() {
        return nroModelo;
    }
    
    
}
