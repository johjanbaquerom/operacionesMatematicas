package com.calculadora.operacion;

public class Suma implements Operaciones{

    @Override
    public double ejecutar(double a, double b) {
        return a + b;
    }
}
