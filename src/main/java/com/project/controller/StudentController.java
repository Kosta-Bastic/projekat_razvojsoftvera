package com.project.controller;

import com.project.model.dtos.StudentWebProfileDTO;
import com.project.model.entities.StudentIndex;
import com.project.model.entities.StudentInfo;
import com.project.model.dtos.StudentProfileDTO;
import com.project.repository.StudentIndexRepository;
import com.project.repository.StudyProgramRepository;
import com.project.service.StudentProfileService;
import com.project.utils.ParseUtils;
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
    @PostMapping(path="/profile/{studentIndexID}")
    public StudentProfileDTO getStudentProfile(@PathVariable Long studentIndexID){
        return studentProfileService.getStudentProfile(studentIndexID);
    }
    @PostMapping(path="/webprofile/{studenIndexID}")
    public StudentWebProfileDTO getStudentWebProfile(@PathVariable Long studenIndexID){
        return studentProfileService.getStudentWebProfile(studenIndexID);
    }
    @PostMapping(path="/webprofile/email")
    public StudentWebProfileDTO getStudentWebProfileByEmail(@RequestParam String email){
        String[] parsedEmail = ParseUtils.ParseEmail(email);
        if(parsedEmail != null){
            return studentProfileService.getStudentWebProfileByEmail(parsedEmail);
        }
        return null;
    }
}
