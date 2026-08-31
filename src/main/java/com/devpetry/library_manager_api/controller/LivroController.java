package com.devpetry.library_manager_api.controller;

import com.devpetry.library_manager_api.model.LivroEntity;
import com.devpetry.library_manager_api.service.LivroService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LivroController {
    private final LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @GetMapping(path = "/livros")
    ResponseEntity<List<LivroEntity>> listarLivros() {
        return ResponseEntity.ok(livroService.listarTodos());
    }

    @GetMapping(path = "/livros/{id}")
    ResponseEntity<LivroEntity> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(livroService.buscarPorId(id));
    }

    @PostMapping(path = "/livros")
    ResponseEntity<LivroEntity> cadastrarLivro(@RequestBody LivroEntity livroEntity) {
        return ResponseEntity.ok(livroService.salvar(livroEntity));
    }

    @DeleteMapping(path = "/livros/{id}")
    ResponseEntity<Void> deletarLivro(@PathVariable Long id) {
        livroService.deletarPorId(id);
        return ResponseEntity.noContent().build();
    }
}
