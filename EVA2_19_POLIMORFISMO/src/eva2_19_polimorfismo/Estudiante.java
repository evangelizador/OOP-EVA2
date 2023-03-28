/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_19_polimorfismo;

/**
 *
 * @author Uptow
 */
public class Estudiante extends Persona{
    private String nombre;
    private String apellido;
    private int edad;
    private String NoControl;
    
    public Estudiante(){//constructor default
        super();//LLAMADA AL CONSTRUCTOR DE LA SUPER CLASE
        this.NoControl = "°°°°°°";
    }

    public Estudiante(String nombre, String apellido, int edad, String NoControl) {
        super(nombre, apellido, edad);
        this.NoControl = NoControl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNoControl() {
        return NoControl;
    }

    public void setNoControl(String NoControl) {
        this.NoControl = NoControl;
    }
    // REMPLAZAR EL METODO imprimirdatos DE LA SUPERCLASE
    @Override
    public void imprimirdatos(){
        super.imprimirdatos();
        System.out.println("No de control: " + this.NoControl );
    }
}
