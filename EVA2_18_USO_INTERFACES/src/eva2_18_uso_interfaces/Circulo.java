/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_18_uso_interfaces;

/**
 *
 * @author Uptow
 */
public class Circulo implements Figuras, MostrarDatos{
    private double radio;

    public Circulo() {
        this.radio = 0;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calculararea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularperimetro() {
       return Math.PI * (radio * 2);
    }

    @Override
    public void imprimirdatos() {
        System.out.println("Radio: "+ radio);
        System.out.println("Area: "+ calculararea());
        System.out.println("Perimetro: "+ calcularperimetro());
        
    }
    
    
}
