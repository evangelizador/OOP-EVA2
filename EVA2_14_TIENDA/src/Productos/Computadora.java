/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Productos;

import SuperClase.Electronica;

/**
 *
 * @author Uptow
 */
public final class Computadora extends Electronica{
    private int memoria;
    private double tamapantalla;
    private double discoduro;
    private String procesador;

    public Computadora() {
        super();
        this.memoria = 0;
        this.tamapantalla = 0;
        this.discoduro = 0;
        this.procesador = "";
    }

    public Computadora(int memoria, double tamapantalla, double discoduro, String procesador, String fabricante, String modelo, int garantia, double precio, String nombre, String unidadventas) {
        super(fabricante, modelo, garantia, precio, nombre, unidadventas);
        this.memoria = memoria;
        this.tamapantalla = tamapantalla;
        this.discoduro = discoduro;
        this.procesador = procesador;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public double getTamapantalla() {
        return tamapantalla;
    }

    public void setTamapantalla(double tamapantalla) {
        this.tamapantalla = tamapantalla;
    }

    public double getDiscoduro() {
        return discoduro;
    }

    public void setDiscoduro(double discoduro) {
        this.discoduro = discoduro;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    
    
    
    
    @Override
    public double precioventa(int cant) {
        //antes de cieta cantidad manejamos precios normales despues de cierta cantidad hay descuento
        if(cant <= 10)
            return precio * cant;
        else
            return (precio * 0.8 ) * cant;
        
    }
    
    
}

/*
fianl--> no se puede heredar de una clase con final
class Laptop extends Computadora{
    
}*/