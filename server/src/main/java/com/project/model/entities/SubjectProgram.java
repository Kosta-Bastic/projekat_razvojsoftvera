package com.project.model.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Data
public class SubjectProgram {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private StudyProgram studyProgram;
    @ManyToOne(fetch = FetchType.LAZY)
    private Subject subject;
    private Integer semester;
}
