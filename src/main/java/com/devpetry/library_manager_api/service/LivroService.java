package com.devpetry.library_manager_api.service;

import com.devpetry.library_manager_api.model.LivroEntity;
import com.devpetry.library_manager_api.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {
    @Autowired
    private LivroRepository livroRepository;

    public List<LivroEntity> listarTodos() {
        return livroRepository.findAll();
    }

    public LivroEntity buscarPorId(Long id) {
        return livroRepository.findById(id).orElseThrow(() -> new RuntimeException("Livro não  encontrado com id " + id));
    }

    public LivroEntity salvar(LivroEntity livro) {
        return livroRepository.save(livro);
    }

    public void deletarPorId(Long id) {
        livroRepository.deleteById(id);
    }
}
