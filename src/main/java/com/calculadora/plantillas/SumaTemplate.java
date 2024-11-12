package com.calculadora.plantillas;

public class SumaTemplate extends OperacionTemplate{

    @Override
    protected double calcular(double a, double b) {
        return a + b;
    }
}
