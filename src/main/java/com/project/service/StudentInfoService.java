package com.project.service;

import com.project.mapper.StudentInfoMapper;
import com.project.model.dtos.StudentDTO;
import com.project.model.entities.StudentInfo;
import com.project.repository.StudentInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentInfoService {
    @Autowired
    private StudentInfoRepository studentInfoRepository;

    public List<StudentDTO> getByHighschool(String highschool){
        List<StudentDTO> studentsDTO = new ArrayList<>();
        List<StudentInfo> students = studentInfoRepository.findByHighSchool(highschool);
        for(StudentInfo studentInfo : students){
//            studentsDTO.add(StudentInfoMapper.toDTO(studentInfo));
        }
        return studentsDTO;
    }
    public Page<StudentDTO> getByCredentials(String firstName, String lastName){
        List<StudentDTO> studentsDTO = new ArrayList<>();
        List<StudentInfo> students = studentInfoRepository.findByName(firstName, lastName);
        for(StudentInfo studentInfo : students){
            //studentsDTO.add(StudentInfoMapper.toDTO(studentInfo));
        }
        return new PageImpl<>(studentsDTO);
    }
}
