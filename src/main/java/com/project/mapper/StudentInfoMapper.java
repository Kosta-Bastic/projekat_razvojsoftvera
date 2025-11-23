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
    public static StudentDTO toStudentDTO(StudentInfo si){
        if(si ==null)return null;

        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(si.getId());
        studentDTO.setFirstName(si.getFirstName());
        studentDTO.setLastName(si.getLastName());
        studentDTO.setMiddleName(si.getMiddleName());
        studentDTO.setJmbg(si.getJmbg());
        studentDTO.setDateOfBirth(si.getDateOfBirth());
        studentDTO.setPlaceOfBirth(si.getPlaceOfBirth());
        studentDTO.setPlaceOfResidence(si.getPlaceOfResidence());
        studentDTO.setCitizenshipStatus(si.getCitizenshipStatus());
        studentDTO.setNationality(si.getNationality());
        studentDTO.setGender(si.getGender());
        studentDTO.setAddress(si.getAddress());
        studentDTO.setPhoneNumber(si.getPhoneNumber());
        studentDTO.setHomePhoneNumber(si.getHomePhoneNumber());
        studentDTO.setEmail(si.getEmail());
        studentDTO.setPlaceOfLiving(si.getPlaceOfLiving());
        studentDTO.setAddressOfLiving(si.getAddressOfLiving());

        return studentDTO;
    }

    public static StudentInfo toStudentInfo(StudentDTO studentDTO) {
        if(studentDTO ==null)return null;

        StudentInfo studentInfo = new StudentInfo();
        studentInfo.setId(studentDTO.getId());
        studentInfo.setFirstName(studentDTO.getFirstName());
        studentInfo.setLastName(studentDTO.getLastName());
        studentInfo.setMiddleName(studentDTO.getMiddleName());
        studentInfo.setJmbg(studentDTO.getJmbg());
        studentInfo.setDateOfBirth(studentDTO.getDateOfBirth());
        studentInfo.setPlaceOfBirth(studentDTO.getPlaceOfBirth());
        studentInfo.setPlaceOfResidence(studentDTO.getPlaceOfResidence());
        studentInfo.setCitizenshipStatus(studentDTO.getCitizenshipStatus());
        studentInfo.setNationality(studentDTO.getNationality());
        studentInfo.setGender(studentDTO.getGender());
        studentInfo.setAddress(studentDTO.getAddress());
        studentInfo.setPhoneNumber(studentDTO.getPhoneNumber());
        studentInfo.setHomePhoneNumber(studentDTO.getHomePhoneNumber());
        studentInfo.setEmail(studentDTO.getEmail());
        studentInfo.setPlaceOfLiving(studentDTO.getPlaceOfLiving());
        studentInfo.setAddressOfLiving(studentDTO.getAddressOfLiving());
        studentInfo.setIDCardNumber(null);
        studentInfo.setIDCardProvider(null);

        return studentInfo;
    }
}