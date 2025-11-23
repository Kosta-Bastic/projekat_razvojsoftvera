package com.project.mapper;

import com.project.model.dtos.ProfessorDTO;
import com.project.model.dtos.ProfessorWebProfileDTO;
import com.project.model.entities.Professor;
import com.project.model.entities.StudentIndex;
import com.project.model.entities.Subject;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class ProfessorMapper {
    public ProfessorDTO toProfessorDTO(Professor professor) {
        ProfessorDTO professorDTO = new ProfessorDTO();

        professorDTO.setId(professor.getId());
        professorDTO.setFirstName(professor.getFirstName());
        professorDTO.setLastName(professor.getLastName());
        professorDTO.setMiddleName(professor.getMiddleName());
        professorDTO.setEmail(professor.getEmail());
        professorDTO.setPhoneNumber(professor.getPhoneNumber());

        return professorDTO;
    }

    public Professor toProfessorEntity(ProfessorDTO professorDTO) {
        Professor professor = new Professor();

        professor.setId(professorDTO.getId());
        professor.setFirstName(professorDTO.getFirstName());
        professor.setLastName(professorDTO.getLastName());
        professor.setMiddleName(professorDTO.getMiddleName());
        professor.setEmail(professorDTO.getEmail());
        professor.setPhoneNumber(professorDTO.getPhoneNumber());

        return professor;
    }
}