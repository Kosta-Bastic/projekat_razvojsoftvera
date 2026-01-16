package com.project.service;

import com.project.mapper.StudentInfoMapper;
import com.project.model.dtos.StudentDTO;
import com.project.model.entities.StudentInfo;
import com.project.repository.StudentInfoRepository;
import org.hibernate.engine.jdbc.Size;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
            studentsDTO.add(StudentInfoMapper.toDTO(studentInfo));
        }
        return studentsDTO;
    }
    public Page<StudentDTO> getByCredentials(String firstName, String lastName, int page, int size){
        List<StudentDTO> studentsDTO = new ArrayList<>();
        Pageable pageable = PageRequest.of(page,size);
        List<StudentInfo> students = studentInfoRepository.findByName(firstName, lastName,pageable);
        for(StudentInfo studentInfo : students){
            studentsDTO.add(StudentInfoMapper.toDTO(studentInfo));
        }
        return new PageImpl<>(studentsDTO);
    }
}
