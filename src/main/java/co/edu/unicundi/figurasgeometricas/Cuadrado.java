package co.edu.unicundi.figurasgeometricas;

/**
 * Cuadrado.java
 * clase para calcular perimetro y area del circulo
 * @author LAURA BABATIVA
 */
public class Cuadrado extends FigurasGeometricas  {
    
    /**
     * Contructor de la clase Cuadrado
     * @param valor1
     */
    public Cuadrado(double valor1){
        super(valor1);
    }

    @Override
    public double getArea() {
        return Math.pow(this.getValor1(), 2);
    }

    @Override
    public double getPerimetro() {
        return this.getValor1()*4;
    }

    @Override
    public String getNombre() {
        return ("Cuadrado");
    }

       
       
}
