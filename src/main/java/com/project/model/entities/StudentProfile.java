package com.project.model.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private StudentIndex index;

    @OneToMany
    private List<AttendsClass> attendsClasses;

    @ManyToMany
    private List<Subject> remainingClasses;
}
