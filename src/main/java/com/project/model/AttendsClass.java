package com.project.model;

import lombok.Data;

import javax.persistence.*;

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