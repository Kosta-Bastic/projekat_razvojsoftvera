package com.project.mapper;

import com.project.model.dtos.StudentIndexDTO;
import com.project.model.entities.StudentIndex;
import com.project.model.entities.StudentInfo;
import org.springframework.stereotype.Component;

@Component
public class StudentIndexMapper {
    public static StudentIndexDTO toDTO(StudentIndex si){
        if(si ==null)return null;

        StudentIndexDTO studentIndexDTO = new StudentIndexDTO();
        studentIndexDTO.setIdIndex(si.getId());
        studentIndexDTO.setStudentId(si.getStudent().getId());
        studentIndexDTO.setJoinDate(si.getValidFrom());
        studentIndexDTO.setYear(si.getValidFrom().getYear());
        studentIndexDTO.setStudyProgram(si.getStudyProgramShort());
        studentIndexDTO.setActiveIndex(si.isActive());

        return studentIndexDTO;
    }

    public static StudentIndex toEntity(StudentIndexDTO studentIndexDTO){
        if(studentIndexDTO ==null)return null;

        StudentIndex si = new StudentIndex();
        si.setId(studentIndexDTO.getStudentId());
        si.setNumber(studentIndexDTO.getNumber());
        si.setYear(studentIndexDTO.getYear());
        si.setWayOfFinancing(null);
        si.setActive(studentIndexDTO.isActiveIndex());
        si.setValidFrom(studentIndexDTO.getJoinDate());
        si.setStudent(new StudentInfo());
        si.getStudent().setId(studentIndexDTO.getStudentId());
        si.setStudyProgramShort(studentIndexDTO.getStudyProgram());
        si.setAchievedESPB(null);

        return si;
    }
}