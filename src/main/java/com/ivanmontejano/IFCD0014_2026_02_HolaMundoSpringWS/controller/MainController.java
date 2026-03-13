package com.ivanmontejano.IFCD0014_2026_02_HolaMundoSpringWS.controller;


import com.ivanmontejano.IFCD0014_2026_02_HolaMundoSpringWS.model.Resultado;
import com.ivanmontejano.IFCD0014_2026_02_HolaMundoSpringWS.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MainController {

    @Autowired
    private CalculadoraService calculadoraService;

    @GetMapping("/")
    public Map<String, String> index() {

        Map<String, String> endpoints = new HashMap<>();

        endpoints.put("GET /sumar", "/sumar?s1=5&s2=3");
        endpoints.put("GET /restar", "/restar?s1=5&s2=3");
        endpoints.put("GET /multi", "/multi?s1=5&s2=3");
        endpoints.put("GET /mutar", "/mutar?nombre=ivan&especie=humano");

        return endpoints;
    }

    @GetMapping("/sumar")
    public Resultado sumar(@RequestParam int s1, @RequestParam int s2, Model model) {

        int resultado = calculadoraService.sumar(s1, s2);

        return new Resultado(resultado);
    }

    @GetMapping("/restar")
    public Resultado restar(@RequestParam int s1, @RequestParam int s2, Model model) {

        int resultado = calculadoraService.restar(s1, s2);

        return new Resultado(resultado);
    }

    @GetMapping("/multi")
    public Resultado multi(@RequestParam int s1, @RequestParam int s2, Model model) {

        int resultado = calculadoraService.multiplicar(s1, s2);

        return new Resultado(resultado);
    }

}
