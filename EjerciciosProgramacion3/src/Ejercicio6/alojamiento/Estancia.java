/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6.alojamiento;

import java.util.Date;

/**
 *
 * @author andre
 */
// Clase de Asociación (Diagrama 6.4)
public class Estancia {
    private Alojamiento alojamiento;
    private Visitante visitante;
    private String habitacion;
    private Date fechaInicio;
    private Date fechaFin;

    public Estancia(Alojamiento alojamiento, Visitante visitante, String habitacion, Date fechaInicio, Date fechaFin) {
        this.alojamiento = alojamiento;
        this.visitante = visitante;
        this.habitacion = habitacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
}
