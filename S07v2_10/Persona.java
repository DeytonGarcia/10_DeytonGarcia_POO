/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S07v2_10;

/**
 *
 * @author deyto
 */
  public class Persona {
    // Atributos
    private final String nombre;
    private final int edad;
    private final double altura;
    
    // Constructor
    public Persona(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }
    
    // Métodos
    public void caminar() {
        System.out.println("Estoy caminando");
    }
    
    public void hablar(String mensaje) {
        System.out.println("Estoy hablando: " + mensaje);
    }
    
    public void comer(String comida) {
        System.out.println("Estoy comiendo: " + comida);
    }
    
    public void hablar() {
        System.out.println("Estoy hablando");
    }
    
    public void hablar(int veces) {
        for (int i = 0; i < veces; i++) {
            System.out.println("Estoy hablando");
        }
    }
    
    public int getEdad() {
        return this.edad;
    }
    
    public double getIMC(double peso) {
        double alturaMetros = this.altura / 100.0;
        return peso / (alturaMetros * alturaMetros);
    }
    
    public String getNombreCompleto(String apellido) {
        return this.nombre + " " + apellido;
    }
    
    public void dormir(int horas) {
        System.out.println("Estoy durmiendo " + horas + " horas");
    }
  }
  

