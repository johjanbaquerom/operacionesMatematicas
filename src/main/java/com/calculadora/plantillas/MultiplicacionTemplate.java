package com.calculadora.plantillas;

public class MultiplicacionTemplate extends OperacionTemplate{

    @Override
    protected double calcular(double a, double b) {
        return a * b;
    }
}
