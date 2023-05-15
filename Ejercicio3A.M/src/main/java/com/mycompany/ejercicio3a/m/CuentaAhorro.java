
package com.mycompany.ejercicio3a.m;


   class CuentaAhorro extends Cuenta {
    private double interesVariable;
    private double saldoMinimo;

    public CuentaAhorro(Persona cliente, long numerocuenta, double interesVariable, double saldoMinimo) {
        super(cliente, numerocuenta);
        this.interesVariable = interesVariable;
        this.saldoMinimo = saldoMinimo;
    }

    public String toString() {
        return "Cuenta de Ahorro\n" +
                "Número de cuenta: " + getNumerocuenta() + "\n" +
                "Saldo: " + getSaldo();
    }

    public void retirar(double cantidad) {
        if (getSaldo() - cantidad >= saldoMinimo) {
            ingresar(-cantidad);
        } else {
            System.out.println("No se puede retirar la cantidad especificada");
        }
    }

    public void actualizarSaldo() {
        double intereses = getSaldo() * (interesVariable / 100);
        ingresar(intereses);
    }

    public void cambiarInteres(double nuevoInteres) {
        interesVariable = nuevoInteres;
    }
} 

