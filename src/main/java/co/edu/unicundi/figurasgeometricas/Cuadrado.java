package co.edu.unicundi.figurasgeometricas;

/**
 * Cuadrado.java
 * clase Hija para calcular perimetro y area del cuadrado
 * Esta clase hace polimorfismo y hereda de la clase FigurasGeometricas
 * @author LAURA BABATIVA
 */
public class Cuadrado extends FigurasGeometricas  {
    
    /**
     * Contructor de la clase Cuadrado
     * Solo heredamos la variable valor1 por que un cuadrado tiene el mismo valor en los 4 lados
     * @param valor1
     */
    public Cuadrado(double valor1){
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
        return Math.pow(this.getValor1(), 2);
    }

    @Override
    public double getPerimetro() {
        return this.getValor1()*4;
    }
    /**
     * implementacion de interface IFigura
     * devulve el nombre de la figura
     * @return 
     */
    @Override
    public String getNombre() {
        return ("Cuadrado");
    }

       
       
}
