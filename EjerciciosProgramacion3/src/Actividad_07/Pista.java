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

public class Pista {
    
    private int numeroCorrelativo;
    private float longitudKm;
    private String nivelDificultad;
    private ArrayList<Pista> subpistas; 
    
    

    public Pista(int numeroCorrelativo, float longitudKm, String nivelDificultad) {
        
        this.numeroCorrelativo = numeroCorrelativo;
        this.longitudKm = longitudKm;
        this.nivelDificultad = nivelDificultad;
        this.subpistas = new ArrayList<>();
        
    }

   
    public void agregarSubpista(Pista subpista) {
        this.subpistas.add(subpista);
    }
    
    
}
