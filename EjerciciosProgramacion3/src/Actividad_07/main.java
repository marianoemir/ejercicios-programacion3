/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Actividad_07;

/**
 *
 * @author FACUNDO
 */
public class main {
    public static void main(String[] args) {

        // ------------- Pruebas y participantes ----------------
        
        PruebaIndividual pruebaSlalom = new PruebaIndividual("Slalom Gigante", "Slalom");
        PruebaEquipo pruebaRelevos = new PruebaEquipo("Relevos 4x10", "Fondo");

        Esquiador esquiador1 = new Esquiador("44137618", "Lucas", "18/04/2000", 26);
        Esquiador esquiador2 = new Esquiador("45787413", "Sofia", "07/02/2002", 24);

        Equipo equipoRojos = new Equipo("E01", "Los Rojos", "Entrenador Carlos");

        
        
        System.out.println("------- Participantes y sus pruebas -------");
        
        boolean exito1 = pruebaSlalom.inscribir(equipoRojos, 101, "20/08/2026");// prueba para verificar que al inscribir un Equipo en una prueba individual se devuelve false
        System.out.println("Se pudo inscribir un Equipo en Prueba Individual:" + exito1); 

        boolean exito2 = pruebaSlalom.inscribir(esquiador1, 102, "20/08/2026");// prueba para verificar que al inscribir a un solo competidor en una prueba individual se devuelve true.
        System.out.println("Se pudo inscribir a Lucas en Prueba Individual:" + exito2); 
        System.out.println();

        
        // -------- Prueba de la restriccion ----------------
        
        System.out.println("---- Restriccion para esquiadores esquiadores ---");
        
        boolean agregadoEquipo = equipoRojos.agregarEsquiador(esquiador1);//Siendo que licas ya compitio de manera individual, el intentar incluirlo en un equipo debería devolver flase.
        System.out.println("Se pudo agregar a Lucas al equipo: " + agregadoEquipo);

        boolean agregadoSofia = equipoRojos.agregarEsquiador(esquiador2);//Por otro lado Sofía todavia no ha participado, por ende no hay problema en añadirla a un equipo y debe devolver true.
        System.out.println("Se pudo agregar a Sofia al equipo" + agregadoSofia); // true


 
        // ------ Prueba de inscripcion por equipos y vencedor ---------

        System.out.println("--- Inscripcion de Equipos y nombramiento de vencedor ---");
        
        boolean exitoEquipo = pruebaRelevos.inscribir(equipoRojos, 201, "22/08/2026");//Inscripcion de equipo
        System.out.println("Se inscribió el Equipo Los Rojos en la prueba de Relevos? " + exitoEquipo);

 
        pruebaRelevos.setVencedor(equipoRojos);// Declarar vencedor
        System.out.println("El vencedor de " + pruebaRelevos.getNombre() + " es: " + pruebaRelevos.getVencedor().getNombre());
    }
}
