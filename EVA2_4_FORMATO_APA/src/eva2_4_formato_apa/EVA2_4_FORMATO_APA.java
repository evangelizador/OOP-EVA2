/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_formato_apa;

/**
 *
 * @author Uptow
 */
public class EVA2_4_FORMATO_APA {

    /**
     * @param args the command line argumentsS
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Documento docu = new Documento();
    docu.setTitulo("Documento");
    System.out.println(docu.getTitulo());
    System.out.print("\n");

    Libro libro1 = new Libro();
    libro1.setTitulo("Libro");
    System.out.println(libro1.getTitulo());
    libro1.setEditorial("JUAN");
    System.out.println(libro1.getEditorial());
    libro1.setISBN("ISBN 0-7645-2641-3");
    System.out.println(libro1.getISBN());
    
    System.out.print("\n");

    Articulo artic = new Articulo();
    artic.setTitulo("Articulo");
    System.out.println(artic.getTitulo());
    artic.setPaginas("0-1000");
    System.out.println(artic.getPaginas());
    artic.setEditor("Shazam");
    System.out.println(artic.getEditor());

    System.out.println("\n");

    Informe info = new Informe();
    info.setTitulo("Informe");
    System.out.println(info.getTitulo());
    info.setTipo_de_informe("Expositivo");
    System.out.println(info.getTipo_de_informe());
    info.setDepartamento("PVP");
    System.out.println(info.getDepartamento());

    System.out.print("\n");

    Sitio_Web sweb = new Sitio_Web();
    sweb.setTitulo("Sitio Web");
    System.out.println(sweb.getTitulo());
    sweb.setURL("https://www.youtube.com/watch?v=kP6_nlTdPgI");
    System.out.println(sweb.getURL());
    sweb.setSoporte("soporte");
    System.out.println(sweb.getSoporte());
        
    }
    
}
