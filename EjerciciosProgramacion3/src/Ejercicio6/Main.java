/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

import Ejercicio6.alojamiento.Alojamiento;
import Ejercicio6.alojamiento.Estancia;
import Ejercicio6.alojamiento.Excursion;
import Ejercicio6.alojamiento.Visitante;
import Ejercicio6.asociacionTernaria.IndividuosPorArea;
import Ejercicio6.asociacionTernaria.Investigacion;
import Ejercicio6.asociacionTernaria.Proyecto;
import Ejercicio6.especies.Carnivora;
import Ejercicio6.especies.Herbivora;
import Ejercicio6.especies.Vegetal;
import Ejercicio6.lugar.Entrada;
import Ejercicio6.lugar.Area;
import Ejercicio6.lugar.ComunidadAutonoma;
import Ejercicio6.lugar.ParqueNacional;
import Ejercicio6.roles.Personal;
import Ejercicio6.roles.RolGuarda;
import Ejercicio6.roles.RolInvestigador;
import Ejercicio6.roles.Vehiculo;


/**
 *
 * @author andre
 */
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTION DE PARQUES NACIONALES ===\n");

        // 1. Comunidad Autónoma crea su Parque (Composición)
        ComunidadAutonoma Misiones = new ComunidadAutonoma("Misiones", "Ministerio de Ecología");
        ParqueNacional iguazu = Misiones.crearParque("Parque Nacional Iguazú", "1934-10-09");

        // 2. Parque crea sus dependencias (Composición Interna)
        Area garganta = iguazu.agregarArea("Garganta del Diablo", 120.5);
        Entrada entrada1 = iguazu.agregarEntrada(1);
        Alojamiento hotelIguazu = iguazu.agregarAlojamiento("Hotel Cataratas", 150, "5 Estrellas");

        // 3. Especies y Cadena Alimenticia
        Vegetal helecho = new Vegetal("Cyathea atrovirens", "Helecho Gigante", false, "N/A");
        Carnivora yaguarete = new Carnivora("Panthera onca", "Yaguareté", "Primavera");
        Herbivora coati = new Herbivora("Nasua nasua", "Coatí", "Otoño");

        coati.agregarAlimento(helecho);    // El coatí come vegetales
        yaguarete.agregarAlimento(coati);  // El yaguareté come coatíes

        // 4. Censo por Área (Clase Asociación)
        IndividuosPorArea censo = new IndividuosPorArea(garganta, yaguarete, 12);
        System.out.println("Censo: Se registraron " + censo.getCantidadIndividuos() + " " + 
                           censo.getEspecie().getNombreVulgar() + "(s) en el área " + censo.getArea().getNombre());

        // 5. Personal y demostración de ROLES OVERLAPPING
        Personal carlos = new Personal("20-35894123-8", "Carlos Gómez", "Av. San Martín 123", "3757-445566", 850000.0, "20358941238", iguazu);

        Vehiculo camioneta = new Vehiculo("4x4 Offroad", "AA123CD");
        carlos.setRolGuarda(new RolGuarda(garganta, camioneta));
        carlos.setRolInvestigador(new RolInvestigador("Licenciado en Biología"));

        System.out.println("\n--- Roles Asignados a " + carlos.getNombre() + " ---");
        if (carlos.getRolGuarda() != null) {
            System.out.println("-> Desempeña rol GUARDA en área: " + carlos.getRolGuarda().getAreaAsignada().getNombre());
        }
        if (carlos.getRolInvestigador() != null) {
            System.out.println("-> Desempeña rol INVESTIGADOR con título: " + carlos.getRolInvestigador().getTitulacion());
        }

        // 6. Alojamientos, Excursiones y Visitantes (Estancia)
        Visitante visitante1 = new Visitante("30-11223344-5", "Ana Martínez", "Calle Córdoba 45", "Arquitecta");
        Estancia estanciaAna = new Estancia(hotelIguazu, visitante1, "Habitación 302", new Date(), new Date());

        Excursion safari = new Excursion("EXC-01", "Martes", "09:00 AM");
        hotelIguazu.organizarExcursion(safari);
        safari.inscribirVisitante(visitante1);

        System.out.println("\n--- Excursiones y Turismo ---");
        System.out.println("Visitante " + visitante1.getNombre() + " inscripta en excursión: " + safari.getCodigo());

        // 7. Investigación Ternaria
        Proyecto proyectoYaguarete = new Proyecto("Conservación de Felinos Neotropicales", 3000000.0);
        Investigacion estudio = new Investigacion(proyectoYaguarete, carlos.getRolInvestigador(), yaguarete);

        System.out.println("\n--- Registro de Investigación Ternaria ---");
        estudio.mostrarDetalle();
    }
}