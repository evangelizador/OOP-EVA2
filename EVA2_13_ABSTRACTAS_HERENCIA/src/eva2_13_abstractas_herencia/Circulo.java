/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_13_abstractas_herencia;

/**
 *
 * @author Uptow
 */
public class Circulo extends Figuras{
    
    private int radio;
    private int diametro;

    public Circulo() {
        this.radio = 10;
        this.diametro = 10;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
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
        return Math.PI * diametro;
    }
    
}
