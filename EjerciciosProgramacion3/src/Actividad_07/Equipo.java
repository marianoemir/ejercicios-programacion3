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

public class Equipo extends Participante {
    
    private String codigo;
    private String entrenador;
    private ArrayList<Esquiador> esquiadores;

    
    public Equipo(String codigo, String nombre, String entrenador) {
        
        super(nombre);
        this.codigo = codigo;
        this.entrenador = entrenador;
        this.esquiadores = new ArrayList<>();
        
    }

    public boolean agregarEsquiador(Esquiador e) {

        if (e.fijarModo("EQUIPO")) {
            
            this.esquiadores.add(e);
            return true;
            
        }
        return false;
        
    }

    public int getCantidadEsquiadores() {
        
        return esquiadores.size(); // Atributo derivado
        
    }
    
    
    
}
