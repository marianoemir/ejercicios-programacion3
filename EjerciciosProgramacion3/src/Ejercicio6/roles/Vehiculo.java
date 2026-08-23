/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6.roles;

/**
 *
 * @author andre
 */
public class Vehiculo {
    private String tipo;
    private String matricula;

    public Vehiculo(String tipo, String matricula) {
        this.tipo = tipo;
        this.matricula = matricula;
    }

    public String getTipo() { return tipo; }
    public String getMatricula() { return matricula; }
}