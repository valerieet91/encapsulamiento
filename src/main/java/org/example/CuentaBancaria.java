package org.example;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria() {
        this.saldo = 0.0;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso de $" + cantidad);
        } else {
            System.out.println("No se puede depositar una cantidad negativa o cero.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (cantidad <= saldo) {
                saldo -= cantidad;
                System.out.println("Retiro exitoso de $" + cantidad);
            } else {
                System.out.println("Fondos insuficientes. No puedes retirar más de lo disponible.");
            }
        } else {
            System.out.println("No se puede retirar una cantidad negativa o cero.");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
