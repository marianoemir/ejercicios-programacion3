/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author andre
 */
public class Main {
    public static void main(String[] args) {
        // Instanciación de figuras
        Triangulo triangulo = new Triangulo();
        Cuadrado cuadrado = new Cuadrado();
        Circulo circulo = new Circulo();

        // Agregamos lados pasando coordenadas, la composición crea Lado y Punto internamente
        triangulo.agregarLado(0, 0, 3, 0); // Lado 1 (base)
        triangulo.agregarLado(3, 0, 0, 4); // Lado 2 (hipotenusa)
        triangulo.agregarLado(0, 4, 0, 0); // Lado 3 (altura)

        // Relación de agregación "compuesta por" entre Figuras
        circulo.agregarFigura(cuadrado);

        // Imprimir resultados
        System.out.println("--- Tipos de Figura ---");
        System.out.println("Tipo: " + triangulo.tipo());
        System.out.println("Tipo: " + circulo.tipo());

        System.out.println("\n--- Triángulo (Composición Poligono -> Lado -> Punto) ---");
        System.out.println("Lados esperados: " + triangulo.getNroLados());
        System.out.println("Lados cargados: " + triangulo.getLados().size());
        System.out.println("Longitud Lado 1: " + triangulo.getLados().get(0).longitud());
        System.out.println("Longitud Lado 2: " + triangulo.getLados().get(1).longitud());
        System.out.println("Longitud Lado 3: " + triangulo.getLados().get(2).longitud());

        System.out.println("\n--- Figura Compuesta ---");
        System.out.println("Subfiguras en Círculo: " + circulo.getFiguras().size());
        System.out.println("Tipo de subfigura: " + circulo.getFiguras().get(0).tipo());
    }
}