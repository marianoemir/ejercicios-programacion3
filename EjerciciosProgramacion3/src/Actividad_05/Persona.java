/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_05;

/**
 *
 * @author FACUNDO
 */
import java.util.ArrayList;

public class Persona {
    
    private String nombre;
    private ArrayList<Restaurante> frecuenta;
    private ArrayList<PlatoServido> leGusta;

    
    public Persona(String nombre) {
        this.nombre = nombre;
        this.frecuenta = new ArrayList<>();
        this.leGusta = new ArrayList<>();
    }

    public void frecuentar(Restaurante r) {
        this.frecuenta.add(r);
    }

    
    public void agregarGusto(PlatoServido ps) {
        this.leGusta.add(ps);
    }

    

    public boolean leGustaPlatoEnRestaurante(Plato plato, Restaurante restaurante) {
        
        for (PlatoServido ps : leGusta) {
            
            if (ps.getPlato().equals(plato) && ps.getRestaurante().equals(restaurante)) {
                return true;
            }
        }
        return false;
        
    }

    
    public String getNombre() {
        return nombre;
    }
}
