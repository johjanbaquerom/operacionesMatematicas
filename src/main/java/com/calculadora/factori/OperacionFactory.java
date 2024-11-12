package com.calculadora.factori;
import com.calculadora.operacion.*;

public class OperacionFactory {

    public Operaciones crearOperacion(String tipo) {
        switch (tipo) {
            case "suma":
                return new Suma();
            case "resta":
                return new Resta();
            case "multiplicacion":
                return new Multiplicacion();
            case "division":
                return new Division();
            default:
                throw new IllegalArgumentException("Operación no soportada.");
        }
    }
}
