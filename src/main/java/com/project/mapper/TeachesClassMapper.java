package com.project.mapper;

import com.project.model.dtos.TeachesClassDTO;
import com.project.model.entities.TeachesClass;
import org.springframework.stereotype.Component;

@Component
public class TeachesClassMapper {
    public static TeachesClassDTO toTeachesClassDTO(TeachesClass teachesClass) {
        if (teachesClass == null) return null;

        TeachesClassDTO teachesClassDTO = new TeachesClassDTO();
        teachesClassDTO.setId(teachesClass.getId());
        teachesClassDTO.setTeacher(ProfessorMapper.toProfessorDTO(teachesClass.getProfessor()));
        teachesClassDTO.setSubject(SubjectMapper.toSubjectDTO(teachesClass.getSubject()));
        //teachesClassDTO.setClassType(null);
        //teachesClassDTO.setSessionCount(null);

        return teachesClassDTO;
    }

    public static TeachesClass toTeachesClass(TeachesClassDTO teachesClassDTO) {
        if (teachesClassDTO == null) return null;

        TeachesClass tc = new TeachesClass();
        tc.setId(teachesClassDTO.getId());
        tc.setProfessor(ProfessorMapper.toProfessorEntity(teachesClassDTO.getTeacher()));
        tc.setSubject(SubjectMapper.toSubject(teachesClassDTO.getSubject()));
        //teachesClassDTO.setClassType(null);
        //teachesClassDTO.setSessionCount(null);

        return tc;
    }
}