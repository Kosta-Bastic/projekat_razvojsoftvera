package com.project.model.entities;

import lombok.Data;

import jakarta.persistence.*;

@Entity
@Data
public class TeachesClass {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Professor professor;
	
	@ManyToOne
	private Subject subject;
}
