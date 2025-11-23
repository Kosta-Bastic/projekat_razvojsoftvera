package com.project.model.dtos;

import com.project.model.entities.AttendsClass;
import com.project.model.entities.StudentIndex;
import com.project.model.entities.Subject;
import lombok.*;

import java.util.List;

/*
 * objekat ove kalse sadrzi sve podatke o studentu koji
 * se prikazuju u njegovom profilu  
 * 
 * - polozeni predmeti
 * - tok studija (upisi, obnove godina)
 * - predmete koje slusa
 * - prijavljeni ispiti
 * - uplate
 * 
 * - selektujemo preko indeksa, potrebno prikupiti podatke i o drugim indeksima
 * 
 */

@Data@Getter@Setter@AllArgsConstructor@NoArgsConstructor
public class StudentProfileDTO {

	private StudentIndex index;
	private List<AttendsClass> attendsClasses;
	private List<Subject> remainingClasses;
}