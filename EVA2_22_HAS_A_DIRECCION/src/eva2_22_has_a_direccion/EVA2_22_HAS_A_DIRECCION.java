/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_22_has_a_direccion;

/**
 *
 * @author Uptow
 */
public class EVA2_22_HAS_A_DIRECCION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        persona per = new persona();
        per.setNombre("Christian");
        per.setApellidoa("Flores Ortega");
        per.setEdad(19);
        /*direccion dire = new direccion();
        dire.setCalle("uwu");
        dire.setNumero(10);
        dire.setColonia("lol");
        dire.setCp("1233");
        dire.setCiudad("chih");
        dire.setEstado("chih");
        per.setDireccion(dire);*/
        per.imprimirdatos();
    }
    
}
class direccion{
    private String calle;
    private int numero;
    private String colonia;
    private String cp;
    private String ciudad;
    private String estado;

    public direccion() {
        this.calle = " ";
        this.numero = 0;
        this.colonia = " ";
        this.cp = " ";
        this.ciudad = " ";
        this.estado = " ";
    }

    public direccion(String calle, int numero, String colonia, String cp, String ciudad, String estado) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.cp = cp;
        this.ciudad = ciudad;
        this.estado = estado;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    public void imprimirdatos(){
        System.out.println("Direccion: ");
        System.out.println( calle + " #" + numero + ", " + colonia + ", " + cp +", " + ciudad + ", " + estado);
        
    }
}

class persona{
    private String nombre;
    private String apellidoa;
    private int edad;
    private direccion direccion;

    public persona() {
        this.nombre = " ";
        this.apellidoa = " ";
        this.edad = 0;
        this.direccion = null;//LA DIRECCION NO EXISTE
    }

    public persona(String nombre, String apellidoa, int edad, direccion direccion) {
        this.nombre = nombre;
        this.apellidoa = apellidoa;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoa() {
        return apellidoa;
    }

    public void setApellidoa(String apellidoa) {
        this.apellidoa = apellidoa;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(direccion direccion) {
        this.direccion = direccion;
    }
    
    public void imprimirdatos(){
        System.out.println("Persona: ");
        System.out.println( nombre + " " + apellidoa + " " + edad + " años");
        if(direccion == null)
            System.out.println("sin direccion");
        else
            direccion.imprimirdatos();
        
    }
    
}