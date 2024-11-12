package com.calculadora.operacion;

public class Division implements Operaciones{

    @Override
    public double ejecutar(double a, double b) {
        if (a == 0){
            throw new RuntimeException("No es posible dividir por 0");
        }
        return a / b;
    }
}
