package com.project.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data@Setter@Getter@AllArgsConstructor@NoArgsConstructor
public class AttendsClass {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private StudentIndex studentIndex;
	
	@ManyToOne
	private TeachesClass teachesClass;

}