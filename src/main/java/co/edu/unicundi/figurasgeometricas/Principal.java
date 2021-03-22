/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.figurasgeometricas;

import java.util.Scanner;

/**
 * Clase Principal
 * @author LAURA BABATIVA
 */
public class Principal {
    public static void main(String[] args) {
        Scanner numeroOpc = new Scanner(System.in);
        Scanner valor1 = new Scanner(System.in);
        Scanner valor2 = new Scanner(System.in);
        Scanner valor3 = new Scanner(System.in);
        //Indica si salimos o no
        boolean salir = false;
        int opcion;
        double radio;
        double lado;
        double lado2;
        double lado3;
        double base;
        double altura;
        FigurasGeometricas figura;
        //Bucle para pedir las opciones hasta que elijamos salir
        while (!salir) {

            //opciones
            System.out.println("---------Menu Principal---------");
            System.out.println("----Escoge una opcion\n----Para hallar el perimetro y el area.");
            System.out.println("1. Cuadrado\n2. Rectangulo\n3. Triangulo\n4. Circulon\n5. Salir");

            try{
            
                //Pide una opcion
                System.out.println("Introduce un numero: ");
                opcion = numeroOpc.nextInt();

                //Realiza una de las opciones
                switch (opcion) {
                    case 1:
                        System.out.println("-AREA Y PERIMETRO DEL CUADRADO");
                        System.out.println("Por favor ingresar el valor del lado: ");
                        lado = valor1.nextInt();
                        figura = new Cuadrado(lado);
                        System.out.println("Figura: "+figura.getNombre());
                        System.out.println("Area: "+figura.getArea());
                        System.out.println("Perimetro: "+figura.getPerimetro());
                        break;
                    case 2:
                        System.out.println("-AREA Y PERIMETRO DEL RECTANGULO");
                        System.out.println("Por favor ingresar el valor de la base: ");
                        base = valor1.nextInt();
                        System.out.println("Por favor ingresar el valor de la altura: ");
                        altura = valor2.nextInt();
                        figura = new Rectangulo(base,altura);
                        System.out.println("\nFigura: "+figura.getNombre());
                        System.out.println("Area: "+figura.getArea());
                        System.out.println("Perimetro: "+figura.getPerimetro());
                        break;
                    case 3:
                        System.out.println("-AREA Y PERIMETRO DEL TRIANGULO");
                        System.out.println("Por favor ingresar el valor del lado 1: ");
                        lado = valor1.nextInt();
                        System.out.println("Por favor ingresar el valor del lado 2: ");
                        lado2 = valor2.nextInt();
                        System.out.println("Por favor ingresar el valor del lado 3: ");
                        lado3 = valor3.nextInt();
                        figura = new Triangulo(lado,lado2,lado3);
                        System.out.println("\nFigura: "+figura.getNombre());
                        System.out.println("Area: "+figura.getArea());
                        System.out.println("Perimetro: "+figura.getPerimetro());
                        break;
                    case 4:
                        System.out.println("-AREA Y PERIMETRO DEL CIRCULO");
                        System.out.println("Por favor ingresar el valor del radio: ");
                        radio = valor1.nextInt();
                        figura = new Circulo(radio);
                        System.out.println("\nFigura: "+figura.getNombre());
                        System.out.println("Area: "+figura.getArea());
                        System.out.println("Perimetro: "+figura.getPerimetro());
                        break;
                    case 5:
                        salir=true;
                        break;
                    default:
                        System.out.println("La opcion no es valida\nPor favor introducir una opcion entre 1 y 5");
                }
            
                
            //controla la excepcionn en caso de que se introduzca un valor no correcto
            }catch(Exception e){
                System.out.println("Debes escribir un numero");
                numeroOpc.next();
            }

        }
        
        System.out.println("Vuelve Pronto\nFin");
        
        
    }
}

