/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S05_10;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author deyto
 */
public class Main_S05_10DeytonGarcia {

    public static void main(String[] args) {
            // Main de la clase estudiante_10
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre completo del estudiante:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante:"));
        String carrera = JOptionPane.showInputDialog("Ingrese la carrera del estudiante:");
        double promedio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Promedio maximo del estudiante:"));

        Estudiante_10 estudiante = new Estudiante_10(nombre, edad, carrera, promedio);

        estudiante.mostrarInformacion();


// Segundo main clase libro_10

        String titulo = JOptionPane.showInputDialog("Ingrese el título del libro:");
        String autor = JOptionPane.showInputDialog("Ingrese el autor del libro:");
        int anioPublicacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de publicación del libro:"));
        boolean disponible = JOptionPane.showConfirmDialog(null, "¿El libro está disponible?", "Disponibilidad", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;

        libro_10 libro = new libro_10(titulo, autor, anioPublicacion, disponible);

        libro.mostrarInformacion();
    
    }
}

