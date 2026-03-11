package com.ivanmontejano.IFCD0014_2026_02_HolaMundoSpringWS.controller;

import com.ivanmontejano.IFCD0014_2026_02_HolaMundoSpringWS.model.Animal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MutadorController {
    @GetMapping("/mutar")
    public Animal mutar(@RequestBody Animal animal) {
        animal.setEspecie("Burro");
        return animal;
    }

}
