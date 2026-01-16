package com.project.mapper;

import com.project.model.dtos.StudentProfileDTO;
import com.project.model.entities.StudentProfile;
import org.springframework.stereotype.Component;

@Component
public class StudentProfileMapper {
    private static StudentProfileDTO toDTO(StudentProfile studentProfile){
        if(studentProfile == null){return null;}

        StudentProfileDTO studentProfileDTO = new StudentProfileDTO();
        studentProfileDTO.setId(studentProfile.getId());
        studentProfileDTO.setIndex(studentProfile.getIndex());
        studentProfileDTO.setAttendsClasses(studentProfile.getAttendsClasses());
        studentProfileDTO.setRemainingClasses(studentProfile.getRemainingClasses());
        studentProfileDTO.setPassedClasses(studentProfile.getPassedClasses());
        return studentProfileDTO;
    }

    private static StudentProfile toEntity(StudentProfileDTO studentProfileDTO){
        if(studentProfileDTO == null){return null;}

        StudentProfile studentProfile = new StudentProfile();
        studentProfile.setId(studentProfileDTO.getId());
        studentProfile.setIndex(studentProfileDTO.getIndex());
        studentProfile.setAttendsClasses(studentProfileDTO.getAttendsClasses());
        studentProfile.setRemainingClasses(studentProfileDTO.getRemainingClasses());
        studentProfile.setPassedClasses(studentProfileDTO.getPassedClasses());
        return studentProfile;
    }

}
