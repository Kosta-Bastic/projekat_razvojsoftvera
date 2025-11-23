package com.project.model.entities;

import com.project.model.dtos.StudentIndexDTO;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Map;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProfessorWebProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    private List<Subject> subjects;

    @OneToMany(mappedBy = "professorWebProfile", cascade = CascadeType.ALL)
    private List<ProfessorWebProfileConnector>  professorWebProfileConnector;
}