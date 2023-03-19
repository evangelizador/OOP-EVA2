/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_4_formato_apa;

/**
 *
 * @author Uptow
 */
public class Articulo extends Documento{
    private String paginas;
    private String Editor; 
    
    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }
    public String getPaginas() {
        return paginas;
    }
    public void setEditor(String editor) {
        Editor = editor;
    }
    public String getEditor() {
        return Editor;
    }
    
}
