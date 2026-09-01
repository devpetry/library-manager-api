package com.devpetry.library_manager_api.controller;

import com.devpetry.library_manager_api.dto.AutorRequestDTO;
import com.devpetry.library_manager_api.model.AutorEntity;
import com.devpetry.library_manager_api.service.AutorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AutorController {
    private final AutorService autorService;

    public AutorController(AutorService autorService) {
        this.autorService = autorService;
    }
    
    @GetMapping(path = "/autores")
    ResponseEntity<List<AutorEntity>> buscarAutores() {
        return ResponseEntity.ok(autorService.buscarTodos());
    }

    @GetMapping(path = "/autores/{autorId}")
    ResponseEntity<AutorEntity> buscarAutorPorId(@PathVariable Long autorId) {
        return ResponseEntity.ok(autorService.buscarPorId(autorId));
    }

    @PostMapping(path = "/autores")
    ResponseEntity<AutorEntity> cadastrarAutor(@RequestBody AutorRequestDTO dto) {
        AutorEntity autorSalvo = autorService.salvar(dto);
        return ResponseEntity.ok(autorSalvo);
    }

    @DeleteMapping(path = "/autores/{autorId}")
    ResponseEntity<Void> deletarAutor(@PathVariable Long autorId) {
        autorService.deletarPorId(autorId);
        return ResponseEntity.noContent().build();
    }
}
