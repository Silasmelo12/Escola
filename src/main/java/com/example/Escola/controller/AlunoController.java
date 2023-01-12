package com.example.Escola.controller;

import com.example.Escola.domain.Aluno;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("alunos")
public class AlunoController {

    @GetMapping(path = "list")
    public List<Aluno> matricula(){
        return  List.of(new Aluno(1L,"Silas","81992337067","894801","18/09/1995","Carpina","15975312",false,"Masculino","Solteiro","Pardo"),new Aluno(2L,"Edinho","81992337067","894801","18/09/1995","Carpina","15975312",false,"Masculino","Solteiro","Pardo"));
    }

}
