/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_07;

/**
 *
 * @author FACUNDO
 */

public class PruebaIndividual extends Prueba {
    
    public PruebaIndividual(String nombre, String tipo) {
        super(nombre, tipo);
    }

    
    @Override
    public boolean admite(Participante p) {
        return p instanceof Esquiador;
    }
    
}
