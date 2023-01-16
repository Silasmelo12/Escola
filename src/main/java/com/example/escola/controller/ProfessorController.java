package com.example.escola.controller;

import com.example.escola.domain.Professor;
import com.example.escola.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("professores")
public class ProfessorController {

    @Autowired
    ProfessorService professorService;

    @PostMapping
    public ResponseEntity<Professor> cadastrar(@RequestBody Professor professor_body){
        return new ResponseEntity<>(professorService.salvar(professor_body), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Professor> listarProfessores(){
        return professorService.listarProfessores();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Professor> encontrarPorId(@PathVariable("id") Long id){
        return new ResponseEntity<>(professorService.encontrarPorId(id),HttpStatus.OK);
    }
}
