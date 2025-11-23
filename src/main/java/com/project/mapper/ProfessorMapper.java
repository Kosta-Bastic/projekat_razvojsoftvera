package com.project.mapper;

import com.project.model.dtos.ProfessorDTO;
import com.project.model.entities.Professor;
import org.springframework.stereotype.Component;

@Component
public class ProfessorMapper {
    public static ProfessorDTO toDTO(Professor professor) {
        ProfessorDTO professorDTO = new ProfessorDTO();

        professorDTO.setId(professor.getId());
        professorDTO.setFirstName(professor.getFirstName());
        professorDTO.setLastName(professor.getLastName());
        professorDTO.setMiddleName(professor.getMiddleName());
        professorDTO.setEmail(professor.getEmail());
        professorDTO.setPhoneNumber(professor.getPhoneNumber());

        return professorDTO;
    }

    public static Professor toEntity(ProfessorDTO professorDTO) {
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