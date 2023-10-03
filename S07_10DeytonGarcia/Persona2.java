/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S07_10DeytonGarcia;

/**
 *
 * @author deyto
 */
    public class Persona2 {
    private String nombre;
    private int edad;
    
    public Persona2(String nombre, int edad) {
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
    
    public String presentarse() {
        return "Hola, mi nombre es " + nombre + " y tengo " + edad + " años.";
    }
    
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }
    
    
}
