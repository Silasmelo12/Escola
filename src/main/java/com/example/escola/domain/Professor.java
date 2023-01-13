package com.example.escola.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class Professor {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @NotNull
    @NotEmpty
    String nome;
    @NotNull
    @NotEmpty
    String contato;
    @NotNull
    @NotEmpty
    String RG;
    @NotNull
    @NotEmpty
    String data_nasicmento;
    String endereco;
    @NotNull
    @NotEmpty
    String senha;
    @NotNull
    @NotEmpty
    String genero;
    @NotNull
    @NotEmpty
    String estadoCivil;
    @NotNull
    @NotEmpty
    String raca;
    @NotNull
    @NotEmpty
    String formacao;
    String especializacao;
    String experiencia;
}
