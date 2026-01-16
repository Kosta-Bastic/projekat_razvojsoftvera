package com.project.model.entities;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Time;
import java.util.Date;

@Entity
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Exam {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private Time startTime;
    private boolean finished;
    @ManyToOne
    private TeachesClass teachesClass;
    @ManyToOne
    private ExamTerm examTerm;
}
