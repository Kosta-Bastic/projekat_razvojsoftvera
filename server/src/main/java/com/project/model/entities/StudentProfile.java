package com.project.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @ManyToMany@JsonIgnore
    private List<Subject> remainingClasses;

    @ManyToMany@JsonIgnore
    private List<Subject> passedClasses;
}
