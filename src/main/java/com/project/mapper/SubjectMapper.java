package com.project.mapper;

import com.project.model.dtos.SubjectDTO;
import com.project.model.entities.Subject;
import org.springframework.stereotype.Component;

@Component
public class SubjectMapper {
    public SubjectDTO toSubjectDTO(Subject subject) {
        if (subject == null) return null;

        SubjectDTO subjectDTO = new SubjectDTO();

        subjectDTO.setId(subject.getId());
        subjectDTO.setName(subject.getName());
        subjectDTO.setStudyProgram(subject.getStudProgram().getName());
        subjectDTO.setSemester(subject.getSemester());
        subjectDTO.setLectureHours(subject.getLectureHours());
        subjectDTO.setExerciseHours(subject.getExerciseHours());
        subjectDTO.setPracticumHours(subject.getPracticumHours());
        subjectDTO.setMandatory(subject.isMandatory());
        subjectDTO.setLectureSessions(subject.getLectureSessions());
        subjectDTO.setExerciseSessions(subject.getExerciseSessions());

        return subjectDTO;
    }
}