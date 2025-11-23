package com.project.model.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Data
public class Professor {
	 
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Long id;
	 private String firstName;
	 private String lastName;
	 private String middleName;
	 private String email;
	 private String phoneNumber;
	 private String address;
	 @OneToMany(mappedBy = "professor")
	 private Set<ProfessorField> fields;
	 
	 private LocalDate dateOfBirth;
	 private Character gender;
	 private String jmbg;
}