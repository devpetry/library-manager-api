package com.devpetry.library_manager_api.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "livros")
public class LivroEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  livroId;
    private String titulo;
    @ManyToOne
    @JoinColumn(name = "autor_id")
    private AutorEntity autor;
    private LocalDate dataCadastro = LocalDate.now();

    public LivroEntity(){}

    public LivroEntity(String titulo, AutorEntity autor){
        this.titulo = titulo;
        this.autor = autor;
        // dataCadastro já é LocalDate.now() por padrão.
    }

    public Long getLivroId() {
        return livroId;
    }

    // Sem setLivroId() pois esse valor não deve ser alterado.

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public AutorEntity getAutor() {
        return autor;
    }

    public void setAutor(AutorEntity autor) {
        this.autor = autor;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    // Sem setDataCadastro() pois esse valor não deve ser alterado.
}
