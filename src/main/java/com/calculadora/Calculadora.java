package com.calculadora;

import com.calculadora.factori.OperacionFactory;
import com.calculadora.operacion.Operaciones;
import com.calculadora.plantillas.DivisionTemplate;
import com.calculadora.plantillas.OperacionTemplate;
import com.calculadora.plantillas.SumaTemplate;

public class Calculadora {
    public static void main(String[] args) {

        OperacionFactory factory = new OperacionFactory();

        Operaciones suma = factory.crearOperacion("suma");
        Operaciones resta = factory.crearOperacion("resta");
        Operaciones multiplicacion = factory.crearOperacion("multiplicacion");
        Operaciones division = factory.crearOperacion("division");

        double resultadoSuma = suma.ejecutar(5.5, 3);
        double resultadoResta = resta.ejecutar(10, 4.5);
        double resultadoMultiplicacion = multiplicacion.ejecutar(4, 6);
        double resultadoDivision = division.ejecutar(10, 2);

        System.out.println("Resultado suma (Strategy): " + resultadoSuma);
        System.out.println("Resultado resta (Strategy): " + resultadoResta);
        System.out.println("Resultado multiplicación (Strategy): " + resultadoMultiplicacion);
        System.out.println("Resultado división (Strategy): " + resultadoDivision);

        OperacionTemplate sumaTemplate = new SumaTemplate();
        OperacionTemplate divisionTemplate = new DivisionTemplate();

        double resultadoSumaTemplate = sumaTemplate.realizarOperacion(5, 3);
        double resultadoDivisionTemplate = divisionTemplate.realizarOperacion(10, 2);

        System.out.println("Resultado suma Template (Template Method): " + resultadoSumaTemplate);
        System.out.println("Resultado división Template (Template Method): " + resultadoDivisionTemplate);

    }
}