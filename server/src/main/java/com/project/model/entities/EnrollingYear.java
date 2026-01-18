package com.project.model.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EnrollingYear {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private StudentIndex index;
    @ManyToOne
    private SchoolYear year;
    private Date enrollmentDate;
    private String note;
    private boolean retryingYear;
}
