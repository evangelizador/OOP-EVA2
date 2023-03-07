/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClasses;

/**
 *
 * @author Uptow
 */
public class Persona {
    private int id;
    private String nombre;
    private int edad;
    
    public Persona(){
        id = 0;
        nombre = "";
        edad = 0;
    }
    
    public Persona(int idd, String nombredd, int edadd){
        id = idd;
        nombre = nombredd;
        edad = edadd;
    }
    
    public int getId(){
        return id;
    }
     public void setId(int idd){
        id = idd;
     }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombred){
        nombre = nombred;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edadd){
        edad = edadd;
    }
    public void imprimirdatos(){
        System.out.println("id: " + id);
        System.out.println("edad: " + edad);
        System.out.println("nombre: " + nombre);
    }
}
