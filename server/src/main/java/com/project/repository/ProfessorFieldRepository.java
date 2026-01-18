package com.project.repository;

import com.project.model.entities.ProfessorField;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorFieldRepository extends JpaRepository<ProfessorField, Long> {
}
