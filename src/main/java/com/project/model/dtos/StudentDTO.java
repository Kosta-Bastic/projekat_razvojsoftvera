package com.project.model.dtos;

import lombok.Data;

@Data
public class StudentDTO {
    private Long idIndeks;
    private Long idStudent;
    private String firstName;
    private String lastName;
    private int joinDate;
    private String studyProgram;
    private int broj;
    private boolean activeIndex;
}
