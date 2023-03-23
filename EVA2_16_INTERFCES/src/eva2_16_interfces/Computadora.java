/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_16_interfces;

/**
 *
 * @author Uptow
 */
public class Computadora extends Producto
implements MostrarDatos{
    
    private String marca;
    private String procesador;

    public Computadora() {
    }

    public Computadora(String marca, String procesador, double precio, String nombre) {
        super(precio, nombre);
        this.marca = marca;
        this.procesador = procesador;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    @Override
    public void imprimirdatos() {
        System.out.println("Nombr: " + getNombre());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Marca: " + marca);
        System.out.println("Procesador: " + procesador);
    }
    
    
}
