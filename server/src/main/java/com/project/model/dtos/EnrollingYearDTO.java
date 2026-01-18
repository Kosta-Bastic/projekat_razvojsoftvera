package com.project.model.dtos;

import lombok.*;

import java.util.Date;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EnrollingYearDTO {
    private Long id;
    private Long indexId;
    private Long yearId;
    private Date enrollmentDate;
    private String note;
    private boolean retryingYear;
}
