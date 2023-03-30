/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_polimorfismo_figuras;

import java.util.Scanner;

/**
 *
 * @author Uptow
 */
public class EVA2_20_POLIMORFISMO_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* Circulo cir = new Circulo(5);
        cir.imprimirdatos();
        //FIGURA ES PADRE DE CIRCULO
        
        Figuras fig = cir;
        System.out.println("USANDO FIGURAS");
        System.out.println("Area: " + fig.calculararea());
        System.out.println("Perimetro: " + fig.calcularperimetro());
        */
       
       /*int [] arreglo = new int[10];//arreglo que guardo 10 enteros 
       //un arreglo donde inica y donde termina?
       //primera posicion: 0
       //ultima posicion: N - 1, N cantidad de elementos del arreglo
       arreglo[0] = 100;
       System.out.println(arreglo[0]);
       */
        System.out.println("¿cuantas figuras necesitas?");
        Scanner input = new Scanner(System.in);
        int cant = input.nextInt();
        Figuras[] figurases = new Figuras[cant];
        for (int i = 0; i < figurases.length; i++) {
            System.out.println("que tipo de figuras necesitas: 1.Circulo, 2.Triangulo ");
            int tipo = input.nextInt();
            if(tipo == 1){//circulo
                Circulo cir = new Circulo();
                System.out.println("Introduce el radio: ");
                cir.setRadio(input.nextDouble());//capturamos el daato del radio 
                figurases[i] = cir;
            }else{//triangulo
                Triangulo tri = new Triangulo();
                System.out.println("Introduce el base: ");
                tri.setBase(input.nextDouble()); 
                System.out.println("Introduce el altura: ");
                tri.setAltura(input.nextDouble());
                figurases[i] = tri;                
            }
        }
        for (int i = 0; i < figurases.length; i++) {
            if(figurases[i] instanceof Circulo){
                System.out.println("circulo: " + i);
                //CASTING: --> COMPARACION
                //EJEMPLO
                //int val = (int) (Math.random()*100);
                Circulo cirr = (Circulo) figurases[i];
                cirr.imprimirdatos();
            }
            else{
                System.out.println("triangulo: " + i);
                //CASTING
                Triangulo triann = (Triangulo) figurases[i];
                triann.imprimirdatos();
            }
            
            
            //System.out.println("Arera: "+figurases[i].calculararea());
            //System.out.println("Perimetro: "+figurases[i].calcularperimetro());
            
            
        }
        
        
       /* Circulo[] circulos = new Circulo[cant];
        for (int i = 0; i < circulos.length; i++) {
            circulos[i] = new Circulo();
        }
        for (int i = 0; i < circulos.length; i++) {
            circulos[i].imprimirdatos();
        }
        :v
        */
    }
    
}
