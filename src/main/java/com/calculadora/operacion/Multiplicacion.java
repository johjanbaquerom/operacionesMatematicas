package com.calculadora.operacion;


public class Multiplicacion implements Operaciones {

    @Override
    public double ejecutar(double a, double b) {
        return a * b;
    }
}
