package com.project.model.entities;

import jakarta.persistence.*;
import lombok.*;


@Entity@Data@Getter@Setter@AllArgsConstructor@NoArgsConstructor
public class HighSchool {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type;
}
