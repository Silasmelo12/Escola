package com.example.escola.service;

import com.example.escola.domain.Aluno;
import com.example.escola.repository.AlunoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AlunoService {
    @Autowired
    private AlunoRepository alunoRepository;

    public List<Aluno> listarTodosAlunos(){
        return alunoRepository.findAll();
    }
    public Aluno salvar(Aluno aluno){
        return alunoRepository.save(aluno);
    }

    public Aluno encontrarPorId(Long id){
        return alunoRepository.findById(id).get();
    }
}
