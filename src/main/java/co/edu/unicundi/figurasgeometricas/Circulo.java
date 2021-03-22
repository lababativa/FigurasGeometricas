/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.figurasgeometricas;

/**
 *
 * @author LAURA BABATIVA
 */
public class Circulo extends FigurasGeometricas {
    
    public Circulo(double valor1){
        super(valor1);
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(this.getValor1(), 2);
    }

    @Override
    public double getPerimetro() {
        return Math.PI*this.getValor1();
    }

    @Override
    public String getNombre() {
        return ("Circulo");
    }
    
}
