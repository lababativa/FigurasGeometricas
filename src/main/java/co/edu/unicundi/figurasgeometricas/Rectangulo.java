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
public class Rectangulo extends FigurasGeometricas {

    private double valor2;
   /**
     * Contructor de la clase Cuadrado
     * @param valor1
     * @param valor2
     */
    public Rectangulo(double valor1, double valor2) {
        super(valor1);
        this.valor2=valor2;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    @Override
    public double getArea() {
        return this.getValor1()*this.valor2;
    }

    @Override
    public double getPerimetro() {
        return (2*this.getValor1())+(2*this.valor2);
    }

    @Override
    public String getNombre() {
        return ("Rectangulo");
    } 
}
