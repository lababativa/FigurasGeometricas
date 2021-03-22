/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.figurasgeometricas;

/**
 * Clase padre
 * @author LAURA BABATIVA
 */
public abstract class FigurasGeometricas implements IFigura{
   
    private double valor1;
         
    public double getValor1() {
        return valor1;
    }

    /**
     *
     * @param valor1
     */
    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }
    
    public abstract double getArea();
    public abstract double getPerimetro();
    public abstract String getNombre();
    
    /**
     * Contructor por parametros
     * @param valor1
     */
    
    public FigurasGeometricas( double valor1) {
        this.valor1 = valor1;
    }    
}
