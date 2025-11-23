package com.project.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class AttendsClass {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@ManyToOne	
	private StudentIndex studentIndex;
	
	@ManyToOne
	private TeachesClass teachesClass;

}