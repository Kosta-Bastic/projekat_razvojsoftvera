package com.project.mapper;

import com.project.model.dtos.*;
import com.project.model.entities.*;
import org.springframework.stereotype.Component;

@Component
public class ProfessorWebProfileMapper {
    public static ProfessorWebProfileDTO toDTO(ProfessorWebProfile entity) {
        if (entity == null) {return null;}

        ProfessorWebProfileDTO professorWebProfileDTO = new ProfessorWebProfileDTO();
        professorWebProfileDTO.setId(entity.getId());
        professorWebProfileDTO.setSubjects(entity.getSubjects());
        professorWebProfileDTO.setAttendClasses(entity.getProfessorWebProfileConnector());
        return professorWebProfileDTO;
    }

    public static ProfessorWebProfile toEntity(ProfessorWebProfileDTO entity) {
        if (entity == null) {return null;}

        ProfessorWebProfile pwp = new ProfessorWebProfile();
        pwp.setId(entity.getId());
        pwp.setSubjects(entity.getSubjects());
        pwp.setProfessorWebProfileConnector(entity.getAttendClasses());
        return pwp;
    }
}