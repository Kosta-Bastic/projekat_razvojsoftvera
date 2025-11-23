package com.project.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class ProfessorField {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private LocalDate dateOfChoice;  // ili reizbora
	private String scientificField;  // sifarnik na klijentu - tabela u bazi bez veze
	private String specificScientificField;  // sifarnik na klijentu - tabela u bazi bez veze
	private String field;   // sifarnik na klijentu - tabela u bazi bez veze
	private boolean active;
	@ManyToOne
	private Professor professor;
}