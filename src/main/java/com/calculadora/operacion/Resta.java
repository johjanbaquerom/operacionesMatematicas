package com.calculadora.operacion;

public class Resta implements Operaciones{

    @Override
    public double ejecutar(double a, double b) {
        return a - b;
    }
}
