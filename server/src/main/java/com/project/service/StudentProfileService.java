package com.project.service;

import com.project.mapper.SubjectMapper;
import com.project.model.dtos.StudentProfileDTO;
import com.project.model.dtos.StudentWebProfileDTO;
import com.project.model.dtos.SubjectDTO;
import com.project.model.entities.AttendsClass;
import com.project.model.entities.StudentIndex;
import com.project.model.entities.StudentProfile;
import com.project.repository.AttendsClassRepository;
import com.project.repository.StudentIndexRepository;
import com.project.repository.StudentInfoRepository;
import com.project.repository.SubjectRepository;
import com.project.utils.ParseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

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
    public Page<SubjectDTO> getAttendingClasses(Long indexId) {
        StudentProfileDTO profile = getStudentProfile(indexId);
        ArrayList<SubjectDTO> attendingClasses = new ArrayList<>();
        for (AttendsClass attendsClass : profile.getAttendsClasses()) {
            attendingClasses.add(SubjectMapper.toDTO(attendsClass.getTeachesClass().getSubject()));
        }
        return new PageImpl<>(attendingClasses);
    }
    public StudentWebProfileDTO getStudentWebProfile(Long indexId) {
        StudentWebProfileDTO ret = new StudentWebProfileDTO();
        StudentIndex studentIndex = studentIndexRepository.findById(indexId).get();
        Long studInfoId = studentIndex.getStudent().getId();
        ret.setActiveIndex(studentInfoRepository.getActiveIndex(studInfoId));
        ret.setAttendsClasses(attendsClassRepository.findAttendsClassForIndexActive(indexId));
        return ret;
    }
    public StudentWebProfileDTO getStudentWebProfileByEmail(String[] email) {
        StudentIndex si = studentIndexRepository.findStudentIndexByIndexData(email[3],Integer.parseInt(email[0]), Integer.parseInt(email[2]));
        return getStudentWebProfile(si.getId());
    }
}
