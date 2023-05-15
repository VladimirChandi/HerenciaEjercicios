
package com.mycompany.ejercicio4a.m;


class Alarma {
    private Sensor sensor;
    private Timbre timbre;
    private double umbral;

    public Alarma(Sensor sensor, Timbre timbre, double umbral) {
        this.sensor = sensor;
        this.timbre = timbre;
        this.umbral = umbral;
    }
public void comprobar() {
        double valor = sensor.medir();
        if (valor > umbral) {
            timbre.activar();
        } else {
            timbre.desactivar();
        }
    }
}
    
    



