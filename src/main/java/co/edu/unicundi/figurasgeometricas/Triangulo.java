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
public class Triangulo extends FigurasGeometricas {
    private double valor2;
    private double valor3;
    public Triangulo(double valor1, double valor2, double valor3){
        super(valor1);
        this.valor2 =valor2;
        this.valor3 =valor3;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public double getValor3() {
        return valor3;
    }

    public void setValor3(double valor3) {
        this.valor3 = valor3;
    }

    @Override
    public double getArea() {
        double s = (this.getValor1()+this.valor2+this.valor3)/2;
        return Math.sqrt(s*(s-this.getValor1())*(s-this.valor2)*(s-this.valor3));
    }

    @Override
    public double getPerimetro() {
        return this.getValor1()+this.valor2+this.valor3;
    }

    @Override
    public String getNombre() {
        return ("Triangulo");
    }
    
}
