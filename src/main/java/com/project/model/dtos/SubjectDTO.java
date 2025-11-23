package com.project.model.dtos;
import lombok.*;

@Data@Getter@Setter@AllArgsConstructor@NoArgsConstructor
public class SubjectDTO {

    private Long id;
    private String name;
    private String studyProgram;
    private Integer semester;
    private Integer lectureHours;
    private Integer exerciseHours;
    private Integer practicumHours;
    private boolean mandatory;
    private Integer lectureSessions;
    private Integer exerciseSessions;
}
