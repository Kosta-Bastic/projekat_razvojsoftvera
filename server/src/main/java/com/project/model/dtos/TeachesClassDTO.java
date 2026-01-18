package com.project.model.dtos;

import lombok.*;

@Data@Getter@Setter@AllArgsConstructor@NoArgsConstructor
public class TeachesClassDTO {

    private Long id;
    private ProfessorDTO teacher;
    private SubjectDTO subject;
    //private String classType;
    //private String sessionCount;
}