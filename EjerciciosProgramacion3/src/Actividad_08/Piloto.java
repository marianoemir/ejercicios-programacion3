/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_08;
import java.util.ArrayList;
/**
 *
 * @author FACUNDO
 */



public class Piloto extends Persona {
    
    private String nroLicencia;
    private String restricciones;
    private ArrayList<TipoAvion> autorizaciones;// Tipos de avión autorizados

    
    public Piloto(String nss, String nombre, String direccion, String telefono, String nroLicencia, String restricciones) {
        super(nss, nombre, direccion, telefono);
        this.nroLicencia = nroLicencia;
        this.restricciones = restricciones;
        this.autorizaciones = new ArrayList<>();
    }

    public void agregarAutorizacion(TipoAvion tipo) {
        this.autorizaciones.add(tipo);
    }
    
}
