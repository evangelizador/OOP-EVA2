/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_override;

/**
 *
 * @author Uptow
 */
public class EVA2_10_OVERRIDE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        persona perso = new persona();
        persona perso2 = new persona("christian", 10);
        System.out.println(perso);
        System.out.println("\n");
        System.out.println(perso2);
    }
    //:v
}

class persona{
    private String nombre;
    private int edad;

    public persona() {
        this.nombre = "°°°°°";
        this.edad = -1;
    }

    public persona(String nombre, int edad) {
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
    public String toString(){
        String cade = "Datos: \n" + 
                "Nombre: " + nombre + "\n" + 
                "Edad: " + edad;
        return cade;
    }
    
}
