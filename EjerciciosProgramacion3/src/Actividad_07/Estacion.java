/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_07;

/**
 *
 * @author FACUNDO
 */
import java.util.ArrayList;

public class Estacion {
    
    
    private String codigo;
    private String nombre;
    private ArrayList<Pista> pistas;
    
   

    public Estacion(String codigo, String nombre) {
        
        this.codigo = codigo;
        this.nombre = nombre;
        this.pistas = new ArrayList<>();
        
    }

    public void agregarPista(Pista p) {
        
        this.pistas.add(p);
        
    }
}
