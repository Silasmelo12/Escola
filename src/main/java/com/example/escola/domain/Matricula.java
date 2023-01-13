package com.example.escola.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class Matricula {

    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    String ID;
    @NotNull
    @NotEmpty
    Aluno aluno;
    @NotNull
    @NotEmpty
    Turma turma;
    @NotNull
    @NotEmpty
    String data_matrícula;
    Nota notas;
    String frequencia;
    @NotNull
    @NotEmpty
    String situação;
}
