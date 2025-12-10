package com.example.primeiro_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mensagem")
public class MensagemController{

    @GetMapping("/primeiraMensagem")
    public String primeiraMensagem(){
        return "Olá, mundo";
    }


}
