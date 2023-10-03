/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S07_10;

/**
 *
 * @author deyto
 */
public class Persona1_10 {
    private String nombre;
    private int edad;
    
    public Persona1_10(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void saludar(String saludo) {
        System.out.println(saludo + ", " + nombre + "!");
    }
    
    public void sumarEdad(int cantidad) {
        edad += cantidad;
    }
  }
