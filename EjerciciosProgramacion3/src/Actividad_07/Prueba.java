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

public abstract class Prueba {
    
    
    private String nombre;
    private String tipo;
    private Participante vencedor; 
    private ArrayList<Inscripcion> inscripciones;
    

    public Prueba(String nombre, String tipo) {
        
        this.nombre = nombre;
        this.tipo = tipo;
        this.vencedor = null;
        this.inscripciones = new ArrayList<>();
        
    }

   
    public abstract boolean admite(Participante p); // Metodo para validar si la prueba admite cierto tipo de participante

    
    public boolean inscribir(Participante p, int dorsal, String fechas) {
        
        if (!this.admite(p)) {
            System.out.println("ERROR: No se puede inscribir a " + p.getNombre() + " en la prueba " + this.nombre + " (Tipo de participante incorrecto).");
            return false;
        }

        
        if (p instanceof Esquiador) {
            Esquiador e = (Esquiador) p;
            if (!e.fijarModo("INDIVIDUAL")) {
                return false;
            }
        }
        
        Inscripcion insc = new Inscripcion(p, this, dorsal, fechas);//Crear la inscripcion
        this.inscripciones.add(insc);
        
        return true;
    }

    
    public void setVencedor(Participante vencedor) {
        this.vencedor = vencedor;
    }

    
    public String getNombre() {
        return nombre;
    }

    public Participante getVencedor() {
        return vencedor;
    }
    
    
    
}