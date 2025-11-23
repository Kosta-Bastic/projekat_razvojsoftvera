package com.project.model.dtos;

import lombok.*;

@Data@Getter@Setter@AllArgsConstructor@NoArgsConstructor
public class StudentDTO {
    private Long idIndex;
    private Long idStudent;
    private String firstName;
    private String middleName;
    private String lastName;
    private int joinDate;
    private String studyProgram;
    private int number;
    private boolean activeIndex;
}
