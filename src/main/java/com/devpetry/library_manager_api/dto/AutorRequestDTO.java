package com.devpetry.library_manager_api.dto;

public class AutorRequestDTO {
    private String nome;
    private String nacionalidade;

    public AutorRequestDTO() {}

    public AutorRequestDTO(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

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
}
