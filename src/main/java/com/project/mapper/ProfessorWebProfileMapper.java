package com.project.mapper;

import com.project.model.dtos.*;
import com.project.model.entities.*;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;

@Component
public class ProfessorWebProfileMapper {
    public static ProfessorWebProfileDTO toProfessorWebDTO(ProfessorWebProfile entity) {
        if (entity == null) {return null;}

        ProfessorWebProfileDTO professorWebProfileDTO = new ProfessorWebProfileDTO();
        professorWebProfileDTO.setId(entity.getId());
        professorWebProfileDTO.setSubjects(entity.getSubjects());
        professorWebProfileDTO.setAttendClasses(entity.getProfessorWebProfileConnector());
        return professorWebProfileDTO;
    }

    public static ProfessorWebProfile toProfessorWeb(ProfessorWebProfileDTO entity) {
        if (entity == null) {return null;}

        ProfessorWebProfile pwp = new ProfessorWebProfile();
        pwp.setId(entity.getId());
        pwp.setSubjects(entity.getSubjects());
        pwp.setProfessorWebProfileConnector(entity.getAttendClasses());
        return pwp;
    }
}