package com.project.model.dtos;

import com.project.model.entities.ProfessorWebProfileConnector;
import com.project.model.entities.StudentIndex;
import com.project.model.entities.Subject;
import lombok.*;

import java.util.List;

/*
 * entitet koji se vraca kada se nastavnik uloguje na veb servis
 * sadrži:
 *  - predmete koje nastavnik predaje u aktivnoj skolskoj godini 
 *  - spiskove studenata koji slusaju predmet
 */
@Data@Getter@Setter@AllArgsConstructor@NoArgsConstructor
public class ProfessorWebProfileDTO {
    private Long id;
	private List<Subject> subjects;
	private List<ProfessorWebProfileConnector> attendClasses;

}