package com.calculadora.plantillas;

public abstract class OperacionTemplate {

    public double realizarOperacion(double a, double b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Los números deben ser no negativos.");
        }
        return calcular(a, b);
    }

    protected abstract double calcular(double a, double b);
}
