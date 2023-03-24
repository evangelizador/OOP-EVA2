/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_uso_interfaces;

/**
 *
 * @author Uptow
 */
public class EVA2_18_USO_INTERFACES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Figuras fig = new Figuras(); no se puede
        //MostrarDatos mos = new MostrarDatos(); no se puede 
        Circulo cir = new Circulo();
        cir.setRadio(50);
        cir.imprimirdatos();
        System.out.print("\n");
        Triangulo tri = new Triangulo(20, 20);
        tri.imprimirdatos();
    }
    
} //:v
