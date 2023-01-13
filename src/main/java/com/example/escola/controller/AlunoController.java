package com.example.escola.controller;

import com.example.escola.domain.Aluno;
import com.example.escola.repository.AlunoRepository;
import com.example.escola.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("alunos")
public class AlunoController {

    Aluno aluno;
    @Autowired
    AlunoService alunoService;
    @PostMapping
    public ResponseEntity<Aluno> matricular(@RequestBody Aluno aluno_body){
        return new ResponseEntity<>(alunoService.salvar(aluno_body), HttpStatus.CREATED);
    }

    @GetMapping(path = "list")
    public List<Aluno> listarAlunos(){
        return  alunoService.listarTodosAlunos();
        //List.of(new Aluno(1L,"Silas","81992337067","894801","18/09/1995","Carpina","15975312",false,"Masculino","Solteiro","Pardo"),new Aluno(2L,"Edinho","81992337067","894801","18/09/1995","Carpina","15975312",false,"Masculino","Solteiro","Pardo"));
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Aluno> encontrarPorId(@PathVariable("id") Long id){
        return new ResponseEntity<>(alunoService.encontrarPorId(id),HttpStatus.OK);
    }
}
