
package com.mycompany.ejercicio3a.m;



   class CuentaCorriente extends Cuenta {
    private static final double INTERES = 0.015;

    public CuentaCorriente(Persona cliente, long numerocuenta) {
        super(cliente, numerocuenta);
    }

    public String toString() {
        return "Cuenta Corriente\n" +
                "Número de cuenta: " + getNumerocuenta() + "\n" +
                "Saldo: " + getSaldo();
    }

    public void retirar(double cantidad) {
        if (cantidad <= getSaldo()) {
            ingresar(-cantidad);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void actualizarSaldo() {
        double intereses = getSaldo() * INTERES;
        ingresar(intereses);
    }
} 
