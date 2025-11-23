package com.project.model.dtos;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data@Getter@Setter@AllArgsConstructor
public class SubjectDTO {

    private Integer id;
    private String name;
    private String studyProgram;
    private Integer semester;
    private Integer lectureHours;
    private Integer exerciseHours;
    private Integer practicumHours;
    private String mandatory;
    private Integer lectureSessions;
    private Integer exerciseSessions;
}
