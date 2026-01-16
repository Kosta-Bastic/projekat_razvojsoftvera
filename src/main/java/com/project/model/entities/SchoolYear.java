package com.project.model.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@Getter@Setter@AllArgsConstructor@NoArgsConstructor
public class SchoolYear {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private int year;
    private boolean active;
}
