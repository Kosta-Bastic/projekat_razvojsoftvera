package com.project.mapper;

import com.project.model.dtos.TeachesClassDTO;
import com.project.model.entities.TeachesClass;
import org.springframework.stereotype.Component;

@Component
public class TeachesClassMapper {
    private final ProfessorMapper professorMapper;
    private final SubjectMapper subjectMapper;

    public TeachesClassMapper(ProfessorMapper professorMapper, SubjectMapper subjectMapper) {
        this.professorMapper = professorMapper;
        this.subjectMapper = subjectMapper;
    }

    public TeachesClassDTO toTeachesClassDTO(TeachesClass teachesClass) {
        if (teachesClass == null) return null;

        TeachesClassDTO teachesClassDTO = new TeachesClassDTO();
        teachesClassDTO.setId(teachesClass.getId());
        teachesClassDTO.setTeacher(professorMapper.toProfessorDTO(teachesClass.getProfessor()));
        teachesClassDTO.setSubject(subjectMapper.toSubjectDTO(teachesClass.getSubject()));
        //teachesClassDTO.setClassType(null);
        //teachesClassDTO.setSessionCount(null);

        return teachesClassDTO;
    }
}