package com.devpetry.library_manager_api.service;

import com.devpetry.library_manager_api.dto.LivroRequestDTO;
import com.devpetry.library_manager_api.model.AutorEntity;
import com.devpetry.library_manager_api.model.LivroEntity;
import com.devpetry.library_manager_api.repository.AutorRepository;
import com.devpetry.library_manager_api.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class LivroService {
    @Autowired
    private LivroRepository livroRepository;
    @Autowired
    private AutorRepository autorRepository;

    public List<LivroEntity> buscarTodos() {
        return livroRepository.findAll();
    }

    public LivroEntity buscarPorId(Long livroId) {
        return livroRepository.findById(livroId)
                .orElseThrow(() -> new RuntimeException("Livro não  encontrado com Id " + livroId));
    }

    public LivroEntity salvar(LivroRequestDTO dto) {
        AutorEntity autor = autorRepository.findById(dto.getAutorId())
                .orElseThrow(() -> new RuntimeException("Autor não encontrado"));
        LivroEntity livro = new LivroEntity(dto.getTitulo(), autor);
        return livroRepository.save(livro);
    }

    public void deletarPorId(Long livroId) {
        livroRepository.deleteById(livroId);
    }
}
