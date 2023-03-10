/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_herencia_constructores;

/**
 *
 * @author Uptow
 */
public class EVA2_6_HERENCIA_CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("CLASE ANIMAL");
        Animal animal = new Animal();
        animal.comer();
        animal.respirar();
        System.out.println("\nCLASE MAMIFERO");
        Mamifero mamifero = new Mamifero();
        mamifero.comer();
        mamifero.respirar();
        mamifero.tenerpelo();
    }
    
}
