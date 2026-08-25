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

public class Restaurante {
    
    private String nombre;
    private ArrayList<Sucursal> sucursales;
    private ArrayList<Plato> platos;
    

    public Restaurante(String nombre) {
        
        this.nombre = nombre;
        this.sucursales = new ArrayList<>();
        this.platos = new ArrayList<>();
        
    }
    

    public void agregarSucursal(Sucursal s) {
        this.sucursales.add(s);
    }


    public boolean ofrecerPlato(Plato p) {
        
        if (this.platos.size() < 20) {
            
            this.platos.add(p);
            return true;
            
        }
        
        return false; // Si se alcanza el limite de 20 platos
    }

    public String getNombre() {
        return nombre;
    }
    
    
}