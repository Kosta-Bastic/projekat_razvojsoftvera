package com.project.mapper;

import com.project.model.dtos.SubjectDTO;
import com.project.model.entities.StudyProgram;
import com.project.model.entities.Subject;
import org.springframework.stereotype.Component;

@Component
public class SubjectMapper {
    public static SubjectDTO toDTO(Subject subject) {
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
    public static Subject toEntity(SubjectDTO subjectDTO) {
        if (subjectDTO == null) return null;

        Subject subject = new Subject();

        subject.setId(subjectDTO.getId());
        subject.setName(subjectDTO.getName());
        subject.setStudProgram(new StudyProgram());
        subject.getStudProgram().setName(subjectDTO.getStudyProgram());
        subject.setSemester(subjectDTO.getSemester());
        subject.setLectureHours(subjectDTO.getLectureHours());
        subject.setExerciseHours(subjectDTO.getExerciseHours());
        subject.setPracticumHours(subjectDTO.getPracticumHours());
        subject.setMandatory(subjectDTO.isMandatory());
        subject.setLectureSessions(subjectDTO.getLectureSessions());
        subject.setExerciseSessions(subjectDTO.getExerciseSessions());

        return subject;
    }
}