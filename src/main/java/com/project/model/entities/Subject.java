package com.project.model.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString(exclude = {"studProgram"})
public class Subject {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String password;
	private String name;
	private String description;
	private Integer espb;

	private Integer semester;
	private Integer lectureHours;
	private Integer exerciseHours;
	private Integer practicumHours;
	private Integer lectureSessions;
	private Integer exerciseSessions;
	@ManyToOne
	private StudyProgram studProgram;
	private boolean mandatory;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subject other = (Subject) obj;
		if (password == null) {
			return other.password == null;
		} else return password.equals(other.password);
	}
}