/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_08;

/**
 *
 * @author FACUNDO
 */

public class Propiedad {
    
    private Avion avion;
    private Persona propietario;
    private String fechaAdquisicion;
    private String fechaBaja;

    public Propiedad(Avion avion, Persona propietario, String fechaAdquisicion) {
        
        this.avion = avion;
        this.propietario = propietario;
        this.fechaAdquisicion = fechaAdquisicion;
        this.fechaBaja = null;
    }

    
    public boolean esActual() {
        return this.fechaBaja == null;
    }

    
    public void darDeBaja(String fecha) {
        this.fechaBaja = fecha;
    }

    
    public Persona getPropietario() {
        return propietario;
    }

    public String getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public String getFechaBaja() {
        return fechaBaja;
    }
    
    
}
