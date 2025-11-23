package com.project.controllers;

import com.project.model.StudentInfo;
import com.project.model.dtos.StudentProfileDTO;
import com.project.repositories.StudyProgramRepository;
import com.project.services.StudentProfileService;
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
