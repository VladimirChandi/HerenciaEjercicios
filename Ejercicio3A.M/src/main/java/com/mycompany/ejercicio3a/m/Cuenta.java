
package com.mycompany.ejercicio3a.m;

abstract class Cuenta {
    private long numerocuenta;
    private double saldo;
    private Persona cliente;

    public Cuenta(Persona cliente, long numerocuenta) {
        this.cliente = cliente;
        this.numerocuenta = numerocuenta;
        this.saldo = 0.0;
    }
    public long getNumerocuenta() {
        return numerocuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void ingresar(double cantidad) {
        saldo += cantidad;
    }

    public abstract void retirar(double cantidad);

    public abstract void actualizarSaldo();
}

