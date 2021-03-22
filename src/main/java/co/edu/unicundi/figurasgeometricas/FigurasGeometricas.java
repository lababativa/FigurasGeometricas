package co.edu.unicundi.figurasgeometricas;

/**
 * Clase padre
 * @author LAURA BABATIVA
 */
public abstract class FigurasGeometricas implements IFigura{
   /**
    * Se crea la variable valor1 ya que como minimo se necesita un valor en cada clase hija
    * Se crea el constructor
    * Se crean metodo obtener area y perimetro.
    */
    private double valor1;
         
    public double getValor1() {
        return valor1;
    }
    public abstract double getArea();
    public abstract double getPerimetro();
    
    /**
     * Contructor por parametros
     * @param valor1
     */
    
    public FigurasGeometricas( double valor1) {
        this.valor1 = valor1;
    }    
}
