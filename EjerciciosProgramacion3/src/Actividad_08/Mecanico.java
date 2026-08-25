/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_08;

/**
 *
 * @author FACUNDO
 */
import java.util.ArrayList;


public class Mecanico extends Persona {
    
    private float salario;
    private String turno;
    private ArrayList<TipoAvion> capacidadMantenimiento;// Tipos de avión que puede mantener

    
    public Mecanico(String nss, String nombre, String direccion, String telefono, float salario, String turno) {
        
        super(nss, nombre, direccion, telefono);
        this.salario = salario;
        this.turno = turno;
        this.capacidadMantenimiento = new ArrayList<>();
        
    }

    public void agregarCapacidadMantenimiento(TipoAvion tipo) {
        this.capacidadMantenimiento.add(tipo);
    }

    
    public boolean puedeMantener(TipoAvion tipo) {
        
        for (TipoAvion t : capacidadMantenimiento) {
            
            if (t.equals(tipo)) {
                return true;
            }
        }
        
        return false;
    }
    
    
}
