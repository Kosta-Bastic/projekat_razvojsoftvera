package com.project.model;

import lombok.Data;

import javax.persistence.*;

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
