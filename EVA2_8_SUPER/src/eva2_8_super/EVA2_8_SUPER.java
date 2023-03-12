/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_super;

/**
 *
 * @author Uptow
 */
public class EVA2_8_SUPER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal = new Animal(100);
        Mamifero mamifero = new Mamifero("NEGRO", 100);
        perros perros = new perros();
        
    }
    //:v
}

class Animal{
    private int peso;
    
    public Animal(){
        System.out.println("animal: estoy vivo");
    }

    public Animal(int peso) {
        this.peso = peso;
        System.out.println("animal: estoy vivo Constructor 2");
    }
    
    public void respirar(){
        System.out.println("estoy respirando");
    }
    
    public void comer(){
        System.out.println("estoy comiendo");
    }
    
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
        
    }
    
    
}

class Mamifero extends Animal{
    private String colorpelo;
    public Mamifero(){
        super();// LLAMADA AL CONSTRUCTOR DE LA CLASE
                // EN NUESTRO CASO, ESTA LLAMANDO A animal()
                // siempre debemos llamar primero al constructor de la super clase 
        System.out.println("soy mamifero");
    }

    public Mamifero(String colorpelo, int peso) {
        super(peso);// SIEMPRE LLAMAMOS LA CONSTRUCTOR DE LA SUPERCLASE
        this.colorpelo = colorpelo;
        System.out.println("soy mamifero Constructor 2");
    }
    

    public String getColorpelo() {
        return colorpelo;
    }

    public void setColorpelo(String colorpelo) {
        this.colorpelo = colorpelo;
    }
}

class perros extends Mamifero{
    public perros(){
        // SIEMPRE HAY QUE INVOCAR AL CONSTRUCTOR DE LA SUPERCLASE
        super();
        System.out.println("soy perrito y soy un perro");
    }
}