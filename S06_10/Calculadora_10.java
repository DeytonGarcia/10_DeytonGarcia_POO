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
public class Calculadora_10 {
    
    // Atributos
    private double numero1;
    private double numero2;

    // Constructor predeterminado
    public Calculadora_10() {
        numero1 = 0;
        numero2 = 0;
    }

    // Constructor con parámetros
    public Calculadora_10(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Métodos

    public double sumar() {
        return numero1 + numero2;
    }

    public double restar() {
        return numero1 - numero2;
    }

    public double multiplicar() {
        return numero1 * numero2;
    }

    public double dividir() {
        if (numero2 != 0) {
            return numero1 / numero2;
        } else {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
}
