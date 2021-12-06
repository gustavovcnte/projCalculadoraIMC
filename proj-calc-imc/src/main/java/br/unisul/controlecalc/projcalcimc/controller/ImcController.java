package br.unisul.controlecalc.projcalcimc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("imc")
public class ImcController {

    @GetMapping(value = "/{imcId}")
    public ResponseEntity getUser(@PathVariable("imcId") String id) {
        return new ResponseEntity("Ultilize o padrão de url /imc?peso=80&altura=170 por exemplo", HttpStatus.ACCEPTED);
    }

    @GetMapping
    public ResponseEntity getImc(@RequestParam(value="peso") double peso,
                                 @RequestParam(value="altura") double altura) {

        double altura2 = altura * altura;
        double imc = peso / altura2 * 10000;
        String nota = null;

        if(imc < 18.5) nota = "Baixo peso";
        if(imc > 18.5) nota = "Normal";
        if(imc > 25) nota = "Sobrepeso";
        if(imc > 30) nota = "Obesidade classe 1";
        if(imc > 35) nota = "Obesidade classe 2";
        if(imc > 40) nota = "Obesidade classe 3";

        return new ResponseEntity("Seu imc é de " + imc + "\n Seu IMC está avaliado como: " + nota, HttpStatus.ACCEPTED);
    }

// Gustavo Machado Vicente
}

