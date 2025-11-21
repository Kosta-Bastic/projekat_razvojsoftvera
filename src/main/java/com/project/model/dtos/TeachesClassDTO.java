package com.project.model.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TeachesClassDTO {

    private int id;
    private TeacherDTO teacher;
    private SubjectDTO subject;
    private String classType;
    private String sessionCount;
}