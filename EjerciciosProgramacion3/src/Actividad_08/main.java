/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Actividad_08;

/**
 *
 * @author FACUNDO
 */
public class main {

    public static void main(String[] args) {


        //---------- Creacion de aviones y hangares -----------------

        TipoAvion boeing737 = new TipoAvion("Boeing 737", 180.0f, 41140.0f);
        
        Hangar hangar1 = new Hangar(101, 5, "Norte");

        Avion avion1 = new Avion("TTK 336", boeing737, hangar1);

        //---------------Prueba de propietarios y historial -------------
        
        System.out.println("----- Historial de propietarios ----");
        

        Piloto juan = new Piloto("111", "Juan", "Alvear 1564", "2615004860", "LIC-01", "Ninguna");// Asigna a su primer dueño en el año 2020 
        avion1.registrarPropiedad(juan, "18/04/2020");

        System.out.println("Propietario actual: " + avion1.propietarioActual().getNombre());

        
        Piloto maria = new Piloto("222", "Maria", "Chacabuco 256", "2617422031", "LIC-02", "Uso nocturno");// Cambia de dueño en 2024
        avion1.registrarPropiedad(maria, "16/05/2024");

        System.out.println("Propietario actual: " + avion1.propietarioActual().getNombre());
        

        
        System.out.println("Total de registros en historial: " + avion1.getHistorialPropiedad().size());
        System.out.println();


        //---------- Prueba de Registros -------------
        
        System.out.println("------ Registros ------");
        Mecanico carlos = new Mecanico("333", "Carlos", "Peru 451", "2618467538", 150000.0f, "Mañana");
        
        carlos.agregarCapacidadMantenimiento(boeing737);

        
        boolean exito1 = avion1.registrarServicio(carlos, "10/08/2026", 4.5f, "Cambio de aceite");//Registro correcto
        System.out.println("Servicio 1 registrado: " + exito1);

        boolean exito2 = avion1.registrarServicio(carlos, "10/08/2026", 2.0f, "Cambio de aceite");//Registro duplicado
        System.out.println("Servicio 2 registrado:" + exito2);

        boolean exito3 = avion1.registrarServicio(carlos, "10/08/2026", 1.5f, "Revision de frenos");//Registro con algunos datos duplicados
        System.out.println("Servicio 3 registrado:" + exito3);
        
        
        
    }
}