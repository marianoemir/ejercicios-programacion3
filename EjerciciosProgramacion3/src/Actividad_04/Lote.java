/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_04;
import java.util.List;

/**
 *
 * @author FACUNDO
 */
import java.util.ArrayList;

public class Lote {
    
    
    private ArrayList<Mineral> contiene;
    private ArrayList<Cereal> historicoSiembra;

    public Lote() {
        this.contiene = new ArrayList<>();
        this.historicoSiembra = new ArrayList<>();
    }

    public void agregarMineral(Mineral m) {
        
        this.contiene.add(m);
        
    }

    public void registrarSiembra(Cereal c) {
        
        this.historicoSiembra.add(c);
        
    }


    public boolean esEspecial() { // Busca los minerales del lote e indica si tiene un mineral primario
        
        for (Mineral m : contiene) {
            
            if (m.esPrimario()) {
                return true; // Si encuentra un mineral primario
            }
        }
        
        return false; // Si no encuentra minerales primarios
    }


    public boolean satisface(Cereal c) { //Verifica que se satisfagan los requerimientos del cereal
        
        
        for (Mineral requerido : c.getRequeridos()) { // Verifica que se encuentren todos los minerales requeridos
            
            if (!this.contiene.contains(requerido)) {
                
                return false; // Si falta al menos un mineral requerido
                
            } 
        }


        if (c instanceof Pastura) { //Verifica el historial de pasturas
            
            for (Cereal sembrado : historicoSiembra) {
                
                if (sembrado instanceof Pastura) {
                    
                    return false; // Si ya se sembró una pastura anteriormente
                    
                }
            }
            
            
        }

        // Si pasó todas las verificaciones exitosamente.
        return true;
    }
}
