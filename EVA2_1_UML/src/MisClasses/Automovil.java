/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClasses;

/**
 *
 * @author Uptow
 */
public class Automovil {
    private String marca;
    private String modelo;
    private int año;

    public Automovil() {
        marca = "";
        modelo = "";
        año = 0;
    }

    public Automovil(String mar, String model, int a) {
        marca = mar;
        modelo = model;
        año = a;
    }

    public String getmarca() {
        return marca;
    }

    public void setmarca(String valor) {
        marca = valor;
    }

    public String getmodelo() {
        return modelo;
    }

    public void setmodelo(String valor) {
        modelo = valor;
    }

    public int getaño() {
        return año;
    }

    public void setaño(int valor) {
        año = valor;
    }

    public void ImprimirDatos() {
        System.out.println("marca: " + marca);
        System.out.println("modelo: " + modelo);
        System.out.println("año: " + año);
    }
}
