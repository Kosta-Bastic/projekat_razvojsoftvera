package com.project.model.dtos;

import com.project.model.entities.StudentIndex;
import com.project.model.entities.Subject;

import java.util.List;
import java.util.Map;

/*
 * entitet koji se vraca kada se nastavnik uloguje na veb servis
 * sadrži:
 *  - predmete koje nastavnik predaje u aktivnoj skolskoj godini 
 *  - spiskove studenata koji slusaju predmet
 */

public class TeacherWebProfileDTO {

	private List<Subject> subjects;
	private Map<Subject,List<StudentIndex>> attendClasses;

}