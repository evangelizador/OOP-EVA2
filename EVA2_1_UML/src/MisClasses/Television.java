/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClasses;

/**
 *
 * @author Uptow
 */
public class Television {
    private int canal;
    private int volumen;
    private String encendido;

    public Television() {
        canal = 0;
        volumen = 0;
        encendido = "";
    }

    public Television(int canall, int volumenl, String encendidol) {
        canal = canall;
        volumen = volumenl;
        encendido = encendidol;
    }

    public int getcanal() {
        return canal;
    }

    public void setcanal(int canall) {
        canal = canall;
    }

    public int getvolumen() {
        return volumen;
    }

    public void setvolumen(int volumenl) {
        volumen = volumenl;
    }

    public String getencendido() {
        return encendido;
    }

    public void setencendido(String encendidol) {
        encendido = encendidol;
    }

    public void ImprimirDatos() {
        System.out.println("El canal es: " + canal);
        System.out.println("El volumen: " + volumen);
        System.out.println("Esta encendido o apagado? " + encendido);
    }
}
