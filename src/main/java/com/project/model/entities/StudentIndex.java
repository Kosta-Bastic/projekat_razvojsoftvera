package com.project.model.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"number", "year", "studyProgramShort", "active"}))
public class StudentIndex {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private int number;
	private int year;
	private String studyProgramShort;
	private String wayOfFinancing;
	private boolean active;
	private LocalDate validFrom;
	@ManyToOne
	private StudentInfo student;
	
	@ManyToOne
	private StudyProgram studyProgram;   // na koji studijski program je upisan
	private Integer achievedESPB;
}