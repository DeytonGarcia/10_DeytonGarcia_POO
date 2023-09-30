/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S06_10;
import java.util.Scanner;

/**
 *
 * @author deyto
 */
public final class Estudiante_10 {
    // Atributos
    String nombre;
    private int edad;
    private String carrera;
    private float promedio;

    // Constructor 
    public Estudiante_10() {
        pedirDatos();
    }

    // Constructor con parámetros
    public Estudiante_10(String nombre, int edad, String carrera, float promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    // Método para pedir los datos del estudiante al usuario
    public void pedirDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del estudiante:");
        this.nombre = scanner.nextLine();

        System.out.println("Ingrese la edad del estudiante:");
        this.edad = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese la carrera del estudiante:");
        this.carrera = scanner.nextLine();

        System.out.println("Ingrese el promedio del estudiante:");
        this.promedio = scanner.nextFloat();
    }

    // Métodos
    public void estudiar() {
        System.out.println("El estudiante " + this.nombre + " está estudiando");
    }

    public void dormir() {
        System.out.println("El estudiante " + this.nombre + " está durmiendo");
    }

    public float calcularPromedio(int nota1, int nota2, int nota3) {
        float promedio = (nota1 + nota2 + nota3) / 3.0f;
        return promedio;
    }

    static class Estudiante {

        public Estudiante() {
        }
    }
}


