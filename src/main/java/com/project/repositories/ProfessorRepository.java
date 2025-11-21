package com.project.repositories;

import com.project.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {

	List<Professor> findByEmailIn(List<String> emails);
}