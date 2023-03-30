/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_21_polimorfismo_vehiculos;

/**
 *
 * @author Uptow
 */
public class EVA2_21_POLIMORFISMO_VEHICULOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        automovil au = new automovil("tsuru", 1999, "Nissan", 50);
        modificarvel(au, 20);
        bisicleta bi = new bisicleta("triciclos", "apache", 0);
        modificarvel(bi, 10);
    }
    public static  void modificarvel(ControlarDatos datos, int vel){
        datos.camviarlavelocidad(vel);
        System.out.println("\n");
        datos.tablero();
        
    }
}

class vehiculo{
    private String marca;
    protected int velocidad;

    public vehiculo(String marca, int velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    public vehiculo() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

   
    
}

interface ControlarDatos {
    void camviarlavelocidad (int cambio);
    void tablero();
    
}

class automovil extends vehiculo implements ControlarDatos{
    private String modelo;
    private int año; 

    public automovil() {
        super();
        this.modelo = " ";
        this.año = 1;
    }

    public automovil(String modelo, int año, String marca, int velocidad) {
        super(marca, velocidad);
        this.modelo = modelo;
        this.año = año;
    }
    

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public void camviarlavelocidad(int cambio) {
        int val = velocidad + cambio;
        if(val >= 0)
            velocidad = val;
    }

    @Override
    public void tablero() {
        System.out.println("Automovil ");
        System.out.println("velocidad: " + velocidad);
        System.out.println("combustible: (pendiente)" );
        System.out.println("revoluciones: (pendiente)");
        
    }
    
    
   
    
    
}
class bisicleta extends vehiculo implements ControlarDatos{
    private String tipo;

    public bisicleta() {
        super();
        this.tipo = " ";
    }

    public bisicleta(String tipo, String marca, int velocidad) {
        super(marca, velocidad);
        this.tipo = tipo;
    }

    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void camviarlavelocidad(int cambio) {
        int val = velocidad + cambio;
        if(val >= 0)
            velocidad = val;
        
    }

    @Override
    public void tablero() {
        System.out.println("Bisicleta ");
        System.out.println("velocidad: "+ velocidad);
    }
    
    
}