/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_figuras;

/**
 *
 * @author Uptow
 */
public class EVA2_11_FIGURAS {

    /**
     * @param args the command line arguments
     */
    //:v
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circulo circulo = new Circulo(20);
        System.out.println(circulo);
        System.out.println("\n");
        
        Triangulo triangulo = new Triangulo(5,18);
        System.out.println(triangulo);
        System.out.println("\n");
        
        Circulo cir = new Circulo();
        System.out.println("\u001B[33mcirculo:");
        System.out.println("area: "+ cir.calculararea());
        System.out.println("perimetro: "+ cir.calcularperi());
        System.out.println("\n");
        
        Triangulo tri = new Triangulo();
        System.out.println("\u001B[33mtrangulo:");
        System.out.println("area: "+ tri.calculararea());
        System.out.println("perimetro: "+ tri.calcularperi());
        System.out.println("\n");
        
        Figuras fig = new Figuras();
        System.out.println("area: "+ fig.calculararea());
        System.out.println("perimetro: "+ fig.calcularperi());
    }
    
}
