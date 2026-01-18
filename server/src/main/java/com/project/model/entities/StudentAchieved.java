package com.project.model.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentAchieved {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private StudentIndex studentIndex;

    @ManyToOne
    private PEObligations PEObligations;
    private Integer achievedPoints;
    private LocalDate datum;
    private String note;
}
