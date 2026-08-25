/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_08;

/**
 *
 * @author FACUNDO
 */

public class Servicio {
    
    private Avion avion;
    private Mecanico mecanico;
    private String fecha;
    private float horas;
    private String tipoTrabajo;

    
    public Servicio(Avion avion, Mecanico mecanico, String fecha, float horas, String tipoTrabajo) {
        this.avion = avion;
        this.mecanico = mecanico;
        this.fecha = fecha;
        this.horas = horas;
        this.tipoTrabajo = tipoTrabajo;
    }

    public String getFecha() {
        return fecha;
    }

    public String getTipoTrabajo() {
        return tipoTrabajo;
    }
   
}
