package com.project.model.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ExamAttempt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private ExamRegistration examRegistration;
    private Integer beforeExamPoints;
    private Integer examPoints;
    private Integer grade; // 6-10 (ili 5-10 po tvom pravilu)
    private String note;
    private boolean anulled;
    private LocalDate date;
}
