package co.edu.unicundi.figurasgeometricas;

/**Rectangulo.java
 * clase Hija para calcular perimetro y area del rectangulo
 * Esta clase hace polimorfismo y hereda de la clase FigurasGeometricas
 * @author LAURA BABATIVA
 */
public class Rectangulo extends FigurasGeometricas {

    private double valor2;
   /**
     * Contructor de la clase Cuadrado
     * heredamos valor1 que seria en este caso la base
     * @param valor1
     * se crea una variable propia de la clase, y valor2 seria la altura del rectangulo
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
    /**
     * Se redefine los metodos getArea, getPerimetro donde responde de diferente forma a la misma llamada
     * en la clase padre FigurasGeomerticas.
     * Aqui se ve como se implementa el polimorfismo
     * @return 
     */
    @Override
    public double getArea() {
        return this.getValor1()*this.valor2;
    }

    @Override
    public double getPerimetro() {
        return (2*this.getValor1())+(2*this.valor2);
    }
    /**
     * implementacion de interface IFigura
     * devulve el nombre de la figura
     * @return 
     */

    @Override
    public String getNombre() {
        return ("Rectangulo");
    } 
}
