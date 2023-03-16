/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_11_figuras;

/**
 *
 * @author Uptow
 */
public class Triangulo extends Figuras{
    private double altura;
    private double base;

    public Triangulo() {
        this.altura = 10;
        this.base = 10;
    }

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    @Override
    public double calculararea(){
        return (base * altura)/2;
    }
    @Override
    public double calcularperi(){
        double hip = Math.sqrt((base * base)+(altura * altura));
        return base + altura + hip;
                
    }
    
    @Override
    public String toString(){
        String cade = "\u001B[32m" + "Datos triangulo:\n" + 
                      "Area: " + calculararea() + "\n" +
                      "Perimetro: " + calcularperi();
        return cade;
    }
    
    //:v
}
