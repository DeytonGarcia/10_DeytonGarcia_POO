/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S05_10;

import javax.swing.JOptionPane;

/**
 *
 * @author deyto
 */
public class Estudiante_10 {
    // Atributos de la clase estudiante_10
    private final String nombre;
    private final int edad;
    private final String carrera;
    private double promedio;

    public Estudiante_10(String nombre, int edad, String carrera, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    // Métodos de la clase estudiante_10
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public void mostrarInformacion() {
        String mensaje = "Nombre: " + nombre +
                "\nEdad: " + edad +
                "\nCarrera: " + carrera +
                "\nPromedio: " + promedio;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}


