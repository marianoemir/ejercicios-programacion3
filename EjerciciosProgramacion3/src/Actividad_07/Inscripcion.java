/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_07;

/**
 *
 * @author FACUNDO
 */
public class Inscripcion {
    
    private Participante participante;
    private Prueba prueba;
    private int dorsal;
    private String codigo; // Atributo derivado: nombrePrueba + dorsal
    private String fechas;
    private float tiempo;
    private int posicion;

    
    public Inscripcion(Participante participante, Prueba prueba, int dorsal, String fechas) {
        
        this.participante = participante;
        this.prueba = prueba;
        this.dorsal = dorsal;
        this.fechas = fechas;
        this.codigo = prueba.getNombre() + "-" + dorsal;
        
    }

    
    public void registrarResultado(float tiempo, int posicion) {
        
        this.tiempo = tiempo;
        this.posicion = posicion;
    }

    
    public String getCodigo() {
        return codigo;
    }
    
    
    
}
