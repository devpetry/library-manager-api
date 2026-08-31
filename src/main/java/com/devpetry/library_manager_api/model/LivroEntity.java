package com.devpetry.library_manager_api.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "livros")
public class LivroEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  id;
    private String titulo;
    private String autor;
    private LocalDate dataCadastro = LocalDate.now();

    public LivroEntity(){}

    public LivroEntity(String titulo, String autor, LocalDate dataCadastro){
        this.titulo = titulo;
        this.autor = autor;
        this.dataCadastro = dataCadastro;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
