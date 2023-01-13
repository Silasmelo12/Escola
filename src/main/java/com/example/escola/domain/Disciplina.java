package com.example.escola.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class Disciplina {
@Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    String ID;
    @NotNull
    @NotEmpty
    Professor professor;
    String ementa;
    @NotNull
    @NotEmpty
    int carga_horaria;//quantidad ed ehora aula
    String bibliografia;
    String notas;// nota mínima para aprovação, tipos de avaliações (prova, trabalho, etc
}
