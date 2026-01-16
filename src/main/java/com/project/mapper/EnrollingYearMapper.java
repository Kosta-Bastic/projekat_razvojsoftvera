package com.project.mapper;

import com.project.model.dtos.EnrollingYearDTO;
import com.project.model.entities.EnrollingYear;
import com.project.model.entities.SchoolYear;
import com.project.model.entities.StudentIndex;
import org.springframework.stereotype.Component;

@Component
public class EnrollingYearMapper {
    public static EnrollingYearDTO toDTO(EnrollingYear enrollingYear) {
        EnrollingYearDTO dto = new EnrollingYearDTO();
        dto.setId(enrollingYear.getId());
        dto.setEnrollmentDate(enrollingYear.getEnrollmentDate());
        dto.setYearId(enrollingYear.getYear().getId());
        dto.setIndexId(enrollingYear.getIndex().getId());
        dto.setEnrollmentDate(enrollingYear.getEnrollmentDate());
        return dto;
    }
    public static EnrollingYear toEntity(EnrollingYearDTO enrollingYearDTO) {
        EnrollingYear entity = new EnrollingYear();
        entity.setId(enrollingYearDTO.getId());
        entity.setEnrollmentDate(enrollingYearDTO.getEnrollmentDate());
        //entity.setYear(new SchoolYear(enrollingYearDTO.getYearId()));
        //entity.setIndex(new StudentIndex(enrollingYearDTO.getIndexId()));
        entity.setEnrollmentDate(enrollingYearDTO.getEnrollmentDate());
        return entity;
    }
}
