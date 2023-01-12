package com.example.Escola.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long ID;

    @NotNull
    @NotEmpty
    String ano;
    String horarios;
    List<Aluno> alunos;
    @NotNull
    @NotEmpty
    int capacidade;
    @NotNull
    @NotEmpty
    int trimestre;
}
