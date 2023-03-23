/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_16_interfces;

/**
 *
 * @author Uptow
 */
public class Persona implements MostrarDatos{
    private String nombre;
    private int edad;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
    }
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public void imprimirdatos() {
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
    }
    
    
    
}
