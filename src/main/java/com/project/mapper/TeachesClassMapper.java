package com.project.mapper;

import com.project.model.dtos.TeachesClassDTO;
import com.project.model.entities.TeachesClass;
import org.springframework.stereotype.Component;

@Component
public class TeachesClassMapper {


    public static TeachesClassDTO toDTO(TeachesClass teachesClass) {
        if (teachesClass == null) return null;

        TeachesClassDTO teachesClassDTO = new TeachesClassDTO();
        teachesClassDTO.setId(teachesClass.getId());
        teachesClassDTO.setTeacher(ProfessorMapper.toDTO(teachesClass.getProfessor()));
        teachesClassDTO.setSubject(SubjectMapper.toDTO(teachesClass.getSubject()));
        //teachesClassDTO.setClassType(null);
        //teachesClassDTO.setSessionCount(null);

        return teachesClassDTO;
    }

    public static TeachesClass toEntity(TeachesClassDTO teachesClassDTO) {
        if (teachesClassDTO == null) return null;

        TeachesClass teachesClass = new TeachesClass();
        teachesClass.setId(teachesClassDTO.getId());
        teachesClass.setProfessor(ProfessorMapper.toEntity(teachesClassDTO.getTeacher()));
        teachesClass.setSubject(SubjectMapper.toEntity(teachesClassDTO.getSubject()));

        return teachesClass;
    }
}