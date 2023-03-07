/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_uml;

import MisClasses.Automovil;
import MisClasses.Persona;
import MisClasses.Television;

/**
 *
 * @author Uptow
 */
public class EVA2_1_UML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso = new Persona();
        perso.setEdad(13);
        perso.setId(20100710);
        perso.setNombre("Ebisu");
        perso.imprimirdatos();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Television tle = new Television();
        tle.setcanal(5);
        tle.setencendido("encendida");
        tle.setvolumen(15);
        tle.ImprimirDatos();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Automovil auto = new Automovil();
        auto.setaño(2000);
        auto.setmarca("4 ruedas");
        auto.setmodelo("carro");
        auto.ImprimirDatos();
                
        
    }
    
}
