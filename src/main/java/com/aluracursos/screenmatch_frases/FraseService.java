package com.aluracursos.screenmatch_frases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repositorio;

    public FrasesDTO obtenerFraseAleatoria(){
        Frase frase = repositorio.obtenerFraseAleatoria();
        return new FrasesDTO(frase.getTitulo(),frase.getFrase(), frase.getPersona(), frase.getPoster());
    }
}
