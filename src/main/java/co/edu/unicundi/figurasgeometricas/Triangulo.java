package co.edu.unicundi.figurasgeometricas;

/**Triangulo.java
 * clase Hija para calcular perimetro y area del triangulo
 * Esta clase hace polimorfismo y hereda de la clase FigurasGeometricas
 * @author LAURA BABATIVA
 */
public class Triangulo extends FigurasGeometricas {
    /**
     * Creacion de variables propias de la clase triangulo.
     * Creacion del contructor Triangulo.
     * super accede al constructor de la clase padre desde el contructor de la clase hija
     * en el concepto de herencia.
     * valor1 es heredado de la clase FigurasGeometricas
     */
    
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
    /**
     * Se redefine los metodos getArea, getPerimetro donde responde de diferente forma a la misma llamada
     * en la clase padre FigurasGeomerticas.
     * Aqui se ve como se implementa el polimorfismo
     * @return 
     */
    @Override
    public double getArea() {
        double s = (this.getValor1()+this.valor2+this.valor3)/2; //Formula Semiperimetro de un Triangulo 
        return Math.sqrt(s*(s-this.getValor1())*(s-this.valor2)*(s-this.valor3));
    }

    @Override
    public double getPerimetro() {
        return this.getValor1()+this.valor2+this.valor3;
    }

    /**
     * implementacion de interface IFigura
     * devulve el nombre de la figura
     * @return 
     */
    @Override
    public String getNombre() {
        return ("Triangulo");
    }
    
}
