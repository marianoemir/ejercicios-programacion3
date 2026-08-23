/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6.lugar;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author andre
 */
public class ComunidadAutonoma {
    private String nombre;
    private String organismoResponsable;
    private List<ParqueNacional> parques; // Relación "tiene" (Composición)

    public ComunidadAutonoma(String nombre, String organismoResponsable) {
        this.nombre = nombre;
        this.organismoResponsable = organismoResponsable;
        this.parques = new ArrayList<>();
    }

    // Composición: Crea el Parque internamente
    public ParqueNacional crearParque(String nombre, String fechaDeclaracionPN) {
        ParqueNacional parque = new ParqueNacional(nombre, fechaDeclaracionPN);
        this.parques.add(parque);
        return parque;
    }

    public String getNombre() { return nombre; }
}