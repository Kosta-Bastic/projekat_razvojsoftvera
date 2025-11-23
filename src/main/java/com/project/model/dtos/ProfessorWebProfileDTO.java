package com.project.model.dtos;

import com.project.model.entities.StudentIndex;
import com.project.model.entities.Subject;
import lombok.*;

import java.util.List;
import java.util.Map;

/*
 * entitet koji se vraca kada se nastavnik uloguje na veb servis
 * sadrži:
 *  - predmete koje nastavnik predaje u aktivnoj skolskoj godini 
 *  - spiskove studenata koji slusaju predmet
 */
@Data@Getter@Setter@AllArgsConstructor@NoArgsConstructor
public class ProfessorWebProfileDTO {

	private List<Subject> subjects;
	private Map<Subject,List<StudentIndex>> attendClasses;

}