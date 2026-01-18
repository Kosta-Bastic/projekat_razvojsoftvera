package com.project.mapper;

import com.project.model.dtos.StudentWebProfileDTO;
import com.project.model.entities.StudentWebProfile;
import org.springframework.stereotype.Component;

@Component
public class StudentWebProfileMapper {
    public static StudentWebProfileDTO toDTO(StudentWebProfile studentWebProfile) {
        if (studentWebProfile == null) {return null;}

        StudentWebProfileDTO studentWebProfileDTO = new StudentWebProfileDTO();
        studentWebProfileDTO.setActiveIndex(studentWebProfile.getActiveIndex());
        studentWebProfileDTO.setAttendsClasses(studentWebProfile.getAttendsClasses());

        return studentWebProfileDTO;
    }

    public static StudentWebProfile toEntity(StudentWebProfileDTO studentWebProfileDTO) {
        if (studentWebProfileDTO == null) {return null;}

        StudentWebProfile studentWebProfile = new StudentWebProfile();
        studentWebProfile.setActiveIndex(studentWebProfileDTO.getActiveIndex());
        studentWebProfile.setAttendsClasses(studentWebProfileDTO.getAttendsClasses());

        return studentWebProfile;
    }
}
