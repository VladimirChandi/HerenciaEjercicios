/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2a.m;


public class Triangulo  extends Figura{
    private double base;
    private double altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }


    public double area() {
        return (base * altura) / 2;
    }
}
