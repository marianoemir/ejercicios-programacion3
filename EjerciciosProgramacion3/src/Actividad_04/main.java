/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Actividad_04;

/**
 *
 * @author FACUNDO
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

            // Creacion de minerales

            Mineral nitrógeno = new Mineral("Nitrogeno", true);  //Primario
            Mineral fósforo = new Mineral("Fosforo", true);    //Primario
            Mineral calcio = new Mineral("Calcio", false);     //Secundario


            // Creacion de cereales

            CosechaGruesa maiz = new CosechaGruesa("Maiz");// Cosecha Gruesa
            maiz.agregarMineral(nitrógeno);
            maiz.agregarMineral(calcio);


            Pastura alfalfa = new Pastura("Alfafla");// Pasturas
            alfalfa.agregarMineral(nitrógeno);

            Pastura trebol = new Pastura("Trebol");
            trebol.agregarMineral(nitrógeno);


            // Prueba de clasificacion
            
            Lote lote1 = new Lote();
            lote1.agregarMineral(calcio); 

            Lote lote2 = new Lote();
            lote2.agregarMineral(nitrógeno); 
            

            System.out.println("-------- Prueba de clasificacion de lotres -------");
            System.out.println("Lote 1 es especial:"  + lote1.esEspecial()); // Tiene que dar false (comun)
            System.out.println("Lote 2 es especial:"  + lote2.esEspecial()); // Tiene que dar true(especial)
            System.out.println();


            // Prueba de requerimientos

            System.out.println("-------- Prueba de requerimientos de minerales -------");

            // 
            System.out.println("Lote 1 satisface los requerimientos del Maiz:"  + lote1.satisface(maiz));// El maiz necesita nitrogeno y calcio pero el lote 1 solo tiene Calcio por ende no satisface.

            lote1.agregarMineral(nitrógeno);

            System.out.println("Lote 1 satisface los requerimientos del Maiz: " + lote1.satisface(maiz)); // Ahora al tener calcio y nitrogen si satisface.
            System.out.println();


            // Prueba del historial de pasturas.

            System.out.println("--------- Prueba historial de pasturas ----------");

            System.out.println("Lote 2 satisface alfalfa: " + lote2.satisface(alfalfa));
            
            lote2.registrarSiembra(alfalfa);
            
            System.out.println("Se sembró alfalfa en el lote 2.");
            
            System.out.println("Lote 2 satisface Trébol:" + lote2.satisface(trebol)); // Intento por sembrar otra pastura en el mismo lote ,deberia dar false porque ya se sembró previamente la Alfalfa

        }
    }
    

