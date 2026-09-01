package com.devpetry.library_manager_api.service;

import com.devpetry.library_manager_api.dto.AutorRequestDTO;
import com.devpetry.library_manager_api.model.AutorEntity;
import com.devpetry.library_manager_api.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AutorService {
    @Autowired
    private AutorRepository autorRepository;

    public List<AutorEntity> buscarTodos(){
        return autorRepository.findAll();
    }

    public AutorEntity buscarPorId(Long autorId) {
        return autorRepository.findById(autorId)
                .orElseThrow(() -> new RuntimeException("Autor não encontrado com Id " + autorId));
    }

    public AutorEntity salvar(AutorRequestDTO dto) {
        AutorEntity autor = new AutorEntity(dto.getNome(), dto.getNacionalidade());
        return autorRepository.save(autor);
    }

    public void deletarPorId(Long autorId) {
        autorRepository.deleteById(autorId);
    }
}
