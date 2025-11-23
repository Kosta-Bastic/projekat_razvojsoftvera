package com.project.service;

import com.project.model.dtos.SubjectDTO;
import com.project.model.entities.Subject;
import com.project.repository.StudyProgramRepository;
import com.project.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectService {
    @Autowired
    SubjectRepository subjectRepository;
    @Autowired
    StudyProgramRepository studyProgramRepository;
    public List<SubjectDTO > getAllSubjectsOnStudyProgram(String mark) {
            List<SubjectDTO> subjects = new ArrayList<>();
            List<Subject> allSubjects = studyProgramRepository.getSubjectsByMark(mark);
            for (Subject subject : allSubjects) {
                //subjects.add(SubjectMapper.toDTO(subject));
            }
            return subjects;
    }
}
