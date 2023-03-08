/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_extends;

/**
 *
 * @author Uptow
 */
public class EVA2_3_EXTENDS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Estudiante estu = new Estudiante();
        estu.setNombre("pp");
        estu.setApellido("joel");
        estu.setEdad(30);
        estu.setNoControl("225501001");
        System.out.println("DATOS DEL ESTUDIANTE: ");
        System.out.println(estu.getNombre());
        System.out.println(estu.getApellido());
        System.out.println(estu.getEdad());
        System.out.println(estu.getNoControl());
        
        Docentes doce1 = new Docentes();
        doce1.setNombre("fdfsdfdsf");
        doce1.setApellido("dasdfds");
        doce1.setEdad(59);
        doce1.setPlaza("sadasd");
    }
    //:v
    
}
