package com.example.escola.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numeroIncricao;
    @NotNull
    @NotEmpty
    String nome;
    String contato;
    @NotNull
    @NotEmpty
    String RG;
    @NotNull
    @NotEmpty
    String data_nasicmento;
    String endereco;
    @NotEmpty
    @NotNull
    String senha;
    @NotNull
    Boolean bolsista;
    @NotNull
    @NotEmpty
    String genero;
    @NotNull
    @NotEmpty
    String estadoCivil;
    @NotNull
    @NotEmpty
    String raca;

    public Aluno() {
    }

    public Aluno(Long numeroIncricao, String nome, String contato, String RG, String data_nasicmento, String endereco, String senha, Boolean bolsista, String genero, String estadoCivil, String raca) {
        this.numeroIncricao = numeroIncricao;
        this.nome = nome;
        this.contato = contato;
        this.RG = RG;
        this.data_nasicmento = data_nasicmento;
        this.endereco = endereco;
        this.senha = senha;
        this.bolsista = bolsista;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.raca = raca;
    }

    public Long getNumeroIncricao() {
        return numeroIncricao;
    }

    public void setNumeroIncricao(Long numeroIncricao) {
        this.numeroIncricao = numeroIncricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getData_nasicmento() {
        return data_nasicmento;
    }

    public void setData_nasicmento(String data_nasicmento) {
        this.data_nasicmento = data_nasicmento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean getBolsista() {
        return bolsista;
    }

    public void setBolsista(Boolean bolsista) {
        this.bolsista = bolsista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
