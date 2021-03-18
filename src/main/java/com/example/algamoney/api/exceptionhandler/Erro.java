package com.example.algamoney.api.exceptionhandler;

import lombok.Data;

@Data
public class Erro {
    private String mensagemUsuario;
    private String mensagemDesenvolvedor;

    public Erro(String mensagemUsuario, String mensagemDesenvolvedor) {
        this.mensagemUsuario = mensagemUsuario;
        this.mensagemDesenvolvedor = mensagemDesenvolvedor;
    }
}
