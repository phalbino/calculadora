package com.calculadora.controller;


import com.calculadora.model.CalculadoraModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("/")
public class CalculadoraController {
    @Autowired
    private CalculadoraModel calculadoraModel;

    @GetMapping
    public String home() {
        return "index";
    }

    @PostMapping("/calcular")
    public String calcular(@RequestParam("num1") double num1, @RequestParam("num2") double num2, @RequestParam(value = "operacao", required = false) String operacao, Model model) {
        if ("soma".equals(operacao)) {
            calculadoraModel.somar(num1, num2);
        } else if ("subtracao".equals(operacao)) {
            calculadoraModel.subtrair(num1, num2);
        }
        model.addAttribute("resultado", calculadoraModel.getResultado());
        return "resultado";
    }
}
