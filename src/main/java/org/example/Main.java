package org.example;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.depositar(1000);
        cuenta.retirar(700);
        System.out.println("Saldo: " + cuenta.getSaldo()); // debe imprimir 300
    }
}
