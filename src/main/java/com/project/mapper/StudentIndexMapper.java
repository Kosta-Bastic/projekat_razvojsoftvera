package com.project.mapper;

import com.project.model.dtos.StudentDTO;
import com.project.model.entities.StudentIndex;
import com.project.model.entities.StudentInfo;
import org.springframework.stereotype.Component;

@Component
public class StudentIndexMapper {
    public StudentDTO toStudentDTO(StudentIndex si){
        if(si ==null)return null;

        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setIdIndex(si.getId());
        studentDTO.setJoinDate(si.getYear());
        studentDTO.setStudyProgram(si.getStudyProgramShort());
        studentDTO.setNumber(si.getNumber());
        studentDTO.setActiveIndex(si.isActive());

        if (si.getStudent() != null) {
            studentDTO.setIdStudent(si.getStudent().getId());
            studentDTO.setFirstName(si.getStudent().getFirstName());
            studentDTO.setLastName(si.getStudent().getLastName());
            studentDTO.setMiddleName(si.getStudent().getMiddleName());
        }

        return studentDTO;
    }
}