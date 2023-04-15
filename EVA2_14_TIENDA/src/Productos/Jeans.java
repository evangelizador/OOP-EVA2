/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Productos;

import SuperClase.Ropa;



/**
 *
 * @author Uptow
 */
public final class Jeans extends Ropa{
    
    private String estilo;
    private String material;

    public Jeans() {
        this.estilo = "";
        this.material = "";
    }

    public Jeans(String estilo, String material, String talla, String marca, String color, double precio, String nombre, String unidadventas) {
        super(talla, marca, color, precio, nombre, unidadventas);
        this.estilo = estilo;
        this.material = material;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    @Override
    public double precioventa(int cant) {
       if(cant <= 10)
            return precio * cant;
        else
            return (precio * 0.8 ) * cant;
    }

}
