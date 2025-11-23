package com.project.model.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data@Getter@Setter@AllArgsConstructor
public class StudentDTO {
    private Long idIndex;
    private Long idStudent;
    private String firstName;
    private String lastName;
    private int joinDate;
    private String studyProgram;
    private int number;
    private boolean activeIndex;
}
