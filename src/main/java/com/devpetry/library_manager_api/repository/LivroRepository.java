package com.devpetry.library_manager_api.repository;

import com.devpetry.library_manager_api.model.LivroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<LivroEntity,Long> {
}
