package com.example.escola.service;

import com.example.escola.domain.Professor;
import com.example.escola.repository.ProfessorRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    public Professor encontrarPorId(Long id){
        return professorRepository.findById(id).get();
    }

    public List<Professor> listarProfessores(){
        return professorRepository.findAll();
    }

    public Professor salvar(Professor professor){
        return professorRepository.save(professor);
    }

}
