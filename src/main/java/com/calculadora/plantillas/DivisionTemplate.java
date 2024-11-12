package com.calculadora.plantillas;

public class DivisionTemplate extends OperacionTemplate{

    @Override
    protected double calcular(double a, double b) {
        if(b == 0){
            throw new RuntimeException("no se puede dividir pos 0");
        }
        return a / b;
    }
}
