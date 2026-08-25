/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Actividad_05;

/**
 *
 * @author FACUNDO
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        // ------- Creacion de restaurantes/platos ----------

        Restaurante LaTiaRada = new Restaurante("La Tia Rada");
        Restaurante Capri = new Restaurante("Capri");

        LaTiaRada.agregarSucursal(new Sucursal("Paso de los Andes 1290"));
        LaTiaRada.agregarSucursal(new Sucursal("Lavalle 212"));

        Plato milanesa = new Plato("Milanesa a la napolitana");

        LaTiaRada.ofrecerPlato(milanesa);
        Capri.ofrecerPlato(milanesa);

        
        // Mismo plato, distintos restaurantes, distintas valoraciones
        PlatoServido milanesaLaTiaRada = new PlatoServido(LaTiaRada, milanesa, 10);
        PlatoServido milanesaCapri = new PlatoServido(Capri, milanesa, 4);


        // ------- Creacion de la persona ---------------

        Persona ana = new Persona("Ana");
        ana.frecuentar(LaTiaRada);

        ana.agregarGusto(milanesaLaTiaRada); //Agregamos que a Ana le gusta la milanesa de la Tia Rada


        //----------- Verificaion de resultados --------------------

        System.out.println("------ Verificacion de gustos ------");
        
        System.out.println("A Ana le gusta la milanesa de La Tia Rada:" + ana.leGustaPlatoEnRestaurante(milanesa, LaTiaRada)); // Debe dar verdadero

        System.out.println("A Ana le gusta la milanesa de Capri:" + ana.leGustaPlatoEnRestaurante(milanesa, Capri)); // Debe dar falso

        
        
        System.out.println("\n-------- Valoraciones ---------");
        
        System.out.println("Valoración de la milanesa en La Tia Rada: " + milanesaLaTiaRada.getValoracion());
        
        System.out.println("Valoración de la milanesa en Capri: " + milanesaCapri.getValoracion());

        
        // --------- Prueba de limite de platos -------------
        
        
        System.out.println("\n--- Prueba de limite de platos por restaurnate ---");
        
        Restaurante restLleno = new Restaurante("Buffet");
        
        for (int i = 1; i <= 20; i++) {
            
            restLleno.ofrecerPlato(new Plato("Plato " + i));
            
        }
        
        boolean pudoAgregar21 = restLleno.ofrecerPlato(new Plato("Plato Extra"));
        
        System.out.println("Se puede agregar mas de 20 platos:" + pudoAgregar21); 
    }
}
