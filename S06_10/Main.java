/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S06_10;

/**
 *
 * @author deyto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Uso de la clase Calculadora_10
        Calculadora_10 calc = new Calculadora_10(5, 3);
        System.out.println(calc.sumar() + "Suma: ");
        System.out.println("Resta: " + calc.restar());
        System.out.println("Multiplicación: " + calc.multiplicar());
        System.out.println("División: " + calc.dividir());
        
        // uso de la clase Estudiante_10
        Estudiante_10 estudiante1 = new Estudiante_10();
        Estudiante_10 estudiante2 = new Estudiante_10("Juan", 20, "Ingeniería", 4.5f);

        estudiante1.estudiar();
        estudiante2.dormir();

        float promedio = estudiante2.calcularPromedio(4, 5, 3);
        System.out.println("El promedio de " + estudiante2.nombre + " es: " + promedio);
    }
    }
       


