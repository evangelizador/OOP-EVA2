/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_11_figuras;

/**
 *
 * @author Uptow
 */
public class Circulo extends Figuras{
    private int radio;
    
    public Circulo() {
        this.radio = 10;
    }
    
    public Circulo(int radio) {
        this.radio = radio;
    }
    
    
    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    @Override
    public double calculararea(){
        return Math.PI * (radio*radio);
    }
    @Override
    public double calcularperi(){
        return Math.PI * (radio * 2);
    }
    
    @Override
    public String toString(){
        String cade = "\u001B[32m" + "Datos circulo:\n" + 
                      "Area: " + calculararea() + "\n" +
                      "Perimetro: " + calcularperi();
        return cade;
    }
    //:v
    
}
