package com.example.Escola.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class Conta {

    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    String ID;
    @NotNull
    @NotEmpty
    String nome_usuario;
    @NotNull
    @NotEmpty
    String senha;
    @NotNull
    @NotEmpty
    String email;
    @NotNull
    @NotEmpty
    String papel;
    @NotNull
    @NotEmpty
    String ultimo_acesso;
    @NotNull
    @NotEmpty
    String data_criacao;
    @NotNull
    @NotEmpty
    String status;
}
