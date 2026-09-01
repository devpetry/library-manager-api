package com.devpetry.library_manager_api.repository;

import com.devpetry.library_manager_api.model.AutorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<AutorEntity,Long> {
}
