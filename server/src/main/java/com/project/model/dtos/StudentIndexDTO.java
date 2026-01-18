package com.project.model.dtos;

import lombok.*;

import java.time.LocalDate;

@Data@Getter@Setter@AllArgsConstructor@NoArgsConstructor
public class StudentIndexDTO {
    private Long idIndex;
    private Long StudentId;
    private LocalDate joinDate;
    private int year;
    private String studyProgram;
    private int number;
    private boolean activeIndex;
}
