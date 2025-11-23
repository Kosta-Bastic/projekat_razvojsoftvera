package com.project.controller;

import com.project.model.entities.StudentInfo;
import com.project.model.dtos.StudentProfileDTO;
import com.project.repository.StudyProgramRepository;
import com.project.service.StudentProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin@RestController@RequestMapping(path="/student")
public class StudentController {

    @Autowired
    StudyProgramRepository studyProgramRepository;
    @Autowired
    StudentProfileService studentProfileService;

    @PostMapping(path="/add")
    public Long addNewStudentInfo(@RequestBody StudentInfo studentInfo){
        return null;
    }
    @PostMapping(path="profile/{studentIndexID}")
    public StudentProfileDTO getStudentProfile(@PathVariable Long studentIndexID){
        return studentProfileService.getStudentProfile(studentIndexID);
    }

}
