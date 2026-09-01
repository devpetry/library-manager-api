package com.devpetry.library_manager_api.dto;

public class LivroRequestDTO {
    private String titulo;
    private Long autorId;

    public LivroRequestDTO() {}

    public LivroRequestDTO(String titulo, Long autorId) {
        this.titulo = titulo;
        this.autorId = autorId;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Long getAutorId() {
        return autorId;
    }

    public void setAutorId(Long autorId) {
        this.autorId = autorId;
    }
}
