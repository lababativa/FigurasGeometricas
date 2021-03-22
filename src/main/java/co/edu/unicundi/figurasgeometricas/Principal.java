/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.figurasgeometricas;

/**
 * Clase Principal
 * @author LAURA BABATIVA
 */
public class Principal {
    public static void main(String[] args) {
        FigurasGeometricas figura;
        figura = new Cuadrado(5);
        System.out.println("Figura: "+figura.getNombre());
        System.out.println("Area: "+figura.getArea());
        System.out.println("Perimetro: "+figura.getPerimetro());
        figura = new Circulo(5);
        System.out.println("\nFigura: "+figura.getNombre());
        System.out.println("Area: "+figura.getArea());
        System.out.println("Perimetro: "+figura.getPerimetro());
        figura = new Triangulo(8,5,5);
        System.out.println("\nFigura: "+figura.getNombre());
        System.out.println("Area: "+figura.getArea());
        System.out.println("Perimetro: "+figura.getPerimetro());
        figura = new Rectangulo(8,5);
        System.out.println("\nFigura: "+figura.getNombre());
        System.out.println("Area: "+figura.getArea());
        System.out.println("Perimetro: "+figura.getPerimetro());
    }
}

