package com.example.primeiro_spring.controller;

import com.example.primeiro_spring.service.MensagemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mensagem")
public class MensagemController{
    private final MensagemService mensagemService;

    public MensagemController(MensagemService mensagemService){
        this.mensagemService = mensagemService;
    }

    @GetMapping("/mostrarMensagem")
    public String mensagem(){
        return mensagemService.obterMensagem();
    }
}
