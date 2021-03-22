package co.edu.unicundi.figurasgeometricas;

/**
 * Circulo.java
 * clase Hija para calcular perimetro y area del circulo
 * Esta clase hace polimorfismo y hereda de la clase FigurasGeometricas
 * @author LAURA BABATIVA
 */
public class Circulo extends FigurasGeometricas {
    /**
     * Heredamos la variable valor1 por que el circulo solo necesita un valor que es el radio.
     * Se crea el contructor de la clase Circulo
     * @param valor1 
     */
    public Circulo(double valor1){
        super(valor1);
    }
    /**
     * Se redefine los metodos getArea, getPerimetro donde responde de diferente forma a la misma llamada
     * en la clase padre FigurasGeomerticas.
     * Aqui se ve como se implementa el polimorfismo
     * @return 
     */
    @Override
    public double getArea() {
        return Math.PI*Math.pow(this.getValor1(), 2);
    }

    @Override
    public double getPerimetro() {
        return Math.PI*this.getValor1();
    }
    /**
     * implementacion de interface IFigura
     * devulve el nombre de la figura
     * @return 
     */
    @Override
    public String getNombre() {
        return ("Circulo");
    }
    
}
