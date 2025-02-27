package com.aluracursos.screenmatch_frases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FraseController {
    @Autowired
    FraseService servicio;
    @GetMapping("/series/frases")
    public FrasesDTO obtenerFraseAleatoria(){
        return servicio.obtenerFraseAleatoria();

    }
}
