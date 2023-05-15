
package com.mycompany.ejercicio4a.m;

  class AlarmaLuminosa extends Alarma {
    private Luz luz;

    public AlarmaLuminosa(Sensor sensor, Timbre timbre, double umbral, Luz luz) {
        super(sensor, timbre, umbral);
        this.luz = luz;
    }

    public void comprobar() {
        super.comprobar(); // Comprobación de la alarma base

        // Encender la luz
        luz.encender();
    }
}  

