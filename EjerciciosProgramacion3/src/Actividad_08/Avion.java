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



public class Avion {
    private String matricula;
    private TipoAvion tipoAvion;
    private Hangar hangar;
    private ArrayList<Propiedad> historialPropiedad;
    private ArrayList<Servicio> serviciosRealizados;
    

    public Avion(String matricula, TipoAvion tipoAvion, Hangar hangar) {
        
        this.matricula = matricula;
        this.tipoAvion = tipoAvion;
        this.hangar = hangar;
        this.historialPropiedad = new ArrayList<>();
        this.serviciosRealizados = new ArrayList<>();
        
    }

    public Propiedad registrarPropiedad(Persona nuevoPropietario, String fecha) {

        for (Propiedad p : historialPropiedad) {// Da de baja al propietario actual
            
            if (p.esActual()) {
                p.darDeBaja(fecha);
            }
        }

       Propiedad nuevaProp = new Propiedad(this, nuevoPropietario, fecha);// Crea y guarda el nuevo registro de propiedad
       historialPropiedad.add(nuevaProp);
       
        return nuevaProp;
    }

    
    public Persona propietarioActual() {
        
        for (Propiedad p : historialPropiedad) {
            
            if (p.esActual()) {
                return p.getPropietario();
            }
        }
        
        return null;
    }


    public boolean registrarServicio(Mecanico mecanico, String fecha, float horas, String tipoTrabajo) {
       
        for (Servicio s : serviciosRealizados) { //evita 2 servicios al mismo avion, misma fecha y mismo tipo de trabajo
            
            if (s.getFecha().equals(fecha) && s.getTipoTrabajo().equalsIgnoreCase(tipoTrabajo)) {
                return false; 
            }
            
        }

        Servicio nuevoServicio = new Servicio(this, mecanico, fecha, horas, tipoTrabajo);
        serviciosRealizados.add(nuevoServicio);
        
        return true;
    }

    
    public String getMatricula() {
        return matricula;
    }

    public TipoAvion getTipoAvion() {
        return tipoAvion;
    }

    
    public ArrayList<Propiedad> getHistorialPropiedad() {
        return historialPropiedad;
    }
    
    
    
}
