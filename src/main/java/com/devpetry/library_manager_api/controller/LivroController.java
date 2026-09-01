package com.devpetry.library_manager_api.controller;

import com.devpetry.library_manager_api.dto.LivroRequestDTO;
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
    ResponseEntity<List<LivroEntity>> buscarLivros() {
        return ResponseEntity.ok(livroService.buscarTodos());
    }

    @GetMapping(path = "/livros/{livroId}")
    ResponseEntity<LivroEntity> buscarLivroPorId(@PathVariable Long livroId) {
        return ResponseEntity.ok(livroService.buscarPorId(livroId));
    }

    @PostMapping(path = "/livros")
    ResponseEntity<LivroEntity> cadastrarLivro(@RequestBody LivroRequestDTO dto) {
        LivroEntity livroSalvo = livroService.salvar(dto);
        return ResponseEntity.ok(livroSalvo);
    }

    @DeleteMapping(path = "/livros/{livroId}")
    ResponseEntity<Void> deletarLivro(@PathVariable Long livroId) {
        livroService.deletarPorId(livroId);
        return ResponseEntity.noContent().build();
    }
}
