package com.project.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Group {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private StudyProgram studyProgram;
	
	@ManyToMany
	private List<Subject> subjects;
}