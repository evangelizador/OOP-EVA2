/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_18_uso_interfaces;

/**
 *
 * @author Uptow
 */
public class Triangulo implements Figuras, MostrarDatos{
    private double base;
    private double altura;

    public Triangulo() {
        this.base = 0;
        this.altura = 0;
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calculararea() {
        return (base * altura)/2;
    }

    @Override
    public double calcularperimetro() {
        double hip = Math.sqrt(Math.pow(base, 2)+ Math.pow(altura, 2));
        return base + altura + (hip);
    }
    
    @Override
    public void imprimirdatos() {
        System.out.println("Base: "+ base);
        System.out.println("Altura: "+ altura);
        System.out.println("Area: "+ calculararea());
        System.out.println("Perimetro: "+ calcularperimetro());
        
    } 
    
}
