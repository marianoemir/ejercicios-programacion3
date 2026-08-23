/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6.alojamiento;

/**
 *
 * @author andre
 */
public class Visitante {
    private String dni;
    private String nombre;
    private String direccion;
    private String profesion;

    public Visitante(String dni, String nombre, String direccion, String profesion) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.profesion = profesion;
    }

    public String getNombre() { return nombre; }
}
