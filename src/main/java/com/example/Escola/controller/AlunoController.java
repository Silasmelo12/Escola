package com.example.Escola.controller;

import com.example.Escola.domain.Aluno;
import com.example.Escola.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("alunos")
public class AlunoController {

    Aluno aluno;
    @Autowired
    AlunoRepository alunoRepository;
    @PostMapping
    public ResponseEntity<Aluno> listarAlunos(@RequestBody  Aluno aluno_body){

        return new ResponseEntity<>(alunoRepository.save(aluno_body), HttpStatus.CREATED);
    }

    @GetMapping(path = "list")
    public List<Aluno> matricular(){
        return  alunoRepository.findAll();
        //List.of(new Aluno(1L,"Silas","81992337067","894801","18/09/1995","Carpina","15975312",false,"Masculino","Solteiro","Pardo"),new Aluno(2L,"Edinho","81992337067","894801","18/09/1995","Carpina","15975312",false,"Masculino","Solteiro","Pardo"));
    }

}
