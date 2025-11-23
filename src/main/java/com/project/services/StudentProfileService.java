package com.project.services;

import com.project.model.StudentIndex;
import com.project.model.dtos.StudentProfileDTO;
import com.project.model.dtos.StudentWebProfileDTO;
import com.project.repositories.AttendsClassRepository;
import com.project.repositories.StudentIndexRepository;
import com.project.repositories.StudentInfoRepository;
import com.project.repositories.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentProfileService {

    @Autowired
    StudentIndexRepository studentIndexRepository;
    @Autowired
    AttendsClassRepository attendsClassRepository;
    @Autowired
    SubjectRepository subjectRepository;
    @Autowired
    private StudentInfoRepository studentInfoRepository;

    public StudentProfileDTO getStudentProfile(Long indexId) {
        StudentProfileDTO ret = new StudentProfileDTO();
        StudentIndex studentIndex = studentIndexRepository.findById(indexId).get();
        ret.setIndex(studentIndex);
        ret.setAttendsClasses(attendsClassRepository.findAttendsClassForIndexActive(indexId));
        return ret;
    }
    public StudentWebProfileDTO getStudentWebProfile(Long indexId) {
        StudentWebProfileDTO ret = new StudentWebProfileDTO();
        StudentIndex studentIndex = studentIndexRepository.findById(indexId).get();
        Long studInfoId = studentIndex.getStudent().getId();
        ret.setActiveIndex(studentInfoRepository.getActiveIndex(studInfoId));
        ret.setAttendsClasses(attendsClassRepository.findAttendsClassForIndexActive(indexId));
        return ret;
    }
}
