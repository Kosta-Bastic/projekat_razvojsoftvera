package com.project.model.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @ManyToMany@JsonIgnore
    private List<Subject> subjects;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ProfessorWebProfileConnector>  professorWebProfileConnector;
}