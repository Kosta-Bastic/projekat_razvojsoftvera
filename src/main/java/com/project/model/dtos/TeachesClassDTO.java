package com.project.model.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data@Getter@Setter@AllArgsConstructor
public class TeachesClassDTO {

    private int id;
    private TeacherDTO teacher;
    private SubjectDTO subject;
    private String classType;
    private String sessionCount;
}