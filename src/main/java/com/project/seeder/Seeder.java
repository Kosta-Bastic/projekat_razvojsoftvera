package com.project.seeder;

import com.project.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Seeder implements CommandLineRunner {

    @Autowired
    private StudyProgramRepository studyProgramRepository;
    @Autowired
    private SubjectRepository subjectRepository;
    @Autowired
    private ProfessorRepository professorRepository;
    @Autowired
    private ProfessorFieldRepository professorFieldRepository;
    @Autowired
    private StudentInfoRepository studentInfoRepository;
    @Autowired
    private StudentIndexRepository studentIndexRepository;
    @Autowired
    private TeachesClassRepository teachesClassRepository;
    @Autowired
    private AttendsClassRepository attendsClassRepository;
    @Autowired
    private EnrollingYearRepository enrollingYearRepository;

    @Override
    public void run(String... args) throws Exception {

    }
}
