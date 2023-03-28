/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_polimorfismo;

/**
 *
 * @author Uptow
 */
public class EVA2_19_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Docentes doc = new Docentes("juan ", "pablo ", 40, "tiempo completo");
        //doc.imprimirdatos();
        Estudiante est = new Estudiante("juan ", "pablo", 96, "1233123212");
        //est.imprimirdatos();
        // EN RESUMEN, ESTO ES POLIMORFISMO
        // OCULTAMOS PROPIEDADES 
        Persona per = doc;
        per.imprimirdatos();
        Persona per2 = est;
        per2.imprimirdatos();
        //AHORA AL REVES
        // NO SE PUEDE HACER CONVERCIONES DE SUPER CLASE A SUBCLASE 
        // EN ESTE CASO, NO EXISTE LA PLAZA
        Persona pero = new Persona();
        Docentes doce = pero;
    }
    
}
