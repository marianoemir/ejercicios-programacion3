/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6.alojamiento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class Excursion {
    private String codigo;
    private String dia;
    private String hora;
    private List<Visitante> inscriptos;

    public Excursion(String codigo, String dia, String hora) {
        this.codigo = codigo;
        this.dia = dia;
        this.hora = hora;
        this.inscriptos = new ArrayList<>();
    }

    public void inscribirVisitante(Visitante visitante) {
        this.inscriptos.add(visitante);
    }

    public String getCodigo() { return codigo; }
}
