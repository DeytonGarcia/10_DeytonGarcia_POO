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
public class Main {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        Persona1 persona1 = new Persona1("Deyton Paolo", 17);
        
        System.out.println(persona1.getNombre() + " tiene " + persona1.getEdad() + " años.");
        
        persona1.saludar("Hola mucho Gusto");
        
        persona1.sumarEdad(1);
        
        System.out.println(persona1.getNombre() + " ahora tiene " + persona1.getEdad() + " años.");
        
        //SEGUNDO MAIN
        Persona2 persona = new Persona2("María", 20);
        
        System.out.println(persona.presentarse());
        
        if (persona.esMayorDeEdad()) {
            System.out.println("Soy mayor de edad.");
        } else {
            System.out.println("No soy mayor de edad.");
        }
    }
    }
