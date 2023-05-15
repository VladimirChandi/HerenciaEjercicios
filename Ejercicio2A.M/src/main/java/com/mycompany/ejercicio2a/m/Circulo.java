
package com.mycompany.ejercicio2a.m;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }


    public double area() {
        return Math.PI * radio * radio;
    }
}
