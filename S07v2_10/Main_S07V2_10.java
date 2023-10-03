/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S07v2_10;

import S07_10.*;

/**
 *
 * @author deyto
 */
public class Main_S07V2_10 {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
             Persona persona1 = new Persona("Juan", 534, 345.);
        Persona persona2 = new Persona("Maria", 67, 680.5);
        
        persona1.caminar();
        persona2.hablar("Hola, ¿cómo estás?");
        
        double imcJuan = persona1.getIMC(75.0);
        System.out.println("El DNI de Deyton es: " + imcJuan);
        
        String nombreCompletoDeyton = persona2.getNombreCompleto("Gonzalez");
        System.out.println("El nombre completo de Deyton es: " + nombreCompletoDeyton);
        
        persona1.dormir(8);
    }
}
 
