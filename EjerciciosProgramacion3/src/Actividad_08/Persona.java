/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_08;

/**
 *
 * @author FACUNDO
 */

public abstract class Persona {
    
    private String nss;
    private String nombre;
    private String direccion;
    private String telefono;

    
    public Persona(String nss, String nombre, String direccion, String telefono) {
        this.nss = nss;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
