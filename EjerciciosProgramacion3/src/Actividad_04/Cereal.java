/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_04;
import java.util.ArrayList;
/**
 *
 * @author FACUNDO
 */

public abstract class Cereal {
    
    
    private String nombre;
    
    private ArrayList<Mineral> requeridos;
    
    
    

    public Cereal(String nombre) {
        this.nombre = nombre;
        this.requeridos = new ArrayList<>();
    }
    

    public void agregarMineral(Mineral m) {
        
        this.requeridos.add(m);
        
    }

    public ArrayList<Mineral> getRequeridos() {
        return requeridos;
    }
    
    
    
    
}






