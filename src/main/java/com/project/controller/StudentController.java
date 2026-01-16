package com.project.controller;

import com.project.model.dtos.*;
import com.project.model.entities.StudentIndex;
import com.project.model.entities.StudentInfo;
import com.project.repository.StudentIndexRepository;
import com.project.repository.StudyProgramRepository;
import com.project.service.EnrollingYearService;
import com.project.service.PaymentService;
import com.project.service.StudentInfoService;
import com.project.service.StudentProfileService;
import com.project.utils.CurrencyUtils;
import com.project.utils.ParseUtils;
import org.hibernate.engine.jdbc.Size;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin@RestController@RequestMapping(path="/student")
public class StudentController {

    @Autowired
    StudyProgramRepository studyProgramRepository;
    @Autowired
    StudentProfileService studentProfileService;
    @Autowired
    private StudentInfoService studentInfoService;
    @Autowired
    private PaymentService paymentService;
    @Autowired
    private EnrollingYearService enrollingYearService;

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
    @PostMapping(path="/highschool/{highschool}")
    public List<StudentDTO> getStudentProfileByHighSchool(@PathVariable String highschool){
        return studentInfoService.getByHighschool(highschool);
    }
    @PostMapping(path="/{studentIndexID}/pay")
    public PaymentDTO addPaymentForIndex(@PathVariable Long studentIndexID, double amount){
        return paymentService.newPayment(studentIndexID,amount,CurrencyUtils.getCourse());
    }
    @PostMapping(path="{studentIndexID}/payremaining")
    public PaymentDTO payRemainingPayment(@PathVariable Long studentIndexID){
        return paymentService.clearDebt(studentIndexID, CurrencyUtils.getCourse());
    }
    @PostMapping(path="{firstName} {lastName}")
    public Page<StudentDTO> getStudentInfoFromCredentials(@PathVariable String firstName, @PathVariable String lastName, @RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size){
        return studentInfoService.getByCredentials(firstName,lastName,page,size);
    }
    @PostMapping(path="{studentIndexID}/retriedyears")
    public List<EnrollingYearDTO> getRetriedYears(@PathVariable Long studentIndexID){
        return enrollingYearService.getRetriedYears(studentIndexID);
    }
}
