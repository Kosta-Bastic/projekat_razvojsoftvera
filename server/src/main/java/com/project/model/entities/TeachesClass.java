package com.project.model.entities;

import jakarta.persistence.*;
import lombok.Data;

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

	@ManyToOne
	private SchoolYear schoolYear;
}
