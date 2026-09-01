package com.devpetry.library_manager_api.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "autores")
public class AutorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  autorId;
    private String nome;
    private String nacionalidade;
    private LocalDate dataCadastro = LocalDate.now();

    public AutorEntity() {}

    public AutorEntity(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        // dataCadastro já é LocalDate.now() por padrão.
    }

    public Long getAutorId() {
        return autorId;
    }

    // Sem setAutorId() pois esse valor não deve ser alterado.

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    // Sem setDataCadastro() pois esse valor não deve ser alterado.
}
