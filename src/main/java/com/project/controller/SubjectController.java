package com.project.controller;

import com.project.model.dtos.SubjectDTO;
import com.project.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path="/subject")
public class SubjectController {
    @Autowired
    SubjectService subjectService;
    @PostMapping(path="{mark}")
    public List<SubjectDTO> getSubjectsByMark(@PathVariable String mark) {
        return subjectService.getAllSubjectsOnStudyProgram(mark);
    }
}
