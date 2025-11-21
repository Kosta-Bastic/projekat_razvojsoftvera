package com.project.model.dtos;

import com.project.model.AttendsClass;
import com.project.model.StudentIndex;
import lombok.Data;

import java.util.List;

@Data
public class StudentWebProfileDTO {

	private StudentIndex activeIndex;

	// za aktivnu skolsku godinu
	private List<AttendsClass> attendsClasses;
}
