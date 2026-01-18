package com.project.model.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentWebProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private StudentIndex activeIndex;

    @OneToMany(cascade = CascadeType.ALL)
    private List<AttendsClass> attendsClasses;
}