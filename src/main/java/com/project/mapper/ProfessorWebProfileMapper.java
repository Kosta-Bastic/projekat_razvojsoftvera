package com.project.mapper;

import com.project.model.dtos.*;
import com.project.model.entities.*;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;

@Component
public class ProfessorWebProfileMapper {
    public ProfessorWebProfileDTO professorWebToDTO(ProfessorWebProfile entity) {

        ProfessorWebProfileDTO professorWebProfileDTO = new ProfessorWebProfileDTO();
        professorWebProfileDTO.setId(entity.getId());
        professorWebProfileDTO.setSubjects(entity.getSubjects());
        professorWebProfileDTO.setAttendClasses(new HashMap<>(entity.getProfessorWebProfileConnector().get));
        return dto;
    }
}