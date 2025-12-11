package com.example.primeiro_spring.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MensagemRepository {
    public String obterMensagem(){
        return "Estou motificando um código, e colocando em um repositório.";
    }
}
