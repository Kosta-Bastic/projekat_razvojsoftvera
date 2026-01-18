package com.project.seeder;

import com.project.model.entities.StudentInfo;
import com.project.model.entities.StudyProgram;
import com.project.repository.StudentInfoRepository;
import com.project.repository.StudyProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class Seeder implements CommandLineRunner {

    @Autowired
    private StudyProgramRepository studyProgramRepository;

    @Autowired
    private StudentInfoRepository studentInfoRepository;

    @Override
    public void run(String... args) throws Exception {
        if (studyProgramRepository.count() == 0) {
            StudyProgram sp = new StudyProgram();
            sp.setMark("RI");
            sp.setName("Računarska Inženjerska Struka");
            sp.setYearOfAccreditation(2018);
            sp.setField("Informatika");
            sp.setDurationOfYear(3);
            sp.setDurationOfSemester(6);
            sp.setStudyType("OAS");
            sp.setEspbInTotal(180);
            studyProgramRepository.save(sp);
        }

        if (studentInfoRepository.count() == 0) {
            StudentInfo s = new StudentInfo();
            s.setFirstName("Marko");
            s.setLastName("Markovic");
            s.setMiddleName("Petrovic");
            s.setJmbg("0101990712345");
            s.setDateOfBirth(LocalDate.of(2000, 1, 1));
            s.setPlaceOfBirth("Beograd");
            s.setPlaceOfResidence("Beograd");
            s.setCountryOfBirth("Serbia");
            s.setCitizenshipStatus("Serbian");
            s.setNationality("Serbian");
            s.setGender('M');
            s.setAddress("Bulevar 1");
            s.setPhoneNumber("+381601234567");
            s.setEmail("marko@mail.local");
            studentInfoRepository.save(s);
        }
    }
}