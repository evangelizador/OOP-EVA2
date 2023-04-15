/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SuperClase;

/**
 *
 * @author Uptow
 */
public abstract class Productos {
    protected double precio;
    private String nombre;
    private String unidadventas;

    public Productos() {
        this.precio = 0;
        this.nombre = "";
        this.unidadventas = "";
    }

    public Productos(double precio, String nombre, String unidadventas) {
        this.precio = precio;
        this.nombre = nombre;
        this.unidadventas = unidadventas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUnidadventas() {
        return unidadventas;
    }

    public void setUnidadventas(String unidadventas) {
        this.unidadventas = unidadventas;
    }
    
public abstract double precioventa(int cant);
    
}
