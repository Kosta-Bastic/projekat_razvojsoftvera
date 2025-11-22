package com.project.model.entities;

import lombok.Data;

import jakarta.persistence.*;
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
	 private Set<ProfessorField> zvanja;
	 
	 private LocalDate dateOfBirth;
	 private Character pol;
	 private String jmbg;
}