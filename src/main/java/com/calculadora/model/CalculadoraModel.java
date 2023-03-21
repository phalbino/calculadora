package com.calculadora.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class CalculadoraModel {
    private double resultado;

    public void somar(double num1, double num2) {
        resultado = num1 + num2;
    }

    public void subtrair(double num1, double num2) {
        resultado = num1 - num2;
    }

    public double getResultado() {
        return resultado;
    }
}
