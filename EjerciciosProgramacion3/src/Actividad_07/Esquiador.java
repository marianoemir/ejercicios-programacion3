/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_07;

/**
 *
 * @author FACUNDO
 */
public class Esquiador extends Participante {
    
    
    private String dni;
    private String fechaNacimiento;
    private int edad;
    private String modo; // puede ser "SIN_DEFINIR", "INDIVIDUAL" o "EQUIPO".

    
    public Esquiador(String dni, String nombre, String fechaNacimiento, int edad) {
        
        super(nombre);
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.modo = "SIN_DEFINIR";
        
    }

    public boolean fijarModo(String nuevoModo) { //No permite cambiar de modo si ya fue asignado 
        
        
        if (!this.modo.equals("SIN_DEFINIR") && !this.modo.equals(nuevoModo)) {
            
            System.out.println("ERROR {XOR}: El esquiador " + getNombre() + " ya participa en modo " + this.modo);
            
            return false;
        }
        
        this.modo = nuevoModo;
        
        return true;
    }
    
    

    public String getModo() {
        return modo;
    }
    
    
}
