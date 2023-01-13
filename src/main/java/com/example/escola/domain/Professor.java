package com.example.escola.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @NotNull
    @NotEmpty
    String nome;
    @NotNull
    @NotEmpty
    String contato;
    @NotNull
    @NotEmpty
    String RG;
    @NotNull
    @NotEmpty
    String data_nasicmento;
    String endereco;
    @NotNull
    @NotEmpty
    String senha;
    @NotNull
    @NotEmpty
    String genero;
    @NotNull
    @NotEmpty
    String estadoCivil;
    @NotNull
    @NotEmpty
    String raca;
    @NotNull
    @NotEmpty
    String formacao;
    String especializacao;
    String experiencia;

    public Professor(Long id, String nome, String contato, String RG, String data_nasicmento, String endereco, String senha, String genero, String estadoCivil, String raca, String formacao, String especializacao, String experiencia) {
        this.id = id;
        this.nome = nome;
        this.contato = contato;
        this.RG = RG;
        this.data_nasicmento = data_nasicmento;
        this.endereco = endereco;
        this.senha = senha;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.raca = raca;
        this.formacao = formacao;
        this.especializacao = especializacao;
        this.experiencia = experiencia;
    }

    public Professor() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }
}
