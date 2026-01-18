package com.project.model.entities;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class StudyProgram {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String mark;  // RN, RM
    private String name;
    private Integer yearOfAccreditation;
    private String field;
    private Integer durationOfYear;
    private Integer durationOfSemester;
    private String studyType; // OAS - osnovne akademske studje, OSS - osnovne strukovne, MAS - master akademske studije
    private Integer espbInTotal;
}
