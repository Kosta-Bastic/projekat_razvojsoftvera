package com.project.repository;

import com.project.model.entities.HighSchool;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HighSchoolRepository extends JpaRepository<HighSchool, Long> {
    HighSchool findByNaziv(String naziv);
}