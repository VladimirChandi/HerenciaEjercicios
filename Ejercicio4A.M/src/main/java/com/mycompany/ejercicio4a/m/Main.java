
package com.mycompany.ejercicio4a.m;

public class Main {

    public static void main(String[] args) {
        // Crear objetos necesarios
        Sensor sensor = new Sensor();
        Timbre timbre = new Timbre();
        Luz luz = new Luz();

        // Crear una alarma básica
        Alarma alarma = new Alarma(sensor, timbre, 0.5);
        alarma.comprobar();

        // Crear una alarma luminosa
        AlarmaLuminosa alarmaLuminosa = new AlarmaLuminosa(sensor, timbre, 0.7, luz);
        alarmaLuminosa.comprobar();
    }
    }
    

