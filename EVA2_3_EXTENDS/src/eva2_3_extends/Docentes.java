/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_3_extends;

/**
 *
 * @author Uptow
 */

// SUBLCASE extends SUPERCLASE 
// CLASE DERIVADA extends 
public class Docentes extends Persona {
    private String plaza;

    
    public Docentes(){
        
    }
    
    public Docentes(String plaza) {
        this.plaza = plaza;
    }

    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }
}
