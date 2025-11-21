package com.project.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"broj", "godina", "studProgramOznaka", "aktivan"}))
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
	private StudentPodaci student;
	
	@ManyToOne
	private StudyProgram studyProgram;   // na koji studijski program je upisan
	private Integer achievedESPB;
}