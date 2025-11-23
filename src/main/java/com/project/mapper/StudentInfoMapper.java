package com.project.mapper;

import com.project.model.dtos.StudentDTO;
import com.project.model.dtos.StudentProfileDTO;
import com.project.model.dtos.StudentWebProfileDTO;
import com.project.model.entities.AttendsClass;
import com.project.model.entities.StudentIndex;
import com.project.model.entities.StudentInfo;
import com.project.model.entities.Subject;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentInfoMapper {
    private final StudentIndexMapper studentIndexMapper;

    public StudentInfoMapper(StudentIndexMapper studentIndexMapper) {
        this.studentIndexMapper = studentIndexMapper;
    }

    public StudentProfileDTO toStudentProfileDTO(StudentInfo studentInfo, List<StudentIndex> indices, List<AttendsClass> attendsClasses, List<Subject> remainingClasses) {
        if (studentInfo == null) return null;

        StudentProfileDTO dto = new StudentProfileDTO();
        dto.setId(studentInfo.getId());
        dto.setFirstName(studentInfo.getFirstName());
        dto.setLastName(studentInfo.getLastName());
        dto.setMiddleName(studentInfo.getMiddleName());
        dto.setJmbg(studentInfo.getJmbg());
        dto.setDateOfBirth(studentInfo.getDateOfBirth());
        dto.setPlaceOfBirth(studentInfo.getPlaceOfBirth());
        dto.setCountryOfBirth(studentInfo.getCountryOfBirth());
        dto.setCitizenshipStatus(studentInfo.getCitizenshipStatus());
        dto.setNationality(studentInfo.getNationality());
        dto.setGender(studentInfo.getGender());
        dto.setAddress(studentInfo.getAddress());
        dto.setPlaceOfResidence(studentInfo.getPlaceOfResidence());
        dto.setPhoneNumber(studentInfo.getPhoneNumber());
        dto.setHomePhoneNumber(studentInfo.getHomePhoneNumber());
        dto.setEmail(studentInfo.getEmail());
        dto.setIDCardNumber(studentInfo.getIDCardNumber());
        dto.setIDCardProvider(studentInfo.getIDCardProvider());
        dto.setPlaceOfLiving(studentInfo.getPlaceOfLiving());
        dto.setAddressOfLiving(studentInfo.getAddressOfLiving());

        if (indices != null && !indices.isEmpty()) {
            dto.setIndex(indices.get(0));
        }

        dto.setAttendsClasses(attendsClasses);
        dto.setRemainingClasses(remainingClasses);

        return dto;
    }

    public StudentWebProfileDTO toStudentWebProfileDTO(StudentInfo studentInfo, StudentIndex activeIndex, List<AttendsClass> attendsClasses) {
        if (studentInfo == null) return null;

        StudentWebProfileDTO dto = new StudentWebProfileDTO();
        dto.setActiveIndex(new StudentIndex());
        dto.getActiveIndex().setStudent(new StudentInfo());
        dto.getActiveIndex().getStudent().setId(studentInfo.getId());
        dto.getActiveIndex().getStudent().setFirstName(studentInfo.getFirstName());
        dto.getActiveIndex().getStudent().setLastName(studentInfo.getLastName());
        dto.getActiveIndex().getStudent().setEmail(studentInfo.getEmail());
        dto.getActiveIndex().getStudent().setPhoneNumber(studentInfo.getPhoneNumber());
        dto.getActiveIndex().getStudent().setPlaceOfResidence(studentInfo.getPlaceOfResidence());

        dto.setActiveIndex(activeIndex);
        dto.setAttendsClasses(attendsClasses);

        return dto;
    }

    public StudentDTO toStudentDTO(StudentInfo studentInfo, StudentIndex activeIndex) {
        if (studentInfo == null || activeIndex == null) return null;
        return studentIndexMapper.toStudentDTO(activeIndex);
    }
}