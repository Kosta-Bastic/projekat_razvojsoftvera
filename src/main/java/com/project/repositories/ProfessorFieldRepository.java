package com.project.repositories;

import com.project.model.ProfessorField;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorFieldRepository extends JpaRepository<ProfessorField, Long> {
}
